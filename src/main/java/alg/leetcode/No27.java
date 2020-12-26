package alg.leetcode;

public class No27 {
    public int[] plusOne(int[] digits) {
        for (int i=digits.length-1;i>=0;i--) {
            digits[i]++;
            digits[i] = digits[i]%10;
            if (digits[i]!=0) return digits;
        }
        digits = new int[digits.length+1];
        digits[0]=1;
        return digits;
    }

    public static void main(String[] args) {
        new No27().plusOne(new int[]{4,3,2,1});
    }
}
