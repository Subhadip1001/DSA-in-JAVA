package Array;
import java.util.Scanner;

public class reverseAnArray {

    private static void reverseArray(int[] arr, int n){
        int ptr1,ptr2;
        ptr1 = 0; ptr2 = n-1;
        while(ptr1 < ptr2){
            int temp = arr[ptr1];
            arr[ptr1] = arr[ptr2];
            arr[ptr2] = temp;

            ptr1++;
            ptr2--;
        }
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

        reverseArray(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+"\t");
        }
        sc.close();
    }
}
