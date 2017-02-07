package xyz.viseator.leetcode.easy;

import com.sun.org.apache.xml.internal.security.transforms.implementations.TransformEnvelopedSignature;

/**
 * Created by viseator on 2/7/17.
 * Wu Di
 * viseator@gmail.com
 */
public class RepeatedSubstringPattern {
    public static void main(String[] args) {
    }

    public static boolean repeatedSubstringPattern(String str) {
/*Bad
        if(str.length()==1) return false;
        for (int i = 1; i <= str.length()/2; i++) {
            if (str.length() / i == str.length() / (float) i) {
                if (str.replaceAll(str.substring(0, i), "").equals("")) {
                    return true;
                }
            }
        }
        return false;*/
        if (str.length() == 1) return false;
        for (int gap = str.length()/2; gap>=1; gap--) {
            if (str.length() % gap  != 0) continue;
            boolean notMatch = false;
            for (int test = 0; test < gap && !notMatch; test++) {
                int i = 1;
                while (test + gap * i < str.length()) {
                    if (str.charAt(test + gap * i) == str.charAt(test)) {
                        i++;
                    } else {
                        notMatch = true;
                        break;
                    }
                }
            }
            if(!notMatch) return true;
        }
        return false;
    }

}
