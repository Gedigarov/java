package com.max.idea;

public class main {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;

        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;

        int sum = nums[nums.length - 3] + nums[nums.length - 5];
        System.out.println(sum);

    }
}