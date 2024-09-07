package OOP.Generics;

import java.util.Arrays;

public class CustomGenArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value
    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    private void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++)
            temp[i] = data[i];
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private T remove() {
        T removed = (T)data[--size];
        return removed;
    }

    private T get(int index) {
        return (T)data[index];
    }

    private int size() {
        return size;
    }

    private void set(int index, T value) {
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
        CustomGenArrayList<String> list = new CustomGenArrayList();
        for (int i = 0; i < 14; i++)
            list.add("letter"+ i);
        System.out.println(list);
        System.out.println(list.remove());
        System.out.println(list.get(10));
        list.set(16,"16");
        System.out.println(list);
    }
}
