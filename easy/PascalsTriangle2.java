package xyz.viseator.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by viseator on 2/6/17.
 * Wu Di
 * viseator@gmail.com
 */
public class PascalsTriangle2 {
    public static void main(String[] args) {

    }

    public static List<Integer> getRow(int rowIndex) {
/*BAD
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            list.add(1);
        }
        getRow(list, rowIndex);
        return list;*/
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            list.add(0);
        }

        for(int i =1;i<=rowIndex;i++) {
            for(int j=i;j>0;j--) {
                list.set(j, list.get(j) + list.get(j - 1));
            }
        }
        return list;
    }

    public static void getRow(List<Integer> nums, int k) {
        if (k > 1) getRow(nums, k - 1);
        List<Integer> temp = new ArrayList<>();
        for (int num : nums) {
            temp.add(num);
        }

        for (int j = 1; j < k; j++) {
            nums.set(j, temp.get(j) + temp.get(j - 1));
        }
    }
}
