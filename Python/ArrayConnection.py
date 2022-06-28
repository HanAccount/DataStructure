# /**
#  * 1929.给你一个长度为 n 的整数数组 nums 。请你构建一个长度为 2n 的答案数组 ans ，数组下标 从 0 开始计数 ，对于所有0 <= i < n 的 i ，满足下述所有要求：
#  *
#  * ans[i] == nums[i]
#  * ans[i + n] == nums[i]
#  */

def getConnectionArray(nums):
    for i in range(len(nums)):
        nums.append(nums[i])
    return nums


if __name__ == '__main__':
    print(getConnectionArray([1, 2, 3]))
    print(getConnectionArray([2, 2, 3]))