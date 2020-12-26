package alg.leetcode;

import java.util.HashMap;
import java.util.Map;

public class No29 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            map.put(nums[i],i);
        }
        for (int j=0;j<nums.length;j++) {
            if (map.containsKey(target-nums[j])&&j!=map.get(target-nums[j])) {
                res[0]=j;
                res[1]=map.get(target-nums[j]);
                return res;
            }
        }
        return res;
    }
}
