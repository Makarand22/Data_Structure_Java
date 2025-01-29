package MATHS;

import java.util.Scanner;

public class PowerOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num : " );
        int num = sc.nextInt();
        System.out.println("Enter the Power : " );
        int pow = sc.nextInt();

        int ans = power(num, pow);
        System.out.println("Answer is : " + ans);
        System.out.println("Result: " + fastPower(num, pow));
    }

    public static int power(int num,int pow){
        int numPower = 1;
        while(pow > 0){
            numPower = numPower  * num;
            pow --;
        }
        return numPower;
    }

    public static int fastPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;  // Base case: any number raised to the power 0 is 1
        }
        // If the exponent is even
        if (exponent % 2 == 0) {
            int halfPower = fastPower(base, exponent / 2);  // Recurse with half the exponent
            return halfPower * halfPower;  // Square the result
        } else {
            // If the exponent is odd
            return base * fastPower(base, exponent - 1);  // Multiply base by the result of exponent - 1
        }
    }
}