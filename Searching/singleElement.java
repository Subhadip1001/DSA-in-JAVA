package Searching;

// LeetCode: 540
// Find the single non-duplicate element in a sorted array where every other element appears twice

public class singleElement {
    public static int searchSingle(int[] nums){
        int n = nums.length;
        if(n == 1) return nums[0];

        int str = 0, end = n-1;
        while(str<=end){
            int mid = str+(end-str)/2;

            // edge cases
            if(mid == 0 && nums[0] != nums[1]) return nums[0];
            if(mid == n-1 && nums[n-1] != nums[n-2]) return nums[n-1];
            
            // Return actual single element
            if(nums[mid-1] != nums[mid] && nums[mid] != nums[mid+1]) return nums[mid];
            
            // If mid is even
            if(mid%2 == 0){
                // 
                if(nums[mid] == nums[mid-1]){
                    end = mid-1;
                }else{
                    str = mid+1;
                }
            // If mid is odd   
            }else{
                if(nums[mid] == nums[mid-1]){
                    str = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
    //    int[] arr = {3,3,7,7,10,11,11};
       int[] arr = {1,1,2,3,3,4,4,8,8};
       int singleElement = searchSingle(arr);
       System.out.println("Single element: " + singleElement);
    }
}
