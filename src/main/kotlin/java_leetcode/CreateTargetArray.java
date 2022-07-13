package java_leetcode;

public class CreateTargetArray {
    private static int[] createTargetArray(int[] nums, int[] index) {
        int size = nums.length;
        int[] res = new int[size];
        for(int i=0; i<size; i++){
            if (index[i] <= i ) {
//                for (int j = size-1; j > index[i]; j--) {
//                    res[j] = res[j-1];
//                }
                if (size - 1 - index[i] >= 0)
                    System.arraycopy(res, index[i], res, index[i] + 1, size - 1 - index[i]);
            }
            res[index[i]] = nums[i];
        }
        return res;
    }
}
