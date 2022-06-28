
# 35.给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置
import math


def searchInsert(nums, target):
    # 二分法
    l = 0
    r = len(nums) - 1

    while l <= r:
        mid = (l + r) // 2
        if target == nums[mid]:
            return mid
        elif target > nums[mid]:
            l = mid + 1
        else:
            r = mid - 1
    return l

if __name__ == '__main__':
    print(searchInsert([1, 2, 3, 4, 5], 3))
    print(searchInsert([1, 2, 3, 4, 5], 6))
    print(searchInsert([1, 2, 4, 5], 3))
    print(searchInsert([1, 7, 9, 11], 8))