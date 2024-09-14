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
}
