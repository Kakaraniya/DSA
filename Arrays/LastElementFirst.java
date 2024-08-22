package Arrays;

import java.util.ArrayList;

public class LastElementFirst {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(100);
        int N = list.size();
        System.out.println(list);
        System.out.println(createList(list,N));
    }
    static ArrayList createList(ArrayList<Integer> list, int N ){
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(list.get(N-1));
        for(int i = 1; i<N-1; i++){
            list2.add(list.get(i));
        }

        return list2;
    }
}
