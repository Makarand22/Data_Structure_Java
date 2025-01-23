package Bit_Manupulation.src;

import java.util.Scanner;

public class FindBitOfPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        System.out.println("Enter the index : ");
        int index = sc.nextInt();
        findBitPosition(num, index);
    }

    public static void findBitPosition(int num, int index){
        // Create the mask
        int mask = 1 << index;
        if((num & mask) == 0) {
            System.out.println("The " + index + " positioned bit is : 0 ");
        } else System.out.println("The " + index + " positioned bit is : 1 ");
    }
}
