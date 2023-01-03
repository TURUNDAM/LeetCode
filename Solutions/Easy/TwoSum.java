/* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.*/

package Solutions.Easy;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        boolean founded =false;

        for (int index_A = 0; index_A < nums.length; index_A++){
            for (int index_B = index_A + 1; index_B < nums.length; index_B++){
                if (nums[index_A] + nums[index_B] == target){
                    result[0] = index_A;
                    result[1] = index_B;
                    founded = true;
                    break;
                }
            }
            if (founded){
                break;
            }
        }

        return result;
    }
}
