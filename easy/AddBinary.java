package xyz.viseator.leetcode.easy;

/**
 * Created by viseator on 2/7/17.
 * Wu Di
 * viseator@gmail.com
 */
public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }

    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int plus = 0;
        String result = "";
        while (i >= 0 && j >= 0) {
            if (a.charAt(i) == '1' && b.charAt(j) == '1') {
                if (plus == 1) {
                    result =  "1"+result;
                } else {
                    result = "0"+result;
                    plus = 1;
                }
            } else if (a.charAt(i) == '1' || b.charAt(j) == '1') {
                if (plus == 1) {
                    result = "0"+result;
                } else {
                    result =  "1"+result;
                }
            } else {
                if (plus == 1) {
                    result = "1"+result;
                    plus = 0;
                } else {
                    result = "0"+result;
                }
            }
            i--;
            j--;
        }
        String temp;
        int k;
        if (i < 0) {
            temp = b;
            k = j;
        } else {
            temp = a;
            k = i;
        }

        while (k >= 0 && plus == 1) {
            if (temp.charAt(k) == '0') {
                result = "1" + result;
                plus = 0;
            } else {
                result = "0" + result;
            }
            k--;
        }

        if (k >= 0) result = temp.substring(0, k+1) + result;
        if (plus == 1) result = "1" + result;
        return result;
    }
}
