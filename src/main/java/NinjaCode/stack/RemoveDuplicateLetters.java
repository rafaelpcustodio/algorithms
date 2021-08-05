package NinjaCode.stack;

import java.util.*;
import java.util.stream.Collectors;

/*
Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.
Example 1:

Input: s = "bcabc"
Output: "abc"

Example 2:

Input: s = "cbacdcbc"
Output: "acdb"
*/

public class RemoveDuplicateLetters {
    // nao deixa em ordem lexa
    public String removeDuplicateLetters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }
        for (int i = 0; i < s.length(); i++) {
            if(stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else {
                if(stack.get(stack.size()-1) > s.charAt(i) && !stack.contains(s.charAt(i))) {
                    if(i <= map.get(stack.peek())) {
                        stack.pop();
                    }
                    stack.push(s.charAt(i));
                } else {
                    if((i == map.get(s.charAt(i)) || i - 1 == map.get(stack.peek())) && !stack.contains(s.charAt(i))) {
                        stack.push(s.charAt(i));
                    }
                }
            }
        }
        return stack.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
