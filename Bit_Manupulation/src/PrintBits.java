package Bit_Manupulation.src;

import java.util.Scanner;

public class PrintBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        printBits(num);
    }
    public static void printBits(int n) {
        for ( int i=n; i>0; i--) {
            if((i & 1) == 1) {
                System.out.print("1 ");
            } else System.out.print("0 ");
        }
    }
}
