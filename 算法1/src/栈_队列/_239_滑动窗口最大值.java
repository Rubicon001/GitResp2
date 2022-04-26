package 栈_队列;

import java.util.Deque;
import java.util.LinkedList;

public class _239_滑动窗口最大值 {
    public int[] maxSlidingWindow(int[] nums, int k) {
    	if (nums == null || nums.length == 0 || k < 1) return new int[0];
    	if (k == 1) return nums;
    	
    	int[] maxes = new int[nums.length - k + 1];
    	Deque<Integer> deque = new LinkedList<>();
    	
    	for (int i = 0; i < nums.length; i++) {//i为滑动窗口的结束位置
    		//1. 保证队列里的元素顺序是从头到尾依次递减，如果新加入的元素大于等于队尾元素则删除直到小于为止（队列里的元素是原数组的索引）
			while (!deque.isEmpty() && nums[i] >= nums[deque.getLast()]) {
				deque.removeLast();
			}
			//2. 经过步骤1的操作过后队列里的元素顺序为依次递减，此时将i位置的元素索引入队（从队尾入队）
			deque.addLast(i);
			int w = i - k + 1;//w为滑动窗口的起始位置
			if (w < 0) continue;//滑动窗口未完全进入数组
			
			//3. 队头元素不合法（队头元素处于滑动窗口之前）
			if (deque.getFirst() < w) {
				deque.removeFirst();
			}
			
			//4. 此时队头元素为此滑动窗口的最大值
			maxes[w] = nums[deque.getFirst()];
		}
    	
    	return maxes;
    }
}
