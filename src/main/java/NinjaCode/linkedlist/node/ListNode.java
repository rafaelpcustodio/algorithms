package NinjaCode.linkedlist.node;

public class ListNode {
     public int val;
     public ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

     @Override
     public String toString() {
          return "{" +
                  "val=" + val +
                  ", next=" + next +
                  '}';
     }
}
