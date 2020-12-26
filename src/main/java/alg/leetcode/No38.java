package alg.leetcode;

public class No38 {
    public int strStr(String haystack, String needle) {
        if (needle.length()==0) return 0;
        for (int k=0;k<haystack.length()-needle.length()+1;k++) {
            String s = haystack.substring(k,k+needle.length());
            if (s.equals(needle)) return k;
        }
        return -1;
    }

    public static void main(String[] args) {
        new No38().strStr("a","a");
    }
}
