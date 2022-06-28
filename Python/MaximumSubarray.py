# /**
#  * 53.给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
#  *   子数组 是数组中的一个连续部分。
#  */

def getMaxSubArray(nums):
    pre, ans = 0, nums[0]

    for x in nums:
        pre = max(pre+x, x)
        ans = max(ans, pre)

    return ans


if __name__ == '__main__':
    print(getMaxSubArray([1, 2, -1, 3]))
    print(getMaxSubArray([-1, -2, -1, 3]))
