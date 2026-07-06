package tuf.leetcode.strings;

import java.util.*;

public class Leetcode451 {
    public String frequencySort(String s) {
        //Count freq of each char
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->(map.get(b)-map.get(a))); //max priority queue
        pq.addAll(map.keySet());
        StringBuilder ans = new StringBuilder();
        while (!pq.isEmpty()) {
            char ch = pq.poll();
            for(int i=0; i<map.get(ch); i++){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}