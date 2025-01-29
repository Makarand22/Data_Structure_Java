package MATHS;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Num2 : ");
        int num2 = sc.nextInt();
        System.out.println("ANS : " + GCD(num1, num2));
    }
    public static int GCD(int num1, int num2) {
        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);
        int ans = 0;
        for (int i=min; i>0; i--) {
            if (min % i == 0 && max % i ==0 ) {
                return i;
            }
        }
        return ans;
    }
}
