package 栈_队列;

public class _155_最小栈 {
	private Node head = new Node(0, Integer.MAX_VALUE, null);


	public void push(int val) {
    	head = new Node(val, Math.min(val, head.min), head);
    }
    
    public void pop() {
    	head = head.next;
    }
    
    public int top() {
    	return head.val;
    }
    
    public int getMin() {
    	return head.min;
    }
    private class Node {
    	int val;
    	int min;
    	Node next;
    	public Node(int val, int min, Node next) {
    		this.val = val;
    		this.min = min;
    		this.next = next;
		}
    }
}
