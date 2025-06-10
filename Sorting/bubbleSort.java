package Sorting;

public class bubbleSort {
    public static void sorting(int[] arr, int n){
        for(int i=0; i<n; i++){
            boolean swapped = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        sorting(arr, n);
        System.out.println("Sorted array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
