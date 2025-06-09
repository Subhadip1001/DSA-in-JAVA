package Searching;

import java.util.Arrays;

public class aggressiveCows {
    public static boolean isPossible(int[] stalls, int n, int m, int minDist){
        int cowsPlaced = 1;
        int lastPlacedCow = stalls[0];

        for(int i=1; i<n; i++){
            if(stalls[i] - lastPlacedCow >= minDist){
                cowsPlaced++;
                lastPlacedCow = stalls[i];
            }

            if(cowsPlaced == m){
                return true;
            }
        }
        return false;
    }
    public static int cowsPlacement(int[] stalls, int cows){
        int n = stalls.length;
        if(n < cows) return -1;
        
        Arrays.sort(stalls);
        int str =0, end = stalls[n-1] - stalls[0];
        int ans = -1;
        while(str <= end){
            int mid = str+(end-str)/2;
            if(isPossible(stalls, n, cows, mid)){
                ans = mid;
                str = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] stalls = {1, 2, 8, 4, 9};
        int cows = 3;
        int result = cowsPlacement(stalls, cows);
        System.out.println("Maximum minimum distance between cows: " + result);
    }
}
