import java.util.*;

class Solution {

    public String frequencyOfEl(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String checkfr = frequencyOfEl(strs[i]);
            if (map.containsKey(checkfr)) {
                map.get(checkfr).add(strs[i]);
            } else {
                ArrayList<String> ans = new ArrayList<>();
                ans.add(strs[i]);
                map.put(checkfr, ans);
            }
        }
        return new ArrayList<>(map.values());

    }
};

public class GroupAnagram {
    public static void main(String[] args) {
        Solution s = new Solution();
        String strs[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> ans = new ArrayList<>();
   
        ans = s.groupAnagrams(strs);
        System.out.println(ans);

    }
}
