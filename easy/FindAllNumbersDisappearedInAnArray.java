package xyz.viseator.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by viseator on 2/6/17.
 * Wu Di
 * viseator@gmail.com
 */
public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int temp, temp1;
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i];
            while (temp != 0) {
                temp1 = temp - 1;
                temp = nums[temp1];
                nums[temp1] = 0;
            }
        }

        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            if (nums[i] != 0) {
                result.add(i + 1);
            }
        }
        return result;
    }

}
