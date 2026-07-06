package tuf.leetcode.strings;

import java.util.HashMap;

public class Leetcode205 {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (mapS.containsKey(c1) && mapS.get(c1) != c2) {
                return false;
            }
            mapS.put(c1, c2);
            if (mapT.containsKey(c2) && mapT.get(c2) != c1) {
                return false;
            }
            mapT.put(c2, c1);
        }
        return true;
    }
}