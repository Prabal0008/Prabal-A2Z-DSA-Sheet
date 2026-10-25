import java.util.Scanner;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Length of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Array Element:");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Element of array: " + arr[i]);
        }

        CheckIfArrayIsSorted obj = new CheckIfArrayIsSorted();
        obj.arraySortedOrNot(arr,n);

        System.out.println("The array is sorted : " + obj.arraySortedOrNot(arr,n));

    }

    boolean arraySortedOrNot(int[] arr, int n) {
   
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

}
