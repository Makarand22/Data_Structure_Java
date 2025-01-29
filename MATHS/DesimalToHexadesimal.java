package MATHS;

import java.util.Scanner;

public class DesimalToHexadesimal {
    public static void main(String[] args) {
        // Example decimal number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num : ");
        int decimalNumber = sc.nextInt();

        // Calling the method to convert decimal to hexadecimal
        String hexNumber = decimalToHex(decimalNumber);

        // Print the decimal and hexadecimal values
        System.out.println("Decimal: " + decimalNumber);
        System.out.println("Hexadecimal: " + hexNumber);
    }

    // Method to convert decimal to hexadecimal
    public static String decimalToHex(int decimalNumber) {
        // StringBuilder to store the result
        StringBuilder hexString = new StringBuilder();

        // Hex digits
        char[] hexDigits = "0123456789ABCDEF".toCharArray();

        // Loop until the decimal number becomes 0
        while (decimalNumber > 0) {
            // Find remainder when divided by 16 (hexadecimal base)
            int remainder = decimalNumber % 16;

            // Append the corresponding hex digit (remainder is the index)
            hexString.insert(0, hexDigits[remainder]);

            // Update the decimal number by dividing by 16
            decimalNumber = decimalNumber / 16;
        }

        // If the number was 0, handle edge case
        if (hexString.length() == 0) {
            hexString.append("0");
        }

        return hexString.toString();
    }
}
