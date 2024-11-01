package leetcode.arrays_hash;

public class SlidingWindowApproach {

    public static void main(String[] args) {

    }

    //{1, -5, -2, 3, 4} k = 3 == print(1,3,4)
    private static void printMaxInSubArrayWidthK(int[] nums, int k) {
        int currentMax = Integer.MIN_VALUE;
        int until = nums.length - k + 1;
        for (int i = 0; i < until; i++) {
            for (int j = i; j < until + i; j++) {
                if(nums[j] > currentMax){
                    currentMax = nums[j];
                }
            }
            System.out.print(currentMax + " ");
        }
    }

    private static void slidingWindow(int[] nums, int k) {
        int sum = 0;
        int until = nums.length - k + 1;
        System.out.println("Until - " + until);
        for (int i = 0; i < until; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < k + i; j++) {
                sb.append(nums[j]).append(",");
            }
            System.out.println(sb);
        }
    }

    //{1, -5, -2, 3, 4}
    private static void maxSubArray(int[] nums) {
        int currentMaxSum = Integer.MIN_VALUE;// 1_-4_-2_3_7
        int maxSum = currentMaxSum; // 1_1_1_3_7
        for (int num : nums) {
            currentMaxSum = Math.max(num, currentMaxSum + num);
            System.out.println("currentMaxSum - " + currentMaxSum);
            maxSum = Math.max(maxSum, currentMaxSum);
            System.out.println("maxSum - " + maxSum);
        }
        System.out.println(maxSum);
    }
}
