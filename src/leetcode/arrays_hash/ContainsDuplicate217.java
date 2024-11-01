package leetcode.arrays_hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicate2(nums));
    }

    static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                return true;
        }
        return false;
    }

    static boolean containsDuplicate2(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int num : nums) {
            boolean isAdded = uniques.add(num);
            System.out.println("isAdded - " + isAdded + ", nums[i] - " + num);
            if (!isAdded)
                return true;
        }
        return false;
    }
}
