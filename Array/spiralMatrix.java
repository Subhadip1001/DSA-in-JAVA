package Array;

// LeetCode: 54

import java.util.Vector;

public class spiralMatrix {
    public static Vector solution(int[][] matrix){
        int m=matrix.length, n=matrix[0].length;
        int srow=0, scol=0, erow=m-1, ecol=n-1;
        Vector<Integer> ans = new Vector<>();

        
        while(srow<=erow && scol<=ecol){
            // top
            for(int j=scol; j<=ecol; j++){
                ans.add(matrix[srow][j]);
            }

            // right
            for(int i=srow+1; i<=erow; i++){
                ans.add(matrix[i][ecol]);
            }

            // bottom
            for(int j=ecol-1; j>=scol; j--){
                if(srow == erow){
                    break;
                }
                ans.add(matrix[erow][j]);
            }

            // left
            for(int i=erow-1; i>=srow+1; i--){
                if(scol == ecol){
                    break;
                }
                ans.add(matrix[i][scol]);
            }

            srow++; erow--; scol++; ecol--;
        }


        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        Vector<Integer> ans = new Vector<>();
        ans = solution(matrix);
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i) + "\t");
        }
    }
}
