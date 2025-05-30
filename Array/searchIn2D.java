package Array;

// LeetCode Problem: 74
// Search a 2D Matrix

public class searchIn2D {
    public static boolean searchElement(int[][] mat, int target, int row){
        int n = mat[0].length;
        int str = 0, end = n-1;

        while(str <= end){
            int mid = str+(end-str)/2;

            if(target == mat[row][mid]){
                return true;
            }else if(target > mat[row][mid]){
                str = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }
    public static boolean searchRow(int[][] mat, int target){
        int m = mat.length, n = mat[0].length;
        int strRow = 0, endRow = m-1;

        while(strRow <= endRow){
            int midRow = strRow + (endRow - strRow)/2;

            if(target >= mat[midRow][0] && target <= mat[midRow][n-1]){
                return searchElement(mat, target, midRow);
            }else if(target >= mat[midRow][n-1]){
                strRow = midRow + 1;
            }else{
                endRow = midRow - 1;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        boolean ans = searchRow(matrix, target);
        System.out.println(ans);
    }
}
