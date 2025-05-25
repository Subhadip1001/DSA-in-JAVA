package Array;
import java.util.Scanner;

public class smallestnoOFArray {
    public static void main(String[] args) {
        System.out.print("Enter your array size : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter array elements :");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int minVal = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            minVal = Math.min(minVal, arr[i]);
        }

        System.out.println("The smallest number in the array is: " + minVal);
        sc.close();
    }
}
