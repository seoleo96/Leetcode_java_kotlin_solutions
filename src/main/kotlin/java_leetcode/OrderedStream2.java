package java_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderedStream2 {
    String[] arr;
    int pos;

    public OrderedStream2(int n) {
        arr = new String[n];
        pos = 0;
    }

    public List<String> insert(int idKey, String value) {
        List<String> res = new ArrayList<>();
        idKey--;
        arr[idKey] = value;
            while (pos < arr.length && arr[pos] != null) {
                res.add(arr[pos++]);
            }
        return res;
//        arr[idKey-1]=value;
//        List<String> chunk = new ArrayList<>();
//        int count = 0;
//        while(pos < arr.length && arr[pos]!=null)
//        {
//            System.out.print("count - " + count++ + ", ");
//            chunk.add(arr[pos]);
//            pos++;
//        }
//        System.out.println();
//        return chunk;
    }

    public static void main(String[] args) {
        OrderedStream2 os = new OrderedStream2(5);
        List<String> param_1 = os.insert(3, "ccccc");
        System.out.println(param_1);
//        List<String> param_2 = os.insert(1, "aaaaa");
//        System.out.println(param_2);
//        List<String> param_3 = os.insert(2, "bbbbb");
//        System.out.println(param_3);
//        List<String> param_4 = os.insert(5, "eeeee");
//        System.out.println(param_4);
//        List<String> param_5 = os.insert(4, "ddddd");
//        System.out.println(param_5);

    }
}
