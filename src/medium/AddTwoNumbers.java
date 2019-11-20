package medium;

import java.math.BigInteger;

/*
    You are given two non-empty linked lists representing two non-negative integers.
    The digits are stored in reverse order and each of their nodes contain a single digit.
    Add the two numbers and return it as a linked list.

    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {

    public static void main(String... args) {

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        System.out.println(addTwoNumbers.addTwoNumbers(l1, l2));
    }

    static class ListNode {

        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        String s1 = l1.val + "";
        String s2 = l2.val + "";
        while ((l1 = l1.next) != null) s1 = l1.val + s1;
        while ((l2 = l2.next) != null) s2 = l2.val + s2;
        char[] c = new BigInteger(s1).add(new BigInteger(s2)).toString().toCharArray();
        int n = c.length;
        ListNode node = new ListNode(c[n-1] - 48);
        ListNode result = node;

        for (int i = n-2; i >= 0; i--) {
            node.next = new ListNode(c[i] - 48);
            node = node.next;
        }

        return result;
    }

}
