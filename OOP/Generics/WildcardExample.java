package OOP.Generics;

import java.util.Arrays;
import java.util.List;

public class WildcardExample<T extends Number> {

        private Object[] data;
        private static int DEFAULT_SIZE = 10;
        private int size = 0; // also working as index value
        public WildcardExample() {
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

        public T remove() {
            T removed = (T)data[--size];
            return removed;
        }

        public T get(int index) {
            return (T)data[index];
        }

        private int size() {
            return size;
        }

        public void set(int index, T value) {
            data[index] = value;
        }

        @Override
        public String toString() {
            return "CustomArrayList{" +
                    "data=" + Arrays.toString(data) +
                    ", size=" + size +
                    '}';
        }
    public void getList(List<? extends Number> list) {
        // do something
    }


    public static void main(String[] args) {
            WildcardExample<Integer> list = new WildcardExample<>();
            for (int i = 0; i < 14; i++)
                list.add( i);
            System.out.println(list);
            System.out.println(list.remove());
            System.out.println(list.get(10));
            list.set(16,16);
            System.out.println(list);
        }
    }

