package java_leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Solutions {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr = Arrays.stream(arr).filter((i -> i != 0)).toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

    }

    public int[] shuffle(int[] nums, int n) {
        int size = nums.length;
        int[] ans = new int[size];
        for (int i = 0; i < size; i += 2) {
            ans[i] = nums[i];
            ans[i + n] = nums[i + n];
        }
        return ans;
    }

    public int numIdenticalPairs(int[] guestList) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        for (int friend : guestList) {
            int friendCount = hm.getOrDefault(friend, 0);
            ans += friendCount;
            hm.put(friend, friendCount + 1);
        }
        return ans;
    }
}
