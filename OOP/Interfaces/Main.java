package OOP.Interfaces;

public class Main {
    public static void main(String[] args){
        Engine car = new Car();
        // car.a; this gives error because you are providing object
        // reference of Engine and var a in there in class Car. what vars and methods to use are decided by obj ref
        // and which version of method to use is decided by the constructor.
        car.acc();
        car.start();
        car.stop();
        Media carMedia = new Car();
        carMedia.stop();    //here is says engine stop but we want music stop.


        NiceCar carr = new NiceCar();

        carr.start();
        carr.startMusic();
        carr.upgradeEngine();
        carr.start();
    }
}
