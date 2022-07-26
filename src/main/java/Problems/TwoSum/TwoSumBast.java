package Problems.TwoSum;

import java.util.Arrays;

public class TwoSumBast {

    public static void main(String[] args) {
        int[] nums = {3,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,3};
        int target = 6;

        twoSum(nums, target);

    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j - i] + nums[j] == target) {
                    return new int[]{j - i, j};
                }
            }
        }
        return null;
    }
}

