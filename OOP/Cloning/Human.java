package OOP.Cloning;

public class Human implements Cloneable{
    int age;//primitive datatype
    String name;//non primitive
    int[] arr;
    public Human(int age, String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{1, 2, 3, 4, 5};
    }
    //this is shallow clonning i.e. if you chage the non primitive data type of twin obj then main obj also changes
//    public Object clone() throws CloneNotSupportedException{
//        return super.clone();
//    }
    // this is deep cloning
    @Override
    public Object clone() throws CloneNotSupportedException{
        Human twin = (Human)super.clone();
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }

}
