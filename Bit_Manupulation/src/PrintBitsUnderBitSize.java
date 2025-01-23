import java.util.Scanner;

public class PrintBitsUnderBitSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        System.out.println("Enter the Size widths like 8, 16, or 32 bits : ");
        int size = sc.nextInt();   // widths like 8, 16, or 32 bits
        printBitsUnderBitSIze(num, size);
    }
    public static void printBitsUnderBitSIze(int n, int size) {
        for (int i = size - 1; i >= 0; i--) {
            int bit = (n >> i) & 1;  // Extract the i-th bit
            System.out.print(bit);    // Print the bit
        }
        System.out.println();
    }
}
