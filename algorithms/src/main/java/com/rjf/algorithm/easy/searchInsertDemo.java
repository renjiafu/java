package com.rjf.algorithm.easy;

/*
*
*
*   题目:
*   给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
*
*
* */

public class searchInsertDemo {

    public static void main(String[] args) {

        int[] ints = {1,3,5,7};
        int target =6;

        System.out.println(searchInsert(ints,target)); // 3
    }

    public static int searchInsert(int[] nums, int target) {

        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                return i;
            }

        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]>target){
                return i;
            }
        }
        return nums.length;
    }
}
