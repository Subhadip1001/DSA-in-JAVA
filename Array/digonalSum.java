package Array;

import java.util.Scanner;

public class digonalSum {
    public static int sum(int[][] arr, int n){
        int sum = 0;

        // TC -> O(n*n) 
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         if(i == j){
        //             sum += arr[i][j];
        //         }else if(j == n-i-1){
        //             sum += arr[i][j];
        //         }
        //     }
        // }

        // TC -> O(n)
        for(int i=0; i<n; i++){
            sum += arr[i][i];

            if(i != n-i-1){
                sum += arr[i][n-i-1];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter 2D array size : ");
        int n = sc.nextInt();

        int arr[][] = new int [n][n];
        System.out.println("Enter array elements : ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int ans = sum(arr, n);
        System.out.println("Sum of the digonal numbers : " + ans);
        sc.close();
    }
}
