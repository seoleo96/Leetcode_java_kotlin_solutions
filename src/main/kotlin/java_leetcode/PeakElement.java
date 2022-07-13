package java_leetcode;

public class PeakElement {
    private static void peakElement() {
        int[] arr = {1, 2, 3};
        int size = 3;
        for (int i = 1; i < size; i++) {
            if (arr[i] > arr[i - 1]) {
                if (i + 1 < size) {
                    if (arr[i] > arr[i + 1]) {
                        System.out.println(arr[i]);
                    }
                }
            }
        }
    }
}
