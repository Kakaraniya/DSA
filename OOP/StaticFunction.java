package OOP;

public class StaticFunction {
    public static void main(String[] args) {


        StaticFunction funn = new StaticFunction();
        funn.fun2();
        fun();

    }
    static void fun() {
//        greeting(); // you cant use this because it requires an instance


        // hence, here I am referencing it
        System.out.println("inside fun()");
        StaticFunction obj = new StaticFunction();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    // we know that something which is not static, belongs to an object
    void greeting() {

        System.out.println("Hello world");
    }
}
