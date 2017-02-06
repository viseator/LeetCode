package xyz.viseator.leetcode.easy;

import java.util.*;

/**
 * Created by viseator on 2/6/17.
 * Wu Di
 * viseator@gmail.com
 */
public class ContainsDuplicate2 {
    public static void main(String[] args) {

    }

    public boolean containsDuplicate(int[] nums, int k) {
/*old
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            } else {
                map.get(nums[i]).add(i);
            }
        }

        for (List<Integer> list : map.values()) {
            if (list.size() > 1) {
                Collections.sort(list);
                for (int i = 1; i < list.size(); i++) {
                    if (list.get(i) - list.get(i - 1) <= k) return true;
                }
            }
        }

        return false;*/

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k)
                return true;
            map.put(nums[i], i);
        }
        return false;
    }

}
