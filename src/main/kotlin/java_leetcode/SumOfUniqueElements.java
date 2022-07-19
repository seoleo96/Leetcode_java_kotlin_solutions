package java_leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        sumOfUnique(new int[]{10, 6, 9, 6, 9, 6, 8, 7});
    }

    public static int sumOfUnique(int[] nums) {
        if (nums.length == 1) return nums[0];
        int sum = 0;
        int n = nums.length;
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);

            if (hm.get(nums[i]) == 1)
                sum += nums[i];
            else if (hm.get(nums[i]) == 2)
                sum -= nums[i];
            System.out.println("sum[i] - " + i + " - " + sum);
        }
        System.out.println("arr - A" + Arrays.toString(nums));
        System.out.println("sum - " + sum);
        System.out.println("hm - " + hm);

        return sum;
    }


    public static int sumOfUniqu(int[] nums) {
        if (nums.length == 1) return nums[0];

        int sum = 0;
        int n = nums.length;
        int[] arr = new int[101];
        for (int i = 0; i < n; i++) {
            arr[nums[i]]++;
        }
        System.out.println("sort - A" + Arrays.toString(arr));
        System.out.println("arr - A" + Arrays.toString(nums));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                sum += i;
            }
        }
        System.out.println("sort - A" + Arrays.toString(arr));
        System.out.println("sum - " + sum);
        return sum;
    }
}
