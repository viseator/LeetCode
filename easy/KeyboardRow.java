package xyz.viseator.leetcode.easy;

import java.util.ArrayList;

/**
 * Created by viseator on 2/8/17.
 * Wu Di
 * viseator@gmail.com
 */
public class KeyboardRow {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("aa");
        strings.add("aa");
    }

    public static String[] findWords(String[] words) {
        String one = "qwertyuiopQWERTYUIOP";
        String two = "asdfghjklASDFGHJKL";
        String three = "zxcvbnmZXCVBNM";
        ArrayList<String> result = new ArrayList<>();
        for (String word : words) {
            String target;
            boolean found = true;
            if(one.contains(word.charAt(0)+"")) target = one;
            else if(two.contains(word.charAt(0)+"")) target = two;
            else target = three;
            for (char c : word.toCharArray()) {
                if (!target.contains(c + "")) {
                    found = false;
                    break;
                }
            }
            if(found) result.add(word);
        }

        return result.toArray(new String[0]);
    }
}
