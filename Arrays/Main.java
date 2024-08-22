package Arrays;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(43);
        list.insertFirst(3);
        list.insertFirst(22);
        list.insertFirst(12);
        list.insertFirst(4);
        list.display();
        list.insertLast(777);
        list.display();
        list.deleteFirst();
        list.deleteFirst();
        list.display();
        list.insert(1000,1);
        list.display();
        list.deleteLast();
        list.display();
    }
}
