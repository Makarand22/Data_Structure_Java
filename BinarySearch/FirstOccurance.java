package BinarySearch;

public class FirstOccurance {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 2, 3, 4, 4, 4, 4, 5, 6};
        int left = 0;
        int k = 1;
        int right = arr.length - 1;
        findFirstOccurence(arr, k, left,right);

    }
    public static void findFirstOccurence(int[] arr, int k, int left, int right) {

        while (left <=right) {
            int mid = left + (right-left)/ 2 ;
            if (arr[mid] == k ) {
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    System.out.println("ANS " + mid);
                    return;
                } else {
                    right = mid - 1;
                }
            }
            if (arr[mid] > k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("NOT FOUND");
    }
}
