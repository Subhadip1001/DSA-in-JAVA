package Searching;

import java.util.Scanner;

public class binarySearch {
    public static int searchNumber(int[] arr, int tar){
        int str = 0, end = arr.length-1;
        
        while(str <= end){
            int mid = str + (end - str)/2;
            if(arr[mid] == tar){
                return mid;
            }else if(arr[mid] < tar){
                str = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.print("Enter your array size : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter array elements :");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target element : ");
        int target = sc.nextInt();
        System.out.println(searchNumber(arr, target));
        sc.close();
    }
}
