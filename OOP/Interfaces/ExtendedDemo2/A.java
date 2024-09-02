package OOP.Interfaces.ExtendedDemo2;

public interface A {
    // static interface methods should always have a body
    // call via the interface name
    static void greeting() {
        System.out.println("Hey I am static method");
    }

    default void fun(){
        System.out.println("in class A");
    }
}