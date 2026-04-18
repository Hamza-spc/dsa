package org.com.arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {3, 2, 4};
        int target = 6;

        for (int i=0; i<nums.length ; i++){
            for(int j= i+1 ; i< nums.length; i++){
                if(nums[i]+nums[j]==target){
                    System.out.println("the numbers are : " + nums[i] + " and " + nums[j]);
                }
            }
        }
    }
}