//169.给定一个大小为 n 的数组nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于⌊ n/2 ⌋的元素。
//
//你可以假设数组是非空的，并且给定的数组总是存在多数元素。
//
//来源：力扣（LeetCode）
//链接：https://leetcode.cn/problems/majority-element


import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,3,3,3,3,2}));
    }

    public static int majorityElement(int[] nums) {
//        暴力解法
//        int count = 0;
//        if (nums.length == 1) return nums[0];
//        for(int i = 0; i < nums.length - 1; i++) {
//            for(int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    count++;
//                }
//            }
//            if (count >= (nums.length / 2)) {
//                return nums[i];
//            }
//            count = 0;
//        }
//
//        return 0;

        // 或者使用排序法
        // 既然数组中有出现次数> ⌊ n/2 ⌋的元素，那排好序之后的数组中，相同元素总是相邻的。
        // 即存在长度> ⌊ n/2 ⌋的一长串 由相同元素构成的连续子数组
        // Arrays.sort(nums);
        // 位运算
        // return nums[nums.length >> 1];

//        摩尔投票法
//        候选人(cand_num)初始化为nums[0]，票数count初始化为1。
//        当遇到与cand_num相同的数，则票数count = count + 1，否则票数count = count - 1。
//        当票数count为0时，更换候选人，并将票数count重置为1。
//        遍历完数组后，cand_num即为最终答案
        int cand_num = nums[0];
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (cand_num == nums[i]) {
                ++count;
            } else if (--count == 0) {
                cand_num = nums[i];
                count = 1;
            }

        }
        return cand_num;
    }
}
