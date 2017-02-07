package xyz.viseator.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by viseator on 2/7/17.
 * Wu Di
 * viseator@gmail.com
 */
public class RomantoInteger {
    public static void main(String[] args) {

    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && map.get(s.charAt(i + 1)) > map.get(s.charAt(i))) {
                sum += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
                i++;
            } else {
                sum += map.get(s.charAt(i));
            }
        }
        return sum;
    }
}
