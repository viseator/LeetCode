package xyz.viseator.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by viseator on 2/9/17.
 * Wu Di
 * viseator@gmail.com
 */
public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1,2,3,3,4,2}));
    }

    public static int singleNumber(int[] nums) {
/*
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)&&map.get(num) == 1) {
                map.put(num, 0);
            } else map.put(num, 1);
        }
        for(int num:nums) {
            if(map.get(num)==1) return num;
        }
        return 0;
*/
        int result = 0;
        for(int i : nums) {
            result ^= i;
        }
        return result;
    }
}
