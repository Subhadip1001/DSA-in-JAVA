package Searching;
import java.util.Scanner;

public class linearSearch {

    private static int searchNumber(int[] arr, int size, int target){
        for(int i=0; i<size; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
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
        System.out.print("Enter your target value : ");
        int target = sc.nextInt();

        int indx = searchNumber(arr, n, target);
        System.out.println("Target value is present in index " + indx);

        sc.close();
    }
}
