package NinjaCode.linkedlist;

import NinjaCode.linkedlist.node.ListNode;

import java.util.HashSet;
import java.util.Set;

public class IntersectionLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> visited = new HashSet<>();
        while(headA != null) {
            visited.add(headA);
            headA= headA.next;
        }
        while(headB != null) {
            if(visited.contains(headB)) {
                return headB;
            }
            headB= headB.next;
        }
        return null;
    }
}
