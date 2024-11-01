package leetcode.arrays_hash;

/**
 * оставим пока что, sliding_window нужно изучать
 */
public class ContainsDuplicate219 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        System.out.println(containsDuplicate(nums, k));
    }

    static boolean containsDuplicate(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return false;
        }
        if (nums.length == 2) {
            return nums[0] == nums[1];
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println("i - " + i);
            for (int j = i + 1; j <= i + k; j++) {
                if (j >= nums.length)
                    return false;
                System.out.println("--j - " + j);
                if (nums[i] == nums[j] && Math.abs(i - j) <= k)
                    return true;
            }
        }
        return false;
    }
}
