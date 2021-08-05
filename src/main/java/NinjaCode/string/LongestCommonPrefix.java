package NinjaCode.string;

import java.util.*;

public class LongestCommonPrefix {
    public String longestCommonPrefix(
            String[] strs
    ) {
        if(strs == null) return "";
        if(strs.length == 1) return strs[0];
        final int minSize = Arrays.stream(strs).min(Comparator.comparing(String::length)).get().length();
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        here: for (int i = 0; i < minSize; i++) {
            for (String str : strs) {
                if(i == 0 && !stack.contains(str.toCharArray()[i])) {
                    stack.add(str.toCharArray()[i]);
                }
                else if(!stack.contains(str.toCharArray()[i])) {
                    stack.add(str.toCharArray()[i]);
                } else {
                    break here;
                }
            }
        }
        System.out.println(stack);
        return sb.toString().substring(0, sb.toString().indexOf('*'));
    }

    public String perfectSolution(String[] strs) {
        // Take first word as current prefix, shave off the last character whenever it doesn't match.

        String prefix = strs[0];
        int i = 1;

        while (i < strs.length && prefix.length() != 0) {
            if (strs[i].startsWith(prefix))
                i++;
            else
                prefix = prefix.substring(0, prefix.length() - 1);
        }

        return prefix;
    }
}
