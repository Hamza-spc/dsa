package org.com.arrays;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {3, 2, 4};
        int target = 6;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int needed = target - current;

            if (map.containsKey(needed)) {
                System.out.println(map.get(needed) + ", " + i);
                return;
            }

            map.put(current, i);
        }
    }
}