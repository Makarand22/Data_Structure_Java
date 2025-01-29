package MATHS;

import java.util.Scanner;

public class DesimalToAnyBase {
    public static void main(String[] args) {

        DesimalToAnyBase obj = new DesimalToAnyBase();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the number");
        int desimal = sc.nextInt();
        System.out.println("Please Enter the base");
        int base = sc.nextInt();
        obj.desimalToAnyBase(desimal,base );
        obj.desimalToAnyBaseString(desimal, base);
    }
    public void desimalToAnyBase(int desimal, int base){
        int res = 0;
        int index = 0;
        while (desimal > 0){
            int reminder = desimal%base;
            desimal= desimal/base;
            res +=  reminder*Math.pow(10,index);
            index ++;
        }
        System.out.println("desimalToAnyBase : " +  res);
    }

    public void desimalToAnyBaseString(int desimal, int base){
        String binary = "";
        if(desimal == 0){
            binary = "0";
        } else {
            while (desimal > 0){
                int rem = desimal % base;
                binary = binary + rem;
                desimal /= base;
            }
        }
        System.out.println("desimalToAnyBaseString : " + binary);
    }
}
