package org.com.arrays;


import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        HashSet <Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])){
                System.out.println("duplicate found : " + nums[i]);
                return;
            }
            set.add(nums[i]);
        }
        System.out.println("no duplicate");


    }
}