package leetcode.arrays_hash;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayGFG {

    private static int counter = 0;

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 7, 2, 6, 5};

        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

        reverseArrayRecursion(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void reverseArray(int[] nums) {
        //our strong pointers
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            //simple swap algorithm
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            //increment the left and decrement the right pointers
            left++;
            right--;
        }
    }

    static void reverseArrayRecursion(int[] nums, int left, int right) {
        System.out.println("Counter - " + counter++);
        if (left >= right)
            return;

        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

        left++;
        right--;
        reverseArrayRecursion(nums, left, right);
    }
}
