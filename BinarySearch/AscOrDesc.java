package BinarySearch;

import java.util.Scanner;

public class AscOrDesc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array:");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        if(ascendingSorted(arr)){
            System.out.println("Array is in Ascending Order");
        } else if (descendingSort(arr)){
            System.out.println("Array is in Descending order");
        } else {
            System.out.println("Array is not sorted");
        }
    }
    public static boolean ascendingSorted(int[] arr){
        for (int i=1; i<arr.length; i++) {
            if(arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }
    public static boolean descendingSort(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            if(arr[i] > arr[i-1]) {
                return false;
            }
        }
        return true;
    }
}
