package xyz.viseator.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by viseator on 2/6/17.
 * Wu Di
 * viseator@gmail.com
 */
public class PascalsTriangle {
    public static void main(String[] args) {

    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> totalList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            List<Integer> preList = null;
            if (i>0) {
                preList = totalList.get(i - 1);
            }
            for (int j = 1; j < i; j++) {
                list.add( preList.get(j) + preList.get(j - 1));
            }
            if (i>0) {
                list.add(1);
            }
            totalList.add(list);
        }
        return totalList;
    }
}
