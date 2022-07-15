package java_leetcode;

public class SumOddLengthSubarrays {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        var res = sumOddLengthSubarrays(arr);
        System.out.println(res);
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        if (arr == null) throw new NullPointerException();
        if (arr.length == 1 || arr.length == 2)
            return arr[0] + arr[1];

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int multiplier = ((i + 1) * (arr.length-i) + 1) / 2;
            sum += arr[i] * multiplier;
        }


        int r = 5/2;
        System.out.println(((0 + 1) * (arr.length - 0) + 1) / 2);
        return sum;
    }
}
