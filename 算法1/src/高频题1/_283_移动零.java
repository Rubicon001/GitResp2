package 高频题1;

public class _283_移动零 {
    public void moveZeroes(int[] nums) {
        if (nums == null && nums.length == 0) return;
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;
            if (cur != i) {
                nums[cur] = nums[i];
                nums[i] = 0;
            }
            cur++;
        }
    }
}
