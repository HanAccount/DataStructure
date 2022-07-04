/*
    NC77 调整数组顺序使奇数位于偶数前面(一)
    输入一个长度为 n 整数数组，实现一个函数来调整该数组中数字的顺序，
    使得所有的奇数位于数组的前面部分，所有的偶数位于数组的后面部分，
    并保证奇数和奇数，偶数和偶数之间的相对位置不变
 */


import java.util.ArrayList;

public class ReOrderArray {
    public static void main(String[] args) {

    }

    public int[] reOrderArray (int[] array) {
        ArrayList<Integer> oushu = new ArrayList<>();
        ArrayList<Integer> jishu = new ArrayList<>();
        int[] res = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                oushu.add(array[i]);
            }
            else {
                jishu.add(array[i]);
            }
        }

        // 将集合数据添加到数组中
        for (int i = 0; i < jishu.size(); i++) {
            res[i] = jishu.get(i);
        }

        for (int i = 0; i < oushu.size(); i++) {
            res[i + jishu.size()] = oushu.get(i);
        }
        return res;
    }
}
