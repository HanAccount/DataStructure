
/**
 * 1929.给你一个长度为 n 的整数数组 nums 。请你构建一个长度为 2n 的答案数组 ans ，数组下标 从 0 开始计数 ，对于所有0 <= i < n 的 i ，满足下述所有要求：
 *
 * ans[i] == nums[i]
 * ans[i + n] == nums[i]
 */
public class ArrayConnection {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int[] ans = getConnectArray(nums);

        for (int num :
                ans) {
            System.out.println(num);
        }

    }

    public static int[] getConnectArray(int[] nums) {
        int[] ans = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            /**
             * nums:[1,2,3] ans:[0,0,0,0,0,0]
             * 1) ans:[1,0,0,0,0,0]
             * 2) ans:[1,0,0,1,0,0]
             */
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }

        return ans;
    }
}
