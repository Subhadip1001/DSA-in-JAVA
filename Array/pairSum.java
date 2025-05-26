package Array;

import java.util.Vector;

public class pairSum {
    public static Vector<Integer> findPairsWithSum(Vector<Integer> nums, int target){
        Vector<Integer> result = new Vector<>();
        int str=0, end=nums.size() - 1;

        if(nums.size() < 2) {
            return result; // Not enough elements to form a pair
        }
        
        while(str < end){
            int sum = nums.get(str) + nums.get(end);
            if(sum == target){
                result.add(str);
                result.add(end);
                return result; // Return the indices of the pair
            }else if(sum < target){
                str++;
            }else{
                end--;
            }
        }
        return result; // Return an empty vector if no pair is found
    }
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();
        nums.add(2);
        nums.add(7);
        nums.add(11);
        nums.add(15);
        int targetSum = 9;
        System.out.println("Pairs with sum " + targetSum + ":");
        Vector<Integer> res = findPairsWithSum(nums, targetSum);
        if(res.isEmpty()) {
            System.out.println("No pairs found.");
        } else {
            System.out.println("Indices: " + res.get(0) + ", " + res.get(1));
            System.out.println("Values: " + nums.get(res.get(0)) + ", " + nums.get(res.get(1)));
        }
    }
}
