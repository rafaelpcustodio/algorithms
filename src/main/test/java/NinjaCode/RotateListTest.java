package NinjaCode;

import NinjaCode.linkedlist.RotateList;
import NinjaCode.linkedlist.node.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class RotateListTest {
    @Test
    public void one() {
        RotateList rotateList = new RotateList();
        ListNode list =
            new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5, null)))));
        ListNode expected =
                new ListNode(4,
                        new ListNode(5,
                                new ListNode(1,
                                        new ListNode(2,
                                                new ListNode(3, null)))));
        ListNode result = rotateList.rotateRight(list, 2);
        Assert.assertEquals(expected, result);
    }
}
