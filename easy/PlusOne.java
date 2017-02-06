package xyz.viseator.leetcode.easy;

/**
 * Created by viseator on 2/6/17.
 * Wu Di
 * viseator@gmail.com
 */
public class PlusOne {
    public static void main(String[] args) {

    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (++digits[i] == 10) {
                digits[i] = 0;
                if (i == 0) {
                    int[] result = new int[digits.length + 1];
                    result[0] = 1;
                    return result;
                }
            } else {
                return digits;
            }
        }
        return null;
    }

}
