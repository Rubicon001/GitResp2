package 排序_数组;


public class _88_合并两个有序数组 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		//nums1 = [1,2,3,0,0,0], m = 3, 
		//nums2 = [2,5,6], n = 3
		int i1 = m - 1;
		int i2 = n - 1;
		int cur = nums1.length - 1;
		while (i2 >= 0) {
			if (i1 >= 0 && nums1[i1] > nums2[i2]) {//条件必须这么写，因为当nums1先结束需要用else来挪nums2的元素
				nums1[cur--] = nums1[i1--];
			}else {//当nums1数组元素已经用完，直接将nums2数组的元素挪到nums1剩下的位置中
				nums1[cur--] = nums2[i2--];
			}
		}
    }
	
}
