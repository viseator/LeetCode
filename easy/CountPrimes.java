package xyz.viseator.leetcode.easy;

/**
 * Created by viseator on 2/8/17.
 * Wu Di
 * viseator@gmail.com
 */
public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(countPrimes(999983));
    }

    public static int countPrimes(int n) {
        if (n <= 2) return 0;
        int[] nums = new int[n + 1];
        int count = n - 2;
        for (int i = 2; i < Math.sqrt(n) ; i++) {
            if(nums[i]==1 ) continue;
            int k = 2;
            while (i * k < n) {
                if(nums[i*k]!=1) {
                    count--;
                    nums[i * k] = 1;
                }
                k++;
            }

        }
        return count;
    }
}
