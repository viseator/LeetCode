package xyz.viseator.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by viseator on 2/9/17.
 * Wu Di
 * viseator@gmail.com
 */
public class NumberofBoomerangs {
    public static void main(String[] args) {

    }

    public int numberOfBoomerangs(int[][] points) {
        Map<Double, Integer> map = new HashMap<>();
        int count = 0;
        for (int[] i : points) {
            for (int[] j : points) {
                double distance = Math.sqrt(Math.pow(i[0] - j[0], 2) + Math.pow(i[1] - j[1], 2));
                if (!map.containsKey(distance)) {
                    map.put(distance, 1);
                } else {
                    count += map.get(distance) * 2;
                    map.put(distance, map.get(distance) + 1);
                }
            }
            map.clear();
        }
        return count;
    }
}
