package MATHS;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        CountDigits obj = new CountDigits();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Number of Digits : " + obj.countDigit(num));
    }
    public int countDigit(int num){
        int count = 0;
        if(num == 0){
            return 1;
        }
        while (num > 0) {
            count ++ ;
            num /= 10;
        }
        return count;
    }
}
