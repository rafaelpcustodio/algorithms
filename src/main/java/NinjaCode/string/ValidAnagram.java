package NinjaCode.string;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    // solves but not performatic
    public boolean isAnagramNotPerformatic(String s, String t) {
        Map<Character, Integer> mapOne = new HashMap<>();
        Map<Character, Integer> mapTwo = new HashMap<>();
        if(s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            if(mapOne.containsKey(s.charAt(i))) {
                int value = mapOne.get(s.charAt(i));
                mapOne.put(s.charAt(i), value + 1);
            } else {
                mapOne.put(s.charAt(i), 1);
            }
            if(mapTwo.containsKey(t.charAt(i))) {
                int value = mapTwo.get(t.charAt(i));
                mapTwo.put(t.charAt(i), value + 1);
            } else {
                mapTwo.put(t.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : mapOne.entrySet()) {
            if(!entry.getValue().equals(mapTwo.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    // remember ASCII table letter 'a' is less than all the others.
    public boolean isAnagramPerfectSolution(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        for(int i : counts) {
            if(i != 0) {
                return false;
            }
        }
        return true;
    }
}
