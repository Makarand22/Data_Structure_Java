package MATHS;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        System.out.println("ANS : " + checkPrime(num));

    }
    public static boolean checkPrime(int num){
        int sqr = (int) Math.sqrt(num);
        if(num == 1){
            return false;
        }
        int counter = 2;
        while (num % counter == 0 && counter <= sqr ){
            return false;

        }
        return true;
    }
}
