package xyz.viseator.leetcode.easy;

import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by viseator on 2/6/17.
 * Wu Di
 * viseator@gmail.com
 */
public class MajorityElement {
    public static void main(String[] args) {

    }

    public static int majorityElement(int[] nums) {
/*        if(nums.length==1) return nums[0];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else {
                int count = map.get(nums[i]);
                if (++count > nums.length / 2) return nums[i];
                map.put(nums[i], count);
            }
        }
        return 0;*/
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

}
