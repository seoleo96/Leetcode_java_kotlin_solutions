package java_leetcode;

import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int mySum = sc.nextInt();
        int currentMax = 0;

        for (int i  = 0; i<count; i++) {
            int element = sc.nextInt();
            if(element <= mySum && element > currentMax){
                currentMax = element;
            }
        }

        System.out.println(currentMax);
    }
}