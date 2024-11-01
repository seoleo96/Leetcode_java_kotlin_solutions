package leetcode.arrays_hash;

import java.util.Arrays;

public class RotateArrayByOne {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        rotateArrayByOne(nums);
        System.out.println(Arrays.toString(nums));
        cycleOneWithPointers(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void cycleOneWithPointers(int[] nums) {
        int right = nums.length -1;
        int left = right - 1;
        while (right > 0){
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            right--;
            left--;
        }
    }

    private static void rotateArrayByOne(int[] nums) {
        int size = nums.length - 1;
        int last = nums[size];
        //   1, 2, 3, 4, 5
        while (size > 0) {
            nums[size] = nums[size - 1];
            size--;
        }
        nums[0] = last;
    }

    private static void cycleOne(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
    }
}
