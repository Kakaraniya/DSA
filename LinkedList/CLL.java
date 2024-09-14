package LinkedList;

public class CLL {
    private Node head;
    private Node tail;
    CLL(){

    }
    private class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public void display(){
        Node node = head;
        if(head == null){
            System.out.println("ll is empty");
            return;
        }
        do{
            System.out.print(node.val+" -> ");
            node = node.next;
        }while(node!=head);
        System.out.println(" Head ->");
    }
    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        head = node;
        return;
    }
    public void delete(int val){

        Node node = head;
        if(node.val == val){
            tail.next = head.next;
            head = head.next;
            return;
        }
        if(head == null){
            return;
        }
        if(head == tail){
            if(head.val == val){
                head = null;
                tail = null;
            }
            return;
        }
        do{
            Node n = node.next;
            if(n.val == val){
                node.next = n.next;
                return;
            }
        }while(node != head);

    }
}
