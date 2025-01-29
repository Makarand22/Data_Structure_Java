package MATHS;

import java.util.Scanner;

public class PalindromNum {
    public static void main(String[] args) {
        // 101 <-> 101
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num : ");
        int num = sc.nextInt();
        System.out.println("ANS : " + checkPalindrom(num));

    }
    public static boolean checkPalindrom(int n){
        int temp = n;
        int ans = 0;
        while(temp > 0) {
            int digit = temp % 10;
            ans = ans*10 + digit;
            temp /= 10;
        }
        return n == ans;
    }
}
