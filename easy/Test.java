package xyz.viseator.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by viseator on 2/5/17.
 */
public class Test {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("V", 1);
        map.put("V", 2);
        System.out.println(map.get("V"));

    }
}
