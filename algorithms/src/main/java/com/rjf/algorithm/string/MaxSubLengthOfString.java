package com.rjf.algorithm.string;

/*
 *
 *   Rene
 *   2020/7/13 20:48
 */

import java.util.HashMap;
import java.util.Map;

public class MaxSubLengthOfString {

    public static void main(String[] args) {
        // 最长子串长度
        System.out.println(call("aaabbbbcc"));
    }

    static int call(String s) {
        if (s != null && s.length() > 0) {
            char[] chars = s.toCharArray();
            int ans = 0;
            Map<Character, Integer> map = new HashMap<>();
            for (int start = 0, i = 0; i < chars.length; i++) {
                char c = chars[i];
                if (map.containsKey(c)) {
                    start = Math.max(map.get(c), start);
                }
                ans = Math.max(ans, i - start + 1);
                map.put(chars[i], i + 1);
            }
            return ans;

        } else {
            return 0;
        }
    }
}
