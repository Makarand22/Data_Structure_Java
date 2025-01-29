package MATHS;

import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CalculatorApplication operations = new CalculatorApplication();

        int repetations = 0;
        operations.proceed(repetations);
        while (repetations < 5 && operations.proceed(repetations)) {

            System.out.println("Enter first number");
            int num1 = sc.nextInt();
            System.out.println("Enter second number");
            int num2 = sc.nextInt();
            System.out.println("Choose an operation : { +, -, *, /, % } ");
            String input = sc.next();
            char inp = input.charAt(0);
            operations.performOperations(inp, num1, num2);
            repetations ++;

        }
    }


    public boolean proceed(int repe) {
        if( repe > 0){
            Scanner sc = new Scanner(System.in);
            System.out.println("Want to procced again ? : { Yes / No } ");
            String proccedFlag = sc.nextLine();
            if (proccedFlag.equals("yes")){
                return true;
            } else {
                return false;
            }
        }
        return true;


    }

    public void performOperations(char ch, int num1, int num2){

        switch (ch){
            case '+':
                System.out.println(num1+ " + " +num2 + " = " + (num1+num2));
                break;
            case '-':
                System.out.println(num1+ " - " +num2 + " = " + (num1-num2));
                break;
            case '*':
                System.out.println(num1+ " * " +num2 + " = " + (num1*num2));
                break;
            case '/':
                System.out.println(num1+ " / " +num2 + " = " + (num1/num2));
                break;
            case '%':
                System.out.println(num1+ " % " +num2 + " = " + (num1%num2));
                break;
            default:
                System.out.println("Unknown Character");

        }
    }
}
