/*
    给定节点数为 n 的二叉树的前序遍历和中序遍历结果，请重建出该二叉树并返回它的头结点。
    例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建出如下图所示
 */


import java.util.Arrays;

// Definition for binary tree
class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}

public class ReConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] vin) {
        int n = pre.length;
        int m = vin.length;

        if (m == 0 || n==0) {
            return null;
        }

        // 构建根节点 根据前序遍历可以得知前序遍历的第一个值为根节点
        TreeNode root = new TreeNode(pre[0]);

        // 从中序遍历中寻找左右子树的根节点 均为先序遍历中的第一个元素
        for (int i = 0; i < m; i++) {
            // 在中序遍历中找到第i+1个元素是根节点
            if (pre[0] == vin[i]) {
                // 左子树
                // Arrays.copyOfRange():主要用于对一个已有的数组进行截取复制，复制出一个左闭右开区间的数组
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(vin, 0, i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, n), Arrays.copyOfRange(vin, i+1, m));

                break;
            }

        }
        return root;
    }
}
