package NinjaCode;

import NinjaCode.linkedlist.ReverseLinkedList;
import NinjaCode.linkedlist.RotateList;
import NinjaCode.linkedlist.node.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class ReverseLinkedListTest {
    @Test
    public void one() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode list =
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5, null)))));
        ListNode expected =
                new ListNode(5,
                        new ListNode(4,
                                new ListNode(3,
                                        new ListNode(2,
                                                new ListNode(1, null)))));
        ListNode result = reverseLinkedList.reverseList(list);
        Assert.assertEquals(expected, result);
    }
}
