package xyz.viseator.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by viseator on 2/8/17.
 * Wu Di
 * viseator@gmail.com
 */
public class IsomorphicStrings {
    public static void main(String[] args) {

    }

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for(int i =0;i<s.length();i++) {
            if (!map.containsKey(s.charAt(i))) {
                if (map.containsValue(t.charAt(i))) return false;
                map.put(s.charAt(i), t.charAt(i));
            } else if(map.get(s.charAt(i))!=t.charAt(i)) return false;
        }
        return true;
    }
}
