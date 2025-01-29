package MATHS;

import java.util.Scanner;

public class DivisorsOfNum {
    public static void main(String[] args) {
        DivisorsOfNum obj = new DivisorsOfNum();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num : ");
        int num = sc.nextInt();

        for (int i=1; i<num; i++){
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
