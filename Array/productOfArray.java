package Array;

//LeetCode Problem: 238
// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

public class productOfArray {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for(int i=0; i<n; i++) {
            ans[i] = 1;
        }

        for(int i=1; i<n; i++){
            ans[i] = ans[i-1] * nums[i-1];
        }

        int suffix = 1;
        for(int i=n-2; i>=0; i--){
            suffix *= nums[i+1];
            ans[i] *= suffix;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);
        for(int num : result) {
            System.out.print(num + " ");
        }
    }
}
