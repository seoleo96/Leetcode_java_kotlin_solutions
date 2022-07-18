package java_leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HowManyNumbersAreSmallerThanCurrentNumber {
    public static void main(String[] args) {
        smallerNumbersThanTheCurrent(new int[]{8, 1, 2, 2, 3});
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int max = 20;

        int n = nums.length;
        int[] count = new int[max];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i] + 1] = count[nums[i] + 1] + 1;
        }
        System.out.println(Arrays.toString(count));

        for (int i = 1; i < max; i++) {
            count[i] = count[i] + count[i - 1];
        }
        System.out.println(Arrays.toString(count));

        for (int i = 0; i < n; i++) {
            nums[i] = count[nums[i]];
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    public static int[] smallerNumbersThanTheCurrent(int[] nums) {

        int n = nums.length;
        int[] sortArr = nums.clone();
        Arrays.sort(sortArr);
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            if (!hm.containsKey(sortArr[i]))
                hm.put(sortArr[i], i);

        for (int i = 0; i < n; i++) {
            nums[i] = hm.get(nums[i]);
        }
        System.out.println(Arrays.toString(nums));

        return nums;
    }

}
