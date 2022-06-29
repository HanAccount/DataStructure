
//给你两个非负整数 low 和 high 。请你返回 low 和 high 之间（包括二者）奇数的数目。
public class CountAdd {
    public static void main(String[] args) {
        System.out.println(countOdds(1,7));
    }

    public static int countOdds(int low, int high) {
        // 暴力破解太耗时间
//        int counts = 0;
//        for (int i = low; i <= high; i++) {
//            if (i % 2 == 0) {
//                continue;
//            }
//            else {
//                counts++;
//            }
//        }
//        return counts;
        // 把[0,high]的奇数个数 - [0,low]的奇数个数
        return (high + 1) / 2 - low / 2;
    }
}
