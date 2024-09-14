package LinkedList;

;

public class Main {
    public static void main(String[] args) {
       LL list = new LL();
       list.insertFirst(20);
       list.insertFirst(30);
       list.insertLast(10);
       list.insertLast(1);
       list.display();
       list.delete(2);
       list.display();
    }
}
