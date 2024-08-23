package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Testing {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        al.add(23);
        al.add(45);
        al.add(55);
        list.add(al);
        System.out.println(list.size());
        System.out.println(list.get(0));
    }
}
