package MATHS;

import java.util.Scanner;

public class ArmstrongNum {
    // EX : 153 ... 3 digit num
    // 1*1*1 + 5*5*5 + 3*3*3 = 153
    public static void main(String[] args) {
        ArmstrongNum obj = new ArmstrongNum();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        int count = obj.countDigit(num);
        System.out.println("Ans : " + obj.checkArmstrong(num, count));
    }

    public int countDigit(int num){
        int count = 0;
        if(num == 0){
            return count;
        } else {
            count = (int) (Math.log(num) / Math.log(10) + 1);
        }
        return count;
    }

    public boolean checkArmstrong(int num, int count ){
        int temp = num;
        int sum = 0;
        if (num == 0){
            return false;
        } else {
            while (temp > 0) {
                int unitDigit = temp % 10;
                sum = (int) (sum + Math.pow(unitDigit, count));
                temp /= 10;
            }
            return num == sum;
        }
    }
}

