package 链表;

public class _234_回文链表 {
    public boolean isPalindrome(ListNode head) {
    	if (head == null || head.next == null) return true;
    	if (head.next.next == null && head.val == head.next.val) return true;
    	
    	ListNode mid = midNode(head);
    	ListNode lHead = head;
    	ListNode rHead = reverserList(mid.next);
    	
    	while (rHead != null) {
			if (lHead.val != rHead.val) return false;
    		rHead = rHead.next;
    		lHead = lHead.next;
		}
    	return true;
    }
    
    //翻转链表
    public static ListNode reverserList(ListNode head) {
    	if (head == null || head.next == null) return head;
		
//    	ListNode newHead = reverserList(head.next);
//    	head.next.next = head;
//    	head.next = null;
    	ListNode newHead = null;
    	while (head != null) {
			ListNode tmp = head.next;
			head.next = newHead;
			newHead = head;
			head = tmp;
		}
		return newHead;
	}
    
    //找链表的中间结点（中间结点的next为下半部分链表的头结点）
    public static ListNode midNode(ListNode head) {
    	ListNode fast = head;
    	ListNode slow = head;
    	while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
}
