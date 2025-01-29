package MATHS;

import java.util.Scanner;

public class DivisorBySqrRootMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num : ");
        int num = sc.nextInt();
        divisorBySqrRootMethod(num);
    }
    public static void divisorBySqrRootMethod(int num){
        int square = (int) Math.sqrt(num);
        int counter = 1;
        while (counter <= square) {
            if(num % counter == 0) {
                System.out.println(counter);
                if (counter != num/counter){
                    System.out.println(num/counter);
                }
            }
            counter ++;
        }
    }
}