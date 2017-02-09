package xyz.viseator.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by viseator on 2/8/17.
 * Wu Di
 * viseator@gmail.com
 */
public class WordPattern {
    public static void main(String[] args) {

    }

    public static boolean wordPattern(String pattern, String str) {
        Map<Character, String> map = new HashMap<>();
        String[] strings = str.split(" ");
        if(pattern.length()!= strings.length) return false;
        for(int i =0 ;i<pattern.length();i++) {
            if(!map.containsKey(pattern.charAt(i))) {
                if(map.containsValue(strings[i])) return false;
                map.put(pattern.charAt(i), strings[i]);
            }
            else if(!Objects.equals(map.get(pattern.charAt(i)), strings[i])) return false;
        }
        return true;
    }
}
