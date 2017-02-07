package xyz.viseator.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by viseator on 2/7/17.
 * Wu Di
 * viseator@gmail.com
 */
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("{()}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        String right = "}])";
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty()) {
                if (right.contains(c + "")) return false;
                stack.push(c);
            } else {
                if (right.contains(c + "")) {
                    if (!stack.pop().equals(map.get(c))) return false;
                } else {
                    stack.push(c);
                }
            }
            if(stack.size()>s.length()-i-1) return false;
        }
        return stack.isEmpty();
    }
}
