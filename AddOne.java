/*
 * 66.给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */

public class AddOne {
    public static void main(String[] args) {
        int[] nums = {9};
        int[] res = plusOne(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

//        数组没有指定数据时会初始化为0
//        int[] num = new int[2];
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(num[i]);
//        }

    }

    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            // 末位加1
            digits[i]++;
            // 取模 如何是9则设为0
            digits[i] %= 10;
            // 判断末位数加1后与10的模不为0时直接返回加1后的值
            if (digits[i] != 0)
                return digits;
        }
        // 否则
        // 需要加一位数 扩充数组长度 如 99 -> 100
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }
}
