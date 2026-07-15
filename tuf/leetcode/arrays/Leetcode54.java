package leetcode.arrays;

import java.util.List;
import java.util.ArrayList;

public class Leetcode54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<>(m*n);
        int startRow = 0, endRow = m-1, startCol = 0, endCol = n-1;
        while(startRow<=endRow && startCol<=endCol){
            //Upper
            for(int i = startCol; i<=endCol; i++){
                ans.add(matrix[startRow][i]);
            }
            //right
            for(int i = startRow+1; i<=endRow; i++){
                ans.add(matrix[i][endCol]);
            }
            //bottom
            for(int i=endCol-1; i>=startCol; i--){
                if(startRow==endRow) break;
                ans.add(matrix[endRow][i]);
            }
            //left
            for(int i = endRow-1; i>=startRow+1; i--){
                if(startCol==endCol) break;
                ans.add(matrix[i][startCol]);
            }
            startRow++; endRow--; startCol++; endCol--;
        }
        return ans;
    }
}
