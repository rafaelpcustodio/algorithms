package NinjaCode.stack;

import java.util.*;
import java.util.stream.Collectors;

public class FirstUniqueCharInString {
    public int firstUniqChar(String s) {
        if(s == null || s.length() == 0) return -1;
        if(s.length() == 1) return 0;
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            List<Integer> list;
            if(!map.containsKey(s.charAt(i))) {
                list = new ArrayList<>();
            } else {
                list = map.get(s.charAt(i));
            }
            list.add(i);
            map.put(s.charAt(i), list);
        }
        List<List<Integer>> answer = map.values().stream().filter(v -> v.size() == 1).collect(Collectors.toList());
        if(answer.stream().map(i -> i.get(0)).min(Integer::compare).isPresent()) {
            return answer.stream().map(i -> i.get(0)).min(Integer::compare).get();
        } else {
            return -1;
        }
    }
}
