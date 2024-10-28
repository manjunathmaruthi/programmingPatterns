package com.manjunath.dotikol.slidingwindow;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountAnagramsInString {

    public static void main(String[] args) {
        String str = "aabaabaa";
        String pattern = "aaba";

        Map<Character, Long> charCountMap = pattern.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        int i = 0;
        int j = 0;
        int k = pattern.length();
        int result = 0;

        while (j < str.length()) {

            if (charCountMap.containsKey(str.charAt(j))) {
                charCountMap.put(str.charAt(j), charCountMap.get(str.charAt(j)) - 1);
            }

            if (j-i+1 < k) {
                j++;
            } else if (j-i+1 == k) {
                Long countValue = charCountMap.values().stream().filter(val -> val != 0).count();
                if (countValue.intValue() == 0) {
                    result++;
                }
                i++;
                j++;
            }

        }

        System.out.println(result);

    }
}
