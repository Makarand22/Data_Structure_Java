import java.util.Scanner;

public class SetTheIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        // Print binary representation before setting
        System.out.print("Before Set : ");
        printBinary(num);
        System.out.println("Enter the ith position  : ");
        int index = sc.nextInt();

        setBit(num, index);
    }

    public static void setBit(int num, int index) {
        int mask = 1 << index; // Create a mask with 1 at the ith position
        int newNum = num | mask; // Set the ith bit

        // Print binary representation after setting
        System.out.print("After Set  : ");
        printBinary(newNum);
    }

    public static void printBinary(int num) {
        for (int i = 7; i >= 0; i--) { // Print 8 bits (from bit 7 to bit 0)
            int bit = (num >> i) & 1; // Extract the i-th bit
            System.out.print(bit + " ");
        }
        System.out.println();
    }
}
