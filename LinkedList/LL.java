package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }
    private class Node{
        private int val;
        private Node next;
        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail==null)
            tail = head;
        size++;
        return;
    }
    public void insertLast(int val){
        if (head == null)
            insertFirst(val);
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int index, int val){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i<index; i++){
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

    }
    public int deleteFirst(){
        int value = head.val;
        if(head == tail){
            tail = null;
        }
        head = head.next;

        size--;
        return value;
    }
    public int deleteLast(){
        if(head == tail)
            return deleteFirst();
        Node temp = head;
        for(int i = 1 ; i < size-1; i++){
            temp = temp.next;
        }
        int value = tail.val;
        tail = temp;
        temp.next = null;
        size--;
        return value;
    }
    public int delete(int index){
        if(index == 0)
            return deleteFirst();
        if(index == size - 1)
            return deleteLast();
        Node temp = head;
        for(int i = 1; i< index ; i++){
            temp = temp.next;
        }
        int value = temp.next.val;
        temp.next = temp.next.next;
        size--;
        return value;
    }

    public Node findNode(int value){
        Node node = head;
        while(node != null){
            if(node.val == value)
                return node;
            node = node.next;
        }
        return null;
    }
    public Node getNode(int index){
        Node node = head;
        for(int i = 1 ; i<=index; i++){
            node = node.next;
        }
        return node;
    }
    public void display(){
        if(head == null){
            System.out.println("linked list is empty");
            return;
        }
        Node temp = head;
        for(int i = 0; i<size ; i++){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("size = " +size);
        return;
    }
    public void insertRect(int index, int val){
        head = insertRect(index, val, head);
    }
    private Node insertRect(int index, int val, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size ++;
            return temp;
        }
        node.next = insertRect(index-1, val, node.next);
        return node;
    }
    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }
    private void bubbleSort(int row, int col){
        if (row == 0) {
            return;
        }
        if(col<row){
            Node first = getNode(col);
            Node second = getNode(col+1);
            if(first.val > second.val){
                if(first == head){
                    first.next = second.next;
                    second.next = first;
                    head = second;
                } else if (second == tail) {
                    Node prev = getNode(col - 1);
                    prev.next = second;
                    second.next = first;
                    first.next = null;
                    tail = first;
                }else{
                    Node prev = getNode(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;

                }
            }
            bubbleSort(row,col+1);
        }
        else{
            bubbleSort(row-1, 0);
        }
    }

    private void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    // https://leetcode.com/problems/remove-duplicates-from-sorted-list
    public void duplicates() {
        Node node = head;

        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    // in place reversal of linked list
    // google, microsoft, apple, amazon: https://leetcode.com/problems/reverse-linked-list/
    public void reverse() {
        if (size < 2) {
            return;
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev;
    }

    // https://leetcode.com/problems/merge-two-sorted-lists/submissions/
    public static LL merge(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while (f != null && s != null) {
            if (f.val < s.val) {
                ans.insertLast(f.val);
                f = f.next;
            } else {
                ans.insertLast(s.val);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertLast(f.val);
            f = f.next;
        }

        while (s != null) {
            ans.insertLast(s.val);
            s = s.next;
        }

        return ans;
    }
}
