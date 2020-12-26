package alg.leetcode;

import java.util.HashMap;
import java.util.Map;

public class No24 {
    public boolean containsDuplicate(int[] nums) {
        Map map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i],1);
            }else {
                return false;
            }
        }
        return true;
    }
}
