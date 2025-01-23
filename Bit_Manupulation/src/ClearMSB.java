import java.util.Scanner;

public class ClearMSB {
    // 10100110 --- for i = 4
    // 00000110 --- Ans
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        System.out.println("Enter the Index : ");
        int idx = sc.nextInt();
        clearMSB(num, idx);
    }
    public static void clearMSB(int n, int idx) {
        int mask = (n<<(idx+1)) - 1;
        int ans = n & mask;
        System.out.print("BEFORE:");
        printBits(n);
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
