package MATHS;

import java.util.Scanner;

public class CountDigitUsingLog {
    public static void main(String[] args) {
        CountDigitUsingLog obj = new CountDigitUsingLog();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        long num = sc.nextLong();
        System.out.println("Number of Digits : " + obj.countDigitUsingLog(num));
    }

    private int countDigitUsingLog(long num) {
        int ans = 0;
        if(num == 0) {
            return 1;
        } else {
            ans = (int)(Math.log(num) / Math.log(10) + 1);
        }
        return ans;
    }
}
