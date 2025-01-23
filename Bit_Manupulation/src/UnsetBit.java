import java.util.Scanner;

public class UnsetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        System.out.println("Enter the ith position  : ");
        int index = sc.nextInt();
        unsetBit(num, index);
    }
    public static void unsetBit(int n, int idx){
        int mask = 1 << idx;
        int newNum = n ^ mask;
        System.out.print("Before Unset : ");
        printBinary(n);
        System.out.print("After Unset  :");
        printBinary(newNum);
    }
    public static void printBinary(int num ) {
        for (int i=7; i>=0; i--) {
            int bit = (num >> i ) & 1;
            System.out.print(bit);
        }
        System.out.println();
    }
}
