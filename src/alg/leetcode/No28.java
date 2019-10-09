package alg.leetcode;

public class No28 {
    public void moveZeroes(int[] nums) {
        int i=0;
        for (int j=0;j<nums.length;j++) {
            if (nums[j]!=0) {
                nums[i]=nums[j];
                i++;
            }
        }
        for (int p=i;p<nums.length;p++) {
            nums[p]=0;
        }
    }
}
