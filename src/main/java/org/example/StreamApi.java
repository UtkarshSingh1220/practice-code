package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApi {

    public static void main(String[] args) {
        String string = "utkarshsingh";
        System.out.println(mapOccuranceStr(string));
    }

    public static Map<Character, Long> occuranceStream(String str) {

        char[] chrr = str.toCharArray();

        Map<Character, Long> map = str.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(e-> e, Collectors.counting()));
        return map;
    }
    public static String reverseStr(String str) {

        char[] chrr = str.toCharArray();

        Map<Character, Long> map = str.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(e-> e, Collectors.counting()));
        return map.toString();
    }

    public static String mapOccuranceStr(String str) {
        Map<Character, Integer> mapp = new HashMap<>();
        for (char c : str.toCharArray()){
            mapp.put(c, mapp.getOrDefault(c, 0  )+1);
        }
        return mapp.toString();

//        Map<Character, Integer> map = str.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(e-> e, Collectors.counting()));
//        return map.toString();
    }


}
