package Array;

import java.util.Scanner;

public class sumAndProduct {
    private static int sumOfArray(int[] arr){
        if(arr.length == 1) return arr[0];

        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    private static int productOfArray(int[] arr){
        if(arr.length == 1) return arr[0];

        int product = 1;
        for(int i=0; i<arr.length; i++){
            product *= arr[i];
        }
        return product;
    }

    public static void main(String[] args) {
       System.out.print("Enter your array size : ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter your array elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum of whole array is : " + sumOfArray(arr));
        System.out.println("Product of whole array is : " + productOfArray(arr));

        sc.close();
    }
}
