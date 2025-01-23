import java.util.Scanner;

public class NoOfSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();

        System.out.println("Number if set bits : " + noOfSetBits(num));
    }
    public static int noOfSetBits(int num) {
        int count = 0;
        for ( int i=7; i>=0; i--) {
            if((num>>i & 1) == 1) {
                count ++;
            }
        }
        return count;
    }
}
