package tuf.basics;

import java.util.*;

public class CountFreq{
    static List<List<Integer>> countFreq(int[]arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele: arr){
            map.put(ele, map.getOrDefault(ele, 0)+1);

        }

        List<List<Integer>> ans = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            List<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            ans.add(pair);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[]arr = {1,1,2,2,3,4,4};
        List<List<Integer>> list = countFreq(arr);
        for(List<Integer> item: list){
            System.out.print(item+" ");
        }
    }
}