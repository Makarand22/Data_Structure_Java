package MATHS;

import java.util.Scanner;

public class BinaryToDesimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary Num : ");
        int binary = sc.nextInt();

        BinaryToDesimal obj = new BinaryToDesimal();
        obj.BinaryToDesimal(binary);
    }
    public void BinaryToDesimal(int binary){
        int pow = 0;
        int desimal = 0;
        while(binary>0){
            int unitDegit = binary%10;
            desimal= (int) (desimal + unitDegit*Math.pow(2,pow));
            binary/= 10;
            pow ++;
        }
        System.out.println("Desimal : " + desimal);
    }
}
