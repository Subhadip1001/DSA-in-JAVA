package Array;

// LeetCode Problem: 50
// Problem: Implement pow(x, n), which calculates x raised to the power n (x^n).

import java.util.Scanner;

public class binaryExponentiation {
    public static double myPow(int x, int n){
        if(n == 0){
            return 1.0;
        }
        if(x == 0){
            return 0.0;
        }
        if(n == 1){
            return x;
        }
        if(n == -1){
            return 1.0 / x;
        }

        long binForm = n;
        double ans = 1.0;

        if(binForm < 0){
            x = 1 / x;
            binForm = -binForm;
        }

        while(binForm > 0){
            if(binForm % 2 == 1){
                ans *= x;
            }
            x *= x;
            binForm /= 2;
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int x = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int n = sc.nextInt();
        System.out.println("Result: " + myPow(x, n));

        sc.close();
    }
}
