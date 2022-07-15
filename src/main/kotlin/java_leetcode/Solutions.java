package java_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solutions {
    public static void main(String[] args) {
//        int[] arr = new int[10];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr = Arrays.stream(arr).filter((i -> i != 0)).toArray();
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr.length);

        var list = new ArrayList<Integer>();
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(1, 5);
        System.out.println(list);
    }
}
