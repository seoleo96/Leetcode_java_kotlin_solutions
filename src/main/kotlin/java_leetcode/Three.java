package java_leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Three {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        result(a, b, n);
    }
    static void result(int[] a, int[] b, int n) {
        if (n == 1) {
            printResult(a, b);
            return;
        }
        int startIndex = 0;
        int endIndex = a.length - 1;

        int startIndexForSort = 0;
        int endIndexForSort = 0;
        while (startIndex < endIndex) {
            boolean needBreakStartIndex = false;
            boolean needBreakEndIndex = false;
            if (a[startIndex] == b[startIndex]) {
                startIndex++;
                continue;
            }

            if (a[endIndex] == b[endIndex]) {
                endIndex--;
                continue;
            }

            if (a[startIndex] != b[startIndex]) {
                startIndexForSort = startIndex;
                needBreakStartIndex = true;
            }

            if (a[endIndex] != b[endIndex]) {
                endIndexForSort = endIndex;
                needBreakEndIndex = true;
            }

            if (needBreakEndIndex && needBreakStartIndex) {
                break;
            }
        }
        Arrays.sort(a, startIndexForSort, endIndexForSort + 1);
        printResult(a,b);
    }

    static void printResult(int[] a, int[] b) {
        boolean isEqual = Arrays.equals(a,b);
        System.out.println(isEqual ? "YES" : "NO");
    }
}
