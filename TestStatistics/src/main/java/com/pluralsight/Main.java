package com.pluralsight;

public class Main {
    public static void main(String[] args) {


        int[] nums = {63, 65, 95, 53, 100, 80, 35, 31, 70, 88};
        int max = nums[0];
        int min = nums[0];
        int sum = 0;
        int average;

        for (int num : nums){
            max = Math.max(max, num);
            min = Math.min(min, num);

            sum += num;
        }

        average = sum/nums.length;

        System.out.println("The Maximum is: " + max);
        System.out.println("The min is: " + min);
        System.out.println("The average is: " + average);

    }

}