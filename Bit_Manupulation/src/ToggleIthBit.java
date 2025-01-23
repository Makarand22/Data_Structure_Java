package Bit_Manupulation.src;

import java.util.Scanner;

public class ToggleIthBit {
    // 1 <--> 0
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextByte();
        System.out.println("Enter the Index : ");
        int idx = sc.nextByte();
        toggle(n,idx);
    }
    public static void toggle(int n, int idx) {
        int mask = 1 << idx;
        int newNum = n ^ mask ;
        System.out.print("Before Toggle : ");
        printBinary(n);
        System.out.print("After Toggle  : ");
        printBinary(newNum);
    }
    public static void printBinary(int num) {
        for (int i = 7; i>=0; i--) {
            int bit = (num >> i) & 1;
            System.out.print(bit + " ");
        }
        System.out.println();
    }
}
