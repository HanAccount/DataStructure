/**
 * 35.给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置
 */
public class SearchInsert {
    public static void main(String[] args) {
        int[] nums = {1,3,5,7,9};
        int target = 9;
        System.out.println(searchInsert(nums, target));

    }

    public static int searchInsert(int[] nums, int target) {
        // 使用二分法
        int len = nums.length;
        int l = 0;
        int r = len - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            else if (target < nums[mid]) {
                r = mid - 1;
            }
            else {
                l = mid + 1;

            }
        }
        return l;
    }
}
