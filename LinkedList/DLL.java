package LinkedList;

public class DLL {
    private Node head;
    private class Node{
        private int val;
        private Node next;
        private Node prev;
        Node(int value){
            this.val = value;
        }
        Node(int value, Node nextNode, Node prevNode){
            this.val = value;
            this.next = nextNode;
            this.prev = prevNode;
        }
    }

    public void display(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.val+" <-> ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("In reverse order:");
        while(last != null){
            System.out.print(last.val+" <-> ");
            last = last.prev;
        }
        return;
    }
    public DLL.Node findNode(int value){
        DLL.Node node = head;
        while(node != null){
            if(node.val == value)
                return node;
            node = node.next;
        }
        return null;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            node.next = null;
            node.prev = null;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
        return;
    }
    public void insertLast(int value){
        if(head == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        Node last = head;
        while(last.next != null)
            last = last.next;
        last.next = node;
        node.next = null;
        node.prev = last;

    }
    public void insertAfter(int beforeValue, int value){
        Node beforeNode = findNode(beforeValue);
        Node node = new Node(value);
        node.next = beforeNode.next;
        node.prev = beforeNode;
        node.next.prev = node;
        beforeNode.next = node;
    }

}
