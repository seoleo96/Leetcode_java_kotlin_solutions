package leetcode.arrays_hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Linked {

    Box head;
    int size;

    static class Box {

        int e;
        Box next;

        Box(int e) {
            this.e = e;
            next = null;
        }

        @Override
        public String toString() {
            return "Box{" + "e=" + e + ", next=" + (next == null ? null : next.hashCode()) + '}' + ", link - " + hashCode();
        }
    }

    void insert(int e, Linked linked) {

        Box newBox = new Box(e);

        if (linked.head == null) {
            linked.head = newBox;
        } else {
            Box first = linked.head;
            while (first.next != null) {
                first = first.next;
            }
            first.next = newBox;
        }
        size++;
    }

    void delete(Linked linked, int key){
        Box current = linked.head;
        Box prev = null;
        //если первый элемент
        if (current != null && current.e == key){
            linked.head = current.next;
            current = null;
            size--;
            return;
        }
        while (current != null && current.e != key){
            prev = current;
            current = current.next;
        }

        if(prev != null && current != null){
            prev.next = current.next;
            size--;
        }
    }

    void print(Linked linked){
        Box first = linked.head;
        while (first != null){
            System.out.println("e - " + first);
            first = first.next;
        }
    }
}

class Main{

    static void eat(List<Object> list) {

    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
//        eat(list);
        List<Object> list1 = new ArrayList<Object>(List.of(String.valueOf(1), 1, 1.0));
        eat(list1);

        rotateArr(new int[]{1, 2, 3, 4, 5}, 2);
        System.out.println(2%7);
        Linked l = new Linked();
        l.insert(1, l);
        l.insert(2, l);
        l.insert(3, l);
        l.insert(4, l);
        l.insert(5, l);
        l.print(l);
        l.delete(l, 1);
        System.out.println("deleted size - " + l.size);
        l.delete(l, 5);
        System.out.println("deleted size - " + l.size);
        l.print(l);
    }

    static void rotateArr(int[] arr, int d) {
        int count = 0;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = d; i < arr.length; i++) {
            arr[count++] = arr[i];
        }
        for (int num : temp) {
            arr[count++] = num;
        }
        System.out.println(Arrays.toString(arr));
    }
}


