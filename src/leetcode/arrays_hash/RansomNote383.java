package leetcode.arrays_hash;

public class RansomNote383 {


    public static void main(String[] args) {
        String ransomNote = "bhjdigif";
        String magazine = "dbjdhdehgbcdjjgadeegdbegehjffie";


    }

    //brute force n^2
    private static boolean canConstruct(String ransomNote, String magazine){
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
