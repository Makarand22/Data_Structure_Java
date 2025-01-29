package MATHS;

import java.util.Scanner;

public class DesimalToBinary {
    public static void main(String[] args) {

        DesimalToBinary obj = new DesimalToBinary();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the number");
        int desimal = sc.nextInt();
        obj.desimalToBinary(desimal);
        obj.desimalToBinaryString(desimal);
    }
    public void desimalToBinary(int desimal){
        int res = 0;
        int index = 0;
        while (desimal > 0){
            int reminder = desimal%2;
            desimal= desimal/2;
            res +=  reminder*Math.pow(10,index);
            index ++;
        }
        System.out.println("Binary : " +  res);
    }

    public void desimalToBinaryString(int desimal){
        String binary = "";
        if(desimal == 0){
            binary = "0";
        } else {
            while (desimal > 0){
                int rem = desimal % 2;
                binary = binary + rem;
                desimal /= 2;
            }
        }
        System.out.println("desimalToBinaryString : " + binary);
    }
}
