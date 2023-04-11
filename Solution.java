import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {

        if (strs.length == 0) {
            return Collections.emptyList();
        }

        Map<String, ArrayList<String>> res = new HashMap<>();

        for (String s : strs) {
            int[] counts = new int[26];
            for (char c : s.toCharArray()) {
                counts[c - 'a']++;
            }


            StringBuilder sb = new StringBuilder();
            for (int i : counts) {
                sb.append(i+'.');
            }

            String ss = sb.toString();

            if (res.get(ss) != null) {
                res.get(ss).add(s);

            } else {
                ArrayList<String> strings = new ArrayList<>();
                strings.add(s);
                res.put(ss, strings);
            }
        }

        return res.entrySet().stream().map(e -> e.getValue()).collect(Collectors.toList());
    }
}