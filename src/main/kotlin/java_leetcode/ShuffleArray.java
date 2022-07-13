package java_leetcode;

public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int size = nums.length;
        int[] ans = new int[size];
        for (int i = 0; i < size; i += 2) {
            ans[i] = nums[i];
            ans[i + n] = nums[i + n];
        }
        return ans;
    }
}
