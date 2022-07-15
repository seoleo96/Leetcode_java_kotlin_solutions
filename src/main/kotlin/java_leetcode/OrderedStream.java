package java_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderedStream {
    List<String> res;
    int size;
    int ptr;

    public OrderedStream(int n) {
        res = new ArrayList<>(Arrays.asList(new String[n]));
        size = n;
        ptr = 0;
    }

    public List<String> insert(int idKey, String value) {
        idKey -= 1;
        if (idKey == ptr) {
            res.set(idKey, value);
            ptr += 1;
            if (ptr == size) {
                return res.subList(idKey, ptr);
            }
            if (res.get(ptr) == null) {
                return res.subList(idKey, ptr);
            }
            for (int i = idKey + 1; i < size; i++) {
                if (res.get(i) == null) {
                    return res.subList(idKey, ptr);
                }
                ptr++;
                if (ptr == size) {
                    return res.subList(idKey, ptr);
                }
            }
        }
        res.set(idKey, value);
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        OrderedStream os = new OrderedStream(5);
        List<String> param_1 = os.insert(3, "ccccc");
        System.out.println(param_1);
        List<String> param_2 = os.insert(1, "aaaaa");
        System.out.println(param_2);
        List<String> param_3 = os.insert(2, "bbbbb");
        System.out.println(param_3);
        List<String> param_4 = os.insert(5, "eeeee");
        System.out.println(param_4);
        List<String> param_5 = os.insert(4, "ddddd");
        System.out.println(param_5);
//        List<String> param_5 = new ArrayList<>();
//        param_5.add(null);
//        System.out.println(param_5.get(1));

    }
}
