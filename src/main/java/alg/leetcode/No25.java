package alg.leetcode;

public class No25 {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int num: nums) {
            ans ^= num;
        }
        return ans;
    }
}
