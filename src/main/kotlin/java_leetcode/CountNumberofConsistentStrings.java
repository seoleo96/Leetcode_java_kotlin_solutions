package java_leetcode;

import java.util.HashMap;
import java.util.Map;

public class CountNumberofConsistentStrings {
    public static void main(String[] args) {
        countConsistentStrings("abc",new String[]{"a","b","c","ab","ac","bc","abc"});
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        Map<Character, Character> hm = new HashMap<>();

        int count = 0;
        for (int  i = 0; i< allowed.length(); i++ ) {
            Character c = allowed.charAt(i);
            hm.put(c, c);
        }
        System.out.println(hm);
        for (int  i = 0; i< words.length; i++ ) {
            boolean isConsistent = true;
            System.out.println("words - " + words[i]);
            for (int j = 0; j < words[i].length(); j++) {
                if(!hm.containsKey(words[i].charAt(j)))
                    isConsistent = false;
            }
            if(isConsistent)
                count++;
        }
        System.out.println("count - " + count);
        return count;
    }
}
