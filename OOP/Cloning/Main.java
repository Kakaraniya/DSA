package OOP.Cloning;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human nandini = new Human(19, "nandini kakarnaiya");
        Human twin = (Human) nandini.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(nandini.arr));
    }


}
