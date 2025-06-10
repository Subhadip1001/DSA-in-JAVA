package Sorting;

public class insertionSort {
    public static void sorting(int[] arr, int n){
        for(int i=1; i<n; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        int n = arr.length;
        sorting(arr, n);
        System.out.println("Sorted array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
