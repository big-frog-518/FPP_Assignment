package day10.q1;

import java.util.Arrays;

/**
 * @Author Jinxu Zheng
 * @Date 6/12/2023
 **/
public class MyPersonList {
    private final int INITIAL_LENGTH = 4;
    private Person[] currentArray;
    private int size;

    public MyPersonList() {
        currentArray = new Person[INITIAL_LENGTH];
        size = 0;
    }

    // add element in last
    public void add(Person s) {
        if (s == null) return;
        ;
        if (size == currentArray.length) resize();
        currentArray[size++] = s;
    }

    public Person get(int i) {
        if (i < 0 || i >= size) {
            return null;
        }
        return currentArray[i];
    }

    // searching methods
    public Person search(String lastName) {
        if (lastName.length() <= 0 || null == lastName) {
            return null;
        }
        for (int i = 0; i < currentArray.length; i++) {
            if (currentArray[i].getLast().equals(lastName)) {
                return currentArray[i];
            }
        }
        return null;
    }

    private void resize() {
        System.out.println("resizing");
        int len = currentArray.length;
        int newlen = 2 * len;
        Person[] newArray = new Person[newlen];
        System.arraycopy(currentArray, 0, newArray, 0, len);
        currentArray = newArray;
    }

    public void insert(Person s, int pos) {
        if (pos > size || pos < 0) return;
        if (pos == currentArray.length || size + 1 > currentArray.length) {
            resize();
        }
        Person[] temp = new Person[currentArray.length + 1];
        System.arraycopy(currentArray, 0, temp, 0, pos);
        temp[pos] = s;
        System.arraycopy(currentArray, pos, temp, pos + 1, currentArray.length - pos);
        currentArray = temp;
        ++size;
    }

    public boolean remove(String s) {
        if (size == 0) return false;
        if (s == null) return false;
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (currentArray[i].equals(s)) {
                index = i;
                break;
            }
        }
        if (index == -1) return false;
        Person[] temp = new Person[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, index);
        System.arraycopy(currentArray, index + 1, temp, index, currentArray.length - (index + 1));
        currentArray = temp;
        --size;
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size - 1; i++) {
            sb.append(currentArray[i] + ",");
        }
        sb.append(currentArray[size - 1] + "]");
        return sb.toString();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Object clone() {
        Person[] temp = Arrays.copyOf(currentArray, size);
        return temp;
    }

    public static void main(String[] args) {
        MyPersonList l = new MyPersonList();
        Person person = new Person("xxx", "first", 1);
        Person person1 = new Person("xxx", "first", 1);
        Person person2 = new Person("xxx", "first", 1);
        Person person3 = new Person("xxx", "first", 1);
        l.add(person);
        l.add(person1);
        l.add(person2);
        l.add(person3);
        System.out.println("Number of elements: " + l.size);
        System.out.println("length of the current array: " + l.currentArray.length);
    }
}
