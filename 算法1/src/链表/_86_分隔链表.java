package 链表;

public class _86_分隔链表 {
    public ListNode partition(ListNode head, int x) {
    	if (head == null) return null;
    	ListNode lHead = new ListNode();
    	ListNode lTail = lHead;
    	ListNode rHead = new ListNode();
    	ListNode rTail = rHead;
    	
    	while (head != null) {
    		if (head.val < x) {
				lTail.next = head;
				lTail = lTail.next;
			} else {
				rTail.next = head;
				rTail = rTail.next;
			}
			head = head.next;
		}
    	lTail.next = rHead.next;
    	rTail.next = null;//倒数第一个大于x的结点后面全是小于x的结点的处理
    	
    	return lHead.next;
    	
    }
}
