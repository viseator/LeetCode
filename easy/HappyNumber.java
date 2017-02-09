package xyz.viseator.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by viseator on 2/8/17.
 * Wu Di
 * viseator@gmail.com
 */
public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int result = n;
        while (!set.contains(result)) {
            set.add(result);
            int sum = 0;
            while (result > 9) {
                int a = result % 10;
                sum += a * a;
                result /= 10;
            }
            sum += result *result;
            if (sum == 1) return true;
            else result = sum;
        }
        return false;
    }

}
