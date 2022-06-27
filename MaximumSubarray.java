/**
 * 53.给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *   子数组 是数组中的一个连续部分。
 */

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {1,2,-3,5};
        System.out.println(maxSubArray(nums));
        System.out.println(maxSubArray2(nums));
    }

    public static int maxSubArray(int[] nums) {
        int pre = 0;
        int maxSum = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxSum = Math.max(maxSum, pre);
        }
        return maxSum;
    }

    /*
        如果 sum > 0，则说明 sum 对结果有增益效果，则 sum 保留并加上当前遍历数字
        如果 sum <= 0，则说明 sum 对结果无增益效果，需要舍弃，则 sum 直接更新为当前遍历数字
        每次比较 sum 和 ans的大小，将最大值置为ans，遍历结束返回结果
        时间复杂度：O(n)
     */
    public static int maxSubArray2(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            }else {
                sum = num;
            }

            ans = Math.max(sum, ans);
        }
        return ans;
    }
}
