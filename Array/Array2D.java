package Array;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Row : ");
        int row = sc.nextInt();
        System.out.print("Enter the Column : ");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        takeInput(row, col, matrix);
        printArray(row, col,matrix);
    }
    public static void takeInput(int row, int col, int[][] matrix) {
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                System.out.print("Enter element for "+i+" index and "+ j + "row : ");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }
    public static void printArray(int row, int col, int[][] matrix) {
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
