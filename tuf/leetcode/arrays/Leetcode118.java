package leetcode.arrays;

import java.util.List;
import java.util.ArrayList;

public class Leetcode118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            //Add first 1
            row.add(1);
            //Middle elements
            for(int j=1; j<i; j++){
                int ele = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                row.add(ele);
            }
            //Add last
            if(i>0) row.add(1);
            ans.add(new ArrayList<>(row));
        }
        return ans;
    }
}
