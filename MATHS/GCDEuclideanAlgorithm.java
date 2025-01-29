package MATHS;

import java.util.Scanner;

public class GCDEuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Num2 : ");
        int num2 = sc.nextInt();
        int gcd = euclideanAlgorithm(num1, num2);
        System.out.println("GCD: " + gcd);
    }

    // Euclidean Algorithm to calculate GCD
    public static int euclideanAlgorithm(int num1, int num2) {
        // Continue until the second number becomes 0
        while (num2 != 0) {
            int remainder = num1 % num2;  // Find remainder
            num1 = num2;  // Set num1 as num2
            num2 = remainder;  // Set num2 as the remainder
        }
        return num1;  // The GCD is now stored in num1
    }
}
