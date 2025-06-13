package Array;

// LeetCode: 88
// Problem Statement: Merge two sorted arrays into one sorted array.

public class mergeSortedArray {
    public static void merge(int[] arr1, int m, int[] arr2, int n){
        int indx = m+n-1, i=m-1, j=n-1;

        while(i>=0 && j>=0){
            if(arr1[i] >= arr2[j]){
                arr1[indx--] = arr1[i--];
            }else{
                arr1[indx--] = arr2[j--];
            }
        }

        while(j>=0){
            arr1[indx--] = arr2[j--];
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 0, 0, 0, 0};
        int m = 4;
        int[] arr2 = {2, 4, 6, 8};
        int n = 4;
        merge(arr1, m, arr2, n);
        
        System.out.print("Merged array: ");
        for(int i=0; i<m+n; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
