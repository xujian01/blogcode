package alg.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No26 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while(p1 < nums1.length && p2 < nums2.length) {
            if(nums1[p1] < nums2[p2]) p1++;
            else if(nums1[p1] > nums2[p2]) p2++;
            else {
                list.add(nums1[p1]);
                p1++;
                p2++;
            }
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < res.length; i++) res[i] = list.get(i);
        return res;
    }
    public static void main(String[] args) {
        new No26().intersect(new int[]{4,9,5},new int[]{9,4,9,8,4});
    }
}
