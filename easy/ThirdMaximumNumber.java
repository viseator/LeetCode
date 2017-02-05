package xyz.viseator.leetcode.easy;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by viseator on 2/5/17.
 * Wu Di
 * viseator@gmail.com
 */
public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{2,1,3,2,1,3,4,5};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        ArrayList<Integer> max = new ArrayList<>();
        int min = nums[0];
        for (int num : nums) {
            if (num<min) min = num;
        }
        max.add(min);
        max.add(min);
        max.add(min);
        for (int num : nums) {
            if (num == max.get(0) || num == max.get(1) || num == max.get(2)) {
                continue;
            }
            if (num > max.get(0)) {
                max.set(2, max.get(1));
                max.set(1, max.get(0));
                max.set(0, num);
            } else if (num > max.get(1)) {
                max.set(2, max.get(1));
                max.set(1, num);
            } else if (num > max.get(2)) {
                max.set(2, num);
            }
        }

        if (!Objects.equals(max.get(2), max.get(1)) && !Objects.equals(max.get(2), max.get(0))) {
            return max.get(2);
        } else {
            return max.get(0);
        }

    }
}