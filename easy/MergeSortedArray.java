package xyz.viseator.leetcode.easy;

/**
 * Created by viseator on 2/6/17.
 * Wu Di
 * viseator@gmail.com
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 4, 5, 7, 9, 0, 0, 0, 0};
        int[] nums2 = new int[]{2, 3, 6, 8};
        merge(nums1, 6, nums2, nums2.length);
        for (int num : nums1) {
            System.out.println(num);
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newArray = new int[m + n];
        int i, j, k;
        i = j = k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                newArray[k++] = nums1[i++];
            } else {
                newArray[k++] = nums2[j++];
            }
        }

        for (; i < m; i++) {
            newArray[k++] = nums1[i];
        }
        for (; j < n; j++) {
            newArray[k++] = nums2[j];
        }

        for (int a = 0; a < m + n; a++) {
            nums1[a] = newArray[a];
        }
    }

}
