package java_leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "ab";
        String t = "ac";
        System.out.println(isIso(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.equals(t)) return true;
        boolean isIsomorphic = true;
        int isIso = 0; // 0 - false, 1 - true, 2 - break
        for (int i = 0; i < s.length(); i++) {
            char first = s.charAt(i);
            char second = t.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {

                if (first == s.charAt(j) && second != t.charAt(j)) {
                    isIsomorphic = false;
                    isIso = 2;
                    break;
                }

                if (first != s.charAt(j) && second == t.charAt(j)) {
                    isIsomorphic = false;
                    isIso = 2;
                    break;
                }

                if (first != s.charAt(j)) continue;
                if (second != t.charAt(j)) continue;

                if (first == s.charAt(j) && second == t.charAt(j))
                    isIsomorphic = true;

            }
            if (isIso == 2)
                break;
        }

        return isIsomorphic;
    }

    public static boolean isIso(String s, String t) {
        if(s.equals(t)) return true;
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            int indexS = mapS.getOrDefault(sChar, -1);
            int indexT = mapT.getOrDefault(tChar, -1);

            if(indexS != indexT)
                return false;
            mapS.put(sChar, i);
            mapT.put(tChar, i);
        }
        return true;
    }
}
