package com.company.smallTasks.LeetCode;

public class TwoSum {
    public static void main(String[] args) {


        int[] randomNums = {3, 7, 11, 15};
        int targetNum = 18;

        int[] indexes = twoSum(randomNums, targetNum);
        for (Integer num : indexes) {
            System.out.println(num);
        }
    }

    public static int[] twoSum(int[] nums, int targetNum) {
        int[] finalArr = new int[2];

        boolean isFound = false;
        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == targetNum) {
                    finalArr[0] = i;
                    finalArr[1] = j;
                    isFound = true;
                    break;
                }
            }
            if (isFound){
                break;
            }
        }


        return finalArr;
    }
}
