package alg.leetcode;

import java.util.HashMap;
import java.util.Map;

public class No35 {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> map1 = new HashMap<>();
        for (int i=0;i<s.length();i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)+1);
        }
        for (int i=0;i<s.length();i++) {
            if (!map.get(s.charAt(i)).equals(map1.get(s.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            //两个字符串的相同字符出现的次数互相抵消
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) {
                //没有抵消完，就认为两个字符串同一个字符的个数不同
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new No35().isAnagram("anagram","nagaram");
    }
}
