package java_leetcode;

import java.util.Arrays;
import java.util.Scanner;

class Fourth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int count = sc.nextInt();
        int[] products = new int[count * 2];
        int totalSumOfProducts = 0;
        for (int i = 0; i < count * 2; i += 2) {
            products[i] = sc.nextInt();
            products[i + 1] = products[i];
            totalSumOfProducts += (products[i] + products[i + 1]);
        }

        Arrays.sort(products);
        if (totalSumOfProducts < total) {
            System.out.println(-1);
            return;
        }

        if (totalSumOfProducts == total) {
            System.out.println(products.length);
            System.out.println(Arrays.toString(products));
            return;
        }

        int startIndex = 0;
        int endIndex = products.length - 1;
        boolean hasResult = false;
        System.out.println(Arrays.toString(products));
        //5 2
        //1 1 2 2
        while (startIndex < endIndex) {
            if (products[endIndex] > total) {
                endIndex--;
                continue;
            }
            if (products[startIndex] + products[endIndex] > total) {
                endIndex--;
            } else {
                if (products[startIndex] + products[endIndex] == total) {
                    System.out.println(2);
                    System.out.println(products[startIndex] + " " + products[endIndex]);
                    return;
                } else {
                    int subArraySum = Arrays.stream(Arrays.copyOfRange(products, startIndex, endIndex)).sum();
                    if(subArraySum > total){
                        startIndex++;
                    }else if(subArraySum < total){
                        endIndex--;
                    }
                }
            }
            hasResult = true;
        }
        if (!hasResult) {
            for (int i = 0; i < products.length; i++) {
                if (totalSumOfProducts - products[i] == total) {
                    int start = i + 1;
                    int end = products.length - 1;
                    printArray(start, end, products);
                    return;
                }
            }
        }

        System.out.println("end");
        System.out.println(-1);
    }

    static void printArray(int start, int end, int[] arr) {
        System.out.println(end);
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}