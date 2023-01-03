import Solutions.Easy.TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum.twoSum(nums, target)));
    }
}
