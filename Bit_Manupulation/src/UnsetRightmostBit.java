import java.util.Scanner;

public class UnsetRightmostBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        unsetRightMostBit(num);
    }
    public static int unsetRightMostBit(int n) {
        int newNum = (n & n-1);
        System.out.print("Before :");
        printBits(n);
        System.out.print("After  :");
        printBits(newNum);
        return (n&n-1);
    }
    public static void printBits(int n) {
        for (int i=7; i>=0; i--) {
            int bit = (n>>i) & 1;
            System.out.print(bit + "");
        }
        System.out.println();
    }
}
