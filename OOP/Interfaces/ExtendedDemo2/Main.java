package OOP.Interfaces.ExtendedDemo2;

public class Main implements A, B {
    @Override
    public void greet() {
        System.out.println("greet");
    }

    public void fun(){
        System.out.println("i am in main class");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();

        obj.greet();
        obj.fun();
    }
}