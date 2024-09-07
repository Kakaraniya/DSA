package OOP.Generics;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value
    private CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    private void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++)
            temp[i] = data[i];
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private int remove() {
        int removed = data[--size];
        return removed;
    }

    private int get(int index) {
        return data[index];
    }

    private int size() {
        return size;
    }

    private void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        for (int i = 0; i < 14; i++)
            list.add(2 * i);
        System.out.println(list);
    }
}