//  136.给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
public class SingleNum {
    public static void main(String[] args) {
        System.out.println(singleNum(new int[]{2,2,1}));
        System.out.println(singleNum(new int[]{4,1,2,1,2}));
    }

    // 对于任何数x都有――自反性:x^ x=0，x^ 0=x 例如：A^B ^ B = A
    public static int singleNum(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }

        return res;
    }
}
