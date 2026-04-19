package org.com.arrays;

import java.util.HashMap;

public class ValidAnagram {
    public static boolean main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
//        HashMap <Character,Integer> map1 = new HashMap<>();
//        HashMap <Character,Integer> map2 = new HashMap<>();
//
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            map1.put(c,map1.getOrDefault(c,0)+1);
//        }
//
//        for (int i = 0; i < t.length(); i++) {
//            char c = t.charAt(i);
//            map2.put(c,map2.getOrDefault(c,0)+1);
//        }
//
//        if(map1.equals(map2)){
//            System.out.println("same");
//            return;
//        }
//        System.out.println("diff");
        if(s.length() != t.length()){
            return false;
        }
        HashMap <Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c : t.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }

            map.put(c, map.get(c) -1);
            if(map.get(c) == 0){
                map.remove(c);
            }
        }
        return map.isEmpty();
    }
}
