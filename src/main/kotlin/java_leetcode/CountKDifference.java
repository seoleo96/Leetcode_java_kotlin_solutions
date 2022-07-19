package java_leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountKDifference {
    public static void main(String[] args) {
        System.out.println(countKDifference(new int[]{3,2,1,5,4}, 2));
    }

    public static  int countKDifference(int[] nums, int k) {

        int[] freq = new int[101];//0 - 100 -> range of value
        int n = nums.length;

        for(int i = 0; i < n; i++)
            freq[nums[i]]++;
        System.out.println(Arrays.toString(freq));

        int pairs = 0;

        for(int i = 1; i < 101 - k; i++){
            pairs += freq[i] * freq[i + k];//cnt[i] * cnt[i + k] -> gives count of pairs
        }

        System.out.println(pairs);
        return pairs;
    }
    public static  int countKDifferenc(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int res = 0;

        for(int i = 0;i< nums.length;i++){
            if(map.containsKey(nums[i]-k)){
                res = res + map.get(nums[i] - k);
            }
            if(map.containsKey(nums[i]+k)){
                res+= map.get(nums[i]+k);
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            System.out.println("i - " + i);
            System.out.println("map - " + map);
            System.out.println("res - " + res);

        }


        System.out.println(map);
        return res;
    }
}
