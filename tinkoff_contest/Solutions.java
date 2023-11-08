package java_leetcode;


import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

import java.util.Scanner;

public class Solutions {
    public static void main(String[] args) throws IOException {
        String str = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ничего не известно! —\n" +
                "Вот последняя правда, открытая мной.";

        try (
                FileInputStream fileInputStream = new FileInputStream("test.txt");
        ) {
//            byte[] readBytes = fileInputStream.readAllBytes();
//            System.out.println(Arrays.toString(readBytes));
//            for (int i = 0; i < readBytes.length; i++) {
//                if(i > 2){
//                    System.out.print((char) readBytes[i]);
//                    System.out.print(",");
//                }
//            }
        }
    }

    private static void readText() throws IOException {
        FileReader fileReader = null;
        int character;
        try {
            fileReader = new FileReader("test.txt");
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println("Done");
        } catch (IOException exception) {
            System.out.println("ERRORR: " + exception.toString());
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
    }

    public static String reverseOnlyLetters(String s) {
        int l = 0;
        int r = s.length() - 1;
        StringBuilder sb = new StringBuilder();
        char[] arr = new char[s.length()];
        while (r > l) {
            System.out.println("l = " + l + ", r = " + r);
            boolean bool1 = Character.isLetter(l);
            boolean bool2 = Character.isLetter(r);
            System.out.println(bool1 + " -- " + bool2);
            if (Character.isLetter(l) && Character.isLetter(r)) {
                System.out.println("s.charAt(r) = " + s.charAt(l) + ", s.charAt(r) = " + s.charAt(r));
                arr[l] = s.charAt(r);
                arr[r] = s.charAt(l);
                l++;
                r--;
            } else if (!Character.isLetter(l)) {
                arr[l] = s.charAt(l);
                l++;
            } else if (!Character.isLetter(r)) {
                arr[r] = s.charAt(r);
                r--;
            }
        }
        System.out.println(Arrays.toString(arr));
        return String.valueOf(arr);
    }


    public int[] shuffle(int[] nums, int n) {
        int size = nums.length;
        int[] ans = new int[size];
        for (int i = 0; i < size; i += 2) {
            ans[i] = nums[i];
            ans[i + n] = nums[i + n];
        }
        return ans;
    }

    public int numIdenticalPairs(int[] guestList) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        for (int friend : guestList) {
            int friendCount = hm.getOrDefault(friend, 0);
            ans += friendCount;
            hm.put(friend, friendCount + 1);
        }
        return ans;
    }
}
