package Array;

// LeetCode Problem: 169
// Problem: Find the majority element in an array (an element that appears more than n/2 times)

public class majorityElement {
    public static int findMajorityElement(int[] arr){
        int freq = 0, ans = 0;
        for(int i=0; i<arr.length; i++){
            if(freq == 0){
                ans = arr[i];
            }
            if(ans == arr[i]){
                freq++;
            }else{
                freq--;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 1, 2};
        int majorityElement = findMajorityElement(arr);
        if (majorityElement != -1) {
            System.out.println("The majority element is: " + majorityElement);
        } else {
            System.out.println("No majority element found.");
        }
    }
}
