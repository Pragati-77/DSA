import java.util.*;

public class bin_recursuve {
    
    static int binarySearch(int arr[], int low, int high, int key) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == key) {
            return mid;
        }
        else if (key < arr[mid]) {
            return binarySearch(arr, low, mid - 1, key);
        }
        else {
            return binarySearch(arr, mid + 1, high, key);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {2, 4, 6, 8, 10, 12, 14};

        System.out.println("Enter element to search:");
        int key = sc.nextInt();

        int result = binarySearch(arr, 0, arr.length - 1, key);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + result);
    }
}