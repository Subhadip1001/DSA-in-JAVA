package Array;

// LeetCode Problem: 53

public class maxSubarraySum {
    public static int maximumSubArray(int[] arr){
        if(arr.length == 1) return arr[0];
        if(arr.length == 0) return 0;
        
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for(int val:arr){
            currSum += val;
            maxSum = Math.max(currSum, maxSum);
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum subarray sum is: " + maximumSubArray(arr));
    }
}
