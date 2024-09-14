package OOP.AccessModifierTryals;

//         │ Class │ Package │ Subclass │ Subclass │ World
//         │       │         │(same pkg)│(diff pkg)│(diff pkg & not subclass)
//public   │   +   │    +    │    +     │     +    │   +
//protected│   +   │    +    │    +     │     +    │
//no modifi│   +   │    +    │    +     │          │
//private  │   +   │         │          │          │

public class Main {
    public static void main(String[] args) {
        PrivateEg p = new PrivateEg();
        p.method();
        System.out.println(p.num);
    }
}
