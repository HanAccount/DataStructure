# /*
#     1.给定一个整数数组 nums 和一个整数目标值 target，
#     请你在该数组中找出 和为目标值 target 的那两个整数，
#     并返回它们的数组下标
#  */


def twoSum(nums, target):
    for i in nums:
        for j in nums:
            if i + j == target:
                return [i, j]

    # 返回下标
    # for i in range(len(nums) - 1):
    #     for j in range(i+1, len(nums)):
    #         if nums[i] + nums[j] == target:
    #             return [i, j]

if __name__ == '__main__':
    print(twoSum([1,2,4,5], 6))
