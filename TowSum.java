/*
    给定一个整数数组 nums 和一个整数目标值 target，
    请你在该数组中找出 和为目标值 target 的那两个整数，
    并返回它们的数组下标
 */

import java.util.HashMap;
import java.util.Map;

public class TowSum {

    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 13;

        int [] res = twoSum(nums, target);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }

    public static int[] twoSum(int[] nums, int target) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(target - nums[i])) {
//                return new int[] {map.get(target - nums[i]), i};
//            }
//            map.put(nums[i], i);
//        }
//
//        return nums;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

}


//class Solution(object):
//        def twoSum(self, nums, target):
//        """
//        :type nums: List[int]
//        :type target: int
//        :rtype: List[int]
//        """
//        dict = {}
//        for i in range(len(nums)):
//        if target - nums[i] in dict:
//        return [i, dict[target - nums[i]]]
//        dict[nums[i]] = i
