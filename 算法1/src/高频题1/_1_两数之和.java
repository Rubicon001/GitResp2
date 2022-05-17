package 高频题1;

import java.util.HashMap;

public class _1_两数之和 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer idx = map.get(target - nums[i]);
            if (idx != null) return new int[] {i, idx};
            map.put(nums[i], i);
        }

        return null;
    }
}
