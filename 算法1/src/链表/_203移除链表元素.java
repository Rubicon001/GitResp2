package 链表;

public class _203移除链表元素 {
	public ListNode removeElements(ListNode head, int val) {
		ListNode newHead = new ListNode();//虚拟头结点
		ListNode newtaiL = newHead;
		while (head != null) {
			if (head.val != val) {//newHead不动，只移动newtail
				newtaiL.next = head;
				newtaiL = head;
			}
			head = head.next;
		}
		newtaiL.next = null;
		return newHead.next;
    }
}
