package com.rjf.algorithm.easy;

/**
 * @program: java
 * @description: 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * @author: Rene
 * @create: 2020-11-11 21:44
 **/

public class searchInsertDemo {

    public static void main(String[] args) {

        int[] ints = {1,3,5,7};
        int target =6;

        System.out.println(searchInsert(ints,target)); // 3
    }

    // 顺序遍历
    public static int searchInsert(int[] nums, int target) {

        // 1.假定在target在数组中
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                return i;
            }
        }

        // 2.target不在数组中
        for(int i=0; i<nums.length; i++){
            if(nums[i]>target){
                return i;
            }
        }
        return nums.length;
    }
}
