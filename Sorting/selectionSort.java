package Sorting;

public class selectionSort {
    public static void sorting(int[] arr, int n){
        for(int i=0; i<n; i++){
            int smallIndx = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[smallIndx]){
                    smallIndx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallIndx];
            arr[smallIndx] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {6, 5, 12, 2, 1};
        int n = arr.length;
        sorting(arr, n);
        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
