//给你一个整数数组salary，数组里每个数都是 唯一的，其中salary[i] 是第i个员工的工资。
//请你返回去掉最低工资和最高工资以后，剩下员工工资的平均值。

import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        System.out.println(getAverage(new int[]{4000,3000,1000,2000}));
        System.out.println(getAverage(new int[]{8000,9000,2000,3000,6000,1000}));
        System.out.println(getAverage(new int[]{48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000}));
    }

    public static double getAverage(int[] salary) {
        double sum = 0;
        Arrays.sort(salary);
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
        }

        return sum / (salary.length - 2);
    }
}
