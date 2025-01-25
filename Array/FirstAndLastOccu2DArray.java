package Array;

import java.util.Scanner;

public class FirstAndLastOccu2DArray {
    public static void main(String[] args) {
        FirstAndLastOccu2DArray obj = new FirstAndLastOccu2DArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array row : ");
        int row = sc.nextInt();
        System.out.print("Enter the Array col : ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        arrayInput(arr);
        System.out.println("Enter the target element : ");
        int target = sc.nextInt();
        findTargetFisrAndLastOccurance(arr, target);
    }
    public static void arrayInput(int[][] arr) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Array");
        for (int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }
    public static void findTargetFisrAndLastOccurance (int[][] arr, int target) {
        String first ="-1";
        String last ="-1";
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    if(first.equals("-1")){
                        first = "row : " + i + ", col : " + j;
                    }
                    last = "row : " + i + " col : " + j;
                }
            }

        }
        if (first.equals("-1")) {
            System.out.println("Target element not found in the array.");
        } else {
            System.out.println("First Occurrence Index: " + first);
            System.out.println("Last Occurrence Index: " + last);
        }
    }
}
