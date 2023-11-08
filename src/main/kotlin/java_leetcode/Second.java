package java_leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class SheriffWordFinder {

    public static int findSheriffWord(String input) {
        String sheriff = "sheriff";

        if(input == null || input.isEmpty() || input.length() < sheriff.length()){
            return 0;
        }
        Map<Character, Integer> letterCount = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
        }

        int repeat = input.length() / sheriff.length();
        int countOfWordSheriff = 0;
        while (repeat > 0){
            for (char c : sheriff.toCharArray()) {
                if (letterCount.containsKey(c) && letterCount.get(c) > 0) {
                    result.append(c);
                    letterCount.put(c, letterCount.get(c) - 1);
                    if(result.toString().equals(sheriff)){
                        countOfWordSheriff++;
                        result.setLength(0);
                    }
                } else {
                    break;
                }
            }
            repeat--;
        }

        return countOfWordSheriff;
    }

    public static void main(String[] args) {

        String inputString = new Scanner(System.in).nextLine();

        int sheriffWord = findSheriffWord(inputString);

        System.out.println(sheriffWord);
    }
}
