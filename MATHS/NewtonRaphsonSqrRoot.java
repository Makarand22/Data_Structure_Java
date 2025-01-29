package MATHS;

import java.util.Scanner;

public class NewtonRaphsonSqrRoot {
    public static void main(String[] args) {
        NewtonRaphsonSqrRoot obj = new NewtonRaphsonSqrRoot();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num : ");
        int num = sc.nextInt();
        System.out.println("ANS : " + obj.newtonRaphsonAlgo(num));
    }
    public double newtonRaphsonAlgo(int num){
        // 0.5 * (X + (n/X))   --- formula
        
        double tolerance = 0.001;
        double root;
        double X = num;
        while (true){
            root = 0.5 * (X + (num/X));
            double ans = X - root;
            if(ans < tolerance) {
                break;
            }
            X = root;
        }
        return root;
    }
}
