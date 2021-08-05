package NinjaCode.linkedlist;

import NinjaCode.linkedlist.node.ListNode;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode tail = head;
        int numberOfNodes;
        for (numberOfNodes = 1; tail.next != null; numberOfNodes++) {
            tail = tail.next;
        }
        tail.next = head;
        k %= numberOfNodes;
        ListNode newHead = head;
        ListNode newTail = head;
        for (int i = 1; i < numberOfNodes - k; i++) {
            newTail = newTail.next;
        }
        newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
}
