package 排序_数组;

public class _16_16_部分排序 {
	/**
	 *  左右逆序对的位置就是l, r的位置
	 */
	public int[] subSort(int[] array) {
		if (array.length == 0) return new int[] {-1, -1};
		
        int max = array[0];
        int r = -1;
        for (int i = 1; i < array.length; i++) {
			if (array[i] >= max) {
				max = array[i];
			} else {
				r = i;
			}
		}
        //如果如果没有逆序对则提前结束
		if (r == -1) return new int[] {-1, -1};
		
        int min = array[array.length - 1];
        int l = -1;
        for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] <= min) {
				min = array[i];
			} else {
				l = i;
			}
		}
		
		return new int[] {l, r};
    }
}
