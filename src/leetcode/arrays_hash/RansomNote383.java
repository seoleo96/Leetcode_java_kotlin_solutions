package leetcode.arrays_hash;

public class RansomNote383 {


    public static void main(String[] args) {
        String ransomNote = "bhjdigif";
        String magazine = "dbjdhdehgbcdjjgadeegdbegehjffie";


    }
    //not my solution, chinese patsan have good idea, idea is from my brute force first solution
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26]; // size of english letters
        for (char ch : ransomNote.toCharArray()) {
            int index = magazine.indexOf(ch, count[ch % 26]);
            if(index < 0){
                return false;
            }
            count[ch % 26] = index + 1;
        }
        return true;
    }

    ////my 3'th brute force
    public boolean canConstruct3(String ransomNote, String magazine) {
        int[] count = new int[26]; // size of english letters
        for (char ch : magazine.toCharArray()) {
            count[ch - 'a']++;
        }
        for (char ch : ransomNote.toCharArray()) {
            if (count[ch - 'a'] > 0) {
                count[ch - 'a']--;
            } else {
                return false;
            }
        }
        return true;
    }

    //my second brute force
    private static boolean canConstruct2(String ransomNote, String magazine){
        int[] count = new int[26]; //size of english letters
        for (char ch : ransomNote.toCharArray()) {
            count[ch - 'a']++;
        }
        for (char ch : magazine.toCharArray()) {
            if(count[ch - 'a'] > 0){
                count[ch - 'a']--;
            }
        }
        for (char ch : ransomNote.toCharArray()) {
            if(count[ch - 'a'] > 0){
                return false;
            }
        }
        return true;
    }

    //brute force n^2
    private static boolean canConstruct1(String ransomNote, String magazine){
        int[] count = new int[26];
        int lastFoundedIndex = 0;
        char lastSearchedChar = 95;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ransomNote.length(); i++) {
            boolean isFind = false;
            lastFoundedIndex = lastSearchedChar == ransomNote.charAt(i) ? lastFoundedIndex : count[ransomNote.charAt(i) - 'a'];
            System.out.println("START j - " + lastFoundedIndex);
            for (int j = lastFoundedIndex; j < magazine.length(); j++) {
                if (ransomNote.charAt(i) == magazine.charAt(j)) {
                    isFind = true;
                    lastFoundedIndex = j + 1;
                    sb.append(magazine.charAt(j));
                    count[magazine.charAt(j) - 'a'] = j + 1;
                    break;
                }
            }
            if (isFind) {
                System.out.println("lastFoundedIndex - " + lastFoundedIndex);
            }
            lastSearchedChar = ransomNote.charAt(i);
        }
        if (sb.length() == ransomNote.length()) {
            System.out.println(sb);
        } else {
            System.out.println("no founded");
        }
        return sb.length() == ransomNote.length();
    }
}
