
/*
    69.给你一个非负整数 x ，计算并返回x的算术平方根 。
    由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
    注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5
 */
public class SqrtX {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x){
        // 使用二分查找
        int l = 0;
        int r = x;
        int res = -1;
        // 保持左边小于等于右边
        while (l <= r){
            // 取中间的数
            // int mid = (l + r)/2;
            // 这个可以避免整型溢出
            int mid = l + (r - l)/2;
            if (mid * mid <= x){
                // 如果刚好中间的数的平方等于x 直接将mid赋值给res
                res = mid;
                // 如果mid的平方小于x 那么左边置为 mid+1
                l = mid + 1;
            }
            else {
                // 如果mid的平方大于x 那么右边置为 mid-1
                r = mid - 1;
            }
        }
        return res;
    }
}
