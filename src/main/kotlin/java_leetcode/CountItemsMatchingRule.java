package java_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountItemsMatchingRule {
    public static void main(String[] args) {
        String[][] items = new String[][]{
                {"phone", "blue", "pixel"},
                {"computer", "silver", "lenovo"},
                {"phone", "gold", "iphone"}};
        List<List<String>> items1 = new ArrayList<List<String>>();
        for(String[] foo: items){
            items1.add(Arrays.asList(foo));
        }
        System.out.println(items1);
        countMatches(items1, "color", "silver");
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        Map<String, Integer> rules = Map.of("type", 0, "color", 1, "name", 2);
        int key = rules.get(ruleKey);
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).get(key).equals(ruleValue))
                count++;
        }
        return count;
    }
}
