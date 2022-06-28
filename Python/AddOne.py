# 66.给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
# 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
# 你可以假设除了整数 0 之外，这个整数不会以零开头。


def plusOne(nums):
    length = len(nums)

    for i in range(length - 1, -1, -1):
        # print(nums[i])
        # 末位加1
        nums[i] += 1
        # 取模
        nums[i] %= 10
        # 不需要进位
        if nums[i] != 0:
            return nums
    nums.append(0)
    nums[0] = 1
    return nums

if __name__ == '__main__':
    print(plusOne([1, 2, 3]))
    print(plusOne([9, 9]))
    print(plusOne([2, 9, 9]))
    print(plusOne([2, 9, 6]))