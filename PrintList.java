/*
    剑指offer
    JZ6 从尾到头打印链表
    输入一个链表的头节点，按链表从尾到头的顺序返回每个节点的值（用数组返回）。
 */

import java.util.ArrayList;
import java.util.Stack;

class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
           this.val = val;
        }
    }
public class PrintList {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        recursion(listNode, res);
        return res;
    }
    // 1.递归求法
    public void recursion(ListNode head, ArrayList<Integer> res) {
        if (head != null) {
            recursion(head.next, res);
            res.add(head.val);
        }
    }

    // 2.使用栈的思想
    public ArrayList<Integer> printListFromTailToHead_Stack(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        Stack<Integer> s = new Stack<Integer>();

        // 遍历链表 然后存入栈中
        while (listNode != null) {
            s.push(listNode.val);
            listNode = listNode.next;
        }

        // 最后弹出栈内元素存放到数组即可
        while (!s.isEmpty()){
            res.add(s.pop());
        }

        return res;

    }
}
