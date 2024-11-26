package leetcode.arrays_hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindWordsThatCanBeFormedByCharacters1160 {

    public int countCharacters(String[] words, String chars) {
        int[] ltrs = new int[26];
        for (char ch : chars.toCharArray()) {
            ltrs[ch - 'a']++;
        }
        int sumOfLengths = 0;
        for (String word : words) {
            boolean isGood = true;
            int[] ltrs1 = new int[26];
            System.arraycopy(ltrs, 0, ltrs1, 0, 26);
            for (char ch : word.toCharArray()) {
                if (ltrs1[ch - 'a'] == 0) {
                    isGood = false;
                } else {
                    ltrs1[ch - 'a']--;
                }
            }
            if (isGood) {
                sumOfLengths += word.length();
            }
        }
        return sumOfLengths;
    }
}
