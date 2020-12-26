package alg.leetcode;

import java.util.Stack;

public class No36 {
    public boolean isPalindrome(String s) {
        if (s.length()==0) return true;
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z'||s.charAt(i)>='0'&&s.charAt(i)<='9') {
                sb.append(s.charAt(i));
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb1 = new StringBuilder();
        int len = stack.size();
        for (int i=0;i<len;i++) {
            sb1.append(stack.pop());
        }
        return sb.toString().equalsIgnoreCase(sb1.toString());
    }

    /**
     * 双指针法
     * @param s
     * @return
     */
    public boolean isPalindrome1(String s) {
        int len = s.length();
        if (len==0) return true;
        s = s.toLowerCase();
        int i=0,j=len-1;
        while (i<j) {
            while (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                if (i==len) return true;
            }
            while (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if (s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        new No36().isPalindrome("A man, a plan, a canal: Panama");
    }
}
