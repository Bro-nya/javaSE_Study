package STU04_Java数据结构.STU04_7_实战反转链表;

public class MainTest {
    public static void main(String[] args) {

    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode temp=curr.next;
           curr.next=prev;
           prev=curr;
           curr=temp;
        }
        return prev;
    }
}
