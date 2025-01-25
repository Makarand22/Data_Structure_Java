package BinarySearch;

import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int size = sc.nextInt();
        System.out.print("Enter the Array : ");
        int[] arr = new int[size];
        inputArray(arr, size, sc);


        if(checkSorted(arr)) {
            System.out.print("Enter the Element : ");
            int k = sc.nextInt();
            printArray(arr);
            System.out.println("The Index is : " + findIndex(arr, k));
        } else {
            System.out.println("Array is not sorted.....");
        }

    }

    public static void inputArray(int[] arr, int size, Scanner sc ){
        for (int i=0; i<size; i++ ) {
            arr [i] = sc.nextInt();
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("Entered Array : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int findIndex(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right-left)/2 ;
            if(arr[mid] == k) {
                return mid;
            }
            if (arr[mid] < k) {
                left = mid + 1;  // Move left pointer right
            } else {
                right = mid - 1;  // Move right pointer left
            }
        }
        return -1;
    }
    public static boolean checkSorted(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            if(arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }

}
