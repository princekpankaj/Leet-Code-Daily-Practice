/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = getSize(headA);
        int lengthB = getSize(headB);

        while (lengthA < lengthB) {
            headB = headB.next;
            lengthB--;
        }

        while (lengthA > lengthB) {
            headA = headA.next;
            lengthA--;
        }

        while (headA != null && headB != null) {
            if (headA == headB)
                return headA;
            headA = headA.next;

            headB = headB.next;
        }
        return null;
    }

    public int getSize(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        return length;

    }
}