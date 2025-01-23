import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        powerOfTwo(num);
    }
    public static void powerOfTwo(int num) {
        if((num & (num - 1) )== 0) {
            System.out.println("Number " +num + " is Power of 2");
        } else System.out.println("Not Power of 2");
    }
}
