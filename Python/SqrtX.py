# /*
#     69.给你一个非负整数 x ，计算并返回x的算术平方根 。
#     由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
#     注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5
#  */


def mySqrt(x):
    left, right = 0, x
    res = -1

    while left <= right:
        mid = (left + right) // 2

        if mid * mid <= x:
            res = mid
            left = mid + 1

        else:
            right = mid - 1

    return res

if __name__ == '__main__':
    print(mySqrt(9))
    print(mySqrt(8))