package Bit_Manupulation.src;

import java.util.Scanner;

public class ClearLSB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        System.out.println("Enter the Index : ");
        int idx = sc.nextInt();
        clearLSB(num, idx);
    }
    public static void clearLSB(int num, int idx) {
        int mask = ~((1 <<( idx + 1))-1);
        int ans = num & mask;
        System.out.print("BEFORE:");
        printBits(num);
        System.out.print("AFTER :");
        printBits(ans);
    }
    public static void printBits(int n) {
        for (int i=7; i>=0; i--) {
            int bit = (n>>i) & 1;
            System.out.print(bit);
        }
        System.out.println();
    }
}
