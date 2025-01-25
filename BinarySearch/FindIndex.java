package BinarySearch;

import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input array size and validate
        System.out.print("Enter the Array Size: ");
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("Array size must be greater than zero.");
            return;
        }
        int[] arr = new int[size];
        System.out.print("Enter the Array : ");
        inputArray(arr, sc);
        // Check if array is sorted
        if (!checkSorted(arr)) {
            System.out.println("Array is not sorted...");
            return;
        }
        System.out.print("Enter the Element : ");
        int k = sc.nextInt();
        // Perform binary search and print result
        int index = findIndex(arr, k);
        if (index != -1) {
            System.out.println("The Index is: " + index);
        } else {
            System.out.println("Element not found.");
        }

    }

    public static void inputArray(int[] arr, Scanner sc ){
        for (int i=0; i<arr.length; i++ ) {
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
