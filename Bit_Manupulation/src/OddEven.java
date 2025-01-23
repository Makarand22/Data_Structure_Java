import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // if LSB is 1 = odd  ---- leftmost bit
        // if MSB is 0 = even ---- Rightmost Bit
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        oddEven(num);
    }

    public static void oddEven(int num) {
        if((num & 1) == 1){
            System.out.println("Odd Number");
        } else System.out.println("Even Number");
    }
}
