package NinjaCode;

import NinjaCode.linkedlist.IntersectionLinkedList;
import NinjaCode.linkedlist.node.ListNode;
import org.junit.Test;

public class IntersectionLinkedListTest {
    @Test
    public void one() {
        IntersectionLinkedList intersectionLinkedList = new IntersectionLinkedList();
        ListNode headA = new ListNode(4, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5, null)))));
        ListNode headB = new ListNode(5, new ListNode(6, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5, null))))));
        System.out.println(intersectionLinkedList.getIntersectionNode(headA, headB));
    }
}
