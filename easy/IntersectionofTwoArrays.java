package xyz.viseator.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by viseator on 2/8/17.
 * Wu Di
 * viseator@gmail.com
 */
public class IntersectionofTwoArrays {
    public static void main(String[] args) {

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        List<Integer> result = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            while (i < nums1.length - 1 && nums1[i + 1] == nums1[i]) i++;
            while (j < nums2.length - 1 && nums2[j + 1] == nums2[j]) j++;
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
            } else if(nums1[i]>nums2[j]) j++;
            else i++;
        }
//        return result.stream().mapToInt(x->x).toArray();  Too slow
        int[] newResult = new int[result.size()];
        int x = 0;
        for (int num : result) {
            newResult[x++] = num;
        }
        return newResult;
    }
}
