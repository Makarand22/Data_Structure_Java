import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter The Num2 : ");
        int num2 = sc.nextInt();

        swapTwoNum(num1, num2);
    }
    public static void swapTwoNum(int n1, int n2){
        System.out.println("Before Swapping "+n1 +" "+ n2);
        n1 = n1 ^ n2 ;
        n2 = n1 ^ n2 ; // n2 = ((n1 ^ n2) ^ n2)  -- n2 will get cancel -> n2 = n1
        n1 = n1 ^ n2 ; // n1 = ((n1 ^ n2) ^ n1)  -- n1 will get cancel -> n1 = n2
        System.out.println("After Swapping  "+n1 +" "+ n2);
    }
}
