package 栈_队列;

import java.util.Stack;

public class _739_每日温度 {
	//动态规划
	public int[] dailyTemperatures2(int[] temperatures) {
    	int[] values = new int[temperatures.length];
    	for (int i = temperatures.length - 2; i >= 0; i--) {
			int j = i + 1;
			while (true) {
				if (temperatures[i] < temperatures[j]) {
					values[i] =j - i;
					break;
				}
				if (temperatures[i] == temperatures[j]) {
					if (values[j] == 0) {
						values[i] = 0;
					} else {
						values[i] = values[j] + j - i;
					}
					break;
				}
				if (temperatures[i] > temperatures[j]) {
					if (values[j] == 0) {
						values[i] = 0;
						break;
					} else {
						j = j + values[j];
					}
				}
			}
		}
    	
    	return values;
    }
    public int[] dailyTemperatures(int[] temperatures) {
    	Stack<Integer> stack = new Stack<>();
    	int[] result = new int[temperatures.length];
    	
    	for (int i = 0; i < temperatures.length; i++) {
			while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
				int pre = stack.pop();
				result[pre] = i - pre;
			}
			stack.push(i);
		}
    	
    	return result;
    }
}
