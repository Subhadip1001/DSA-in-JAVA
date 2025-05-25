package Array;

// LeetCode Problem: 136

public class singleNumber {
    private static int findSingleNumber(int[] arr) {
        int ans = 0;
        for(int val:arr){
            ans = ans ^ val;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println("Single number in the array is : " + findSingleNumber(arr));
    }
}
