package alg.leetcode;

public class No33 {
    public int reverse(int x) {
        String s;
        int res = 0;
        int len = 0;
        if (x<0) {
            s = String.valueOf(-x);
            len = s.length()+1;
        }
        else {
            s = String.valueOf(x);
            len = s.length();
        }
        char[] chars = new char[len];
        int start = 0;
        if (x<0) {
            chars[0] = '-';
            start = 1;
        }
        for (int i=s.length()-1,j=start;i>=0;i--,j++) {
            chars[j] = s.charAt(i);
        }
        try {
            res = Integer.parseInt(new String(chars));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return res;
    }
    public int reverse1(int x) {
        int ret = 0;
        int tmp = 0;

        while(x != 0){
            tmp = ret * 10 + x % 10;
            if(tmp / 10 != ret){
                return 0;
            }

            ret = tmp;
            x /= 10;
        }

        return ret;
    }
    public int reverse2(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;//最大整数对10取余为7
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;//最小整数对10取余为-8
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        new No33().reverse(-123);
    }
}
