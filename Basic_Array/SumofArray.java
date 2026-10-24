import java.util.*;
class SumofArray {

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

        int result = sum(arr, n);

        System.out.println("Sum of the elements of the array is: " + result);

        sc.close();
    }

    public static int sum(int arr[], int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }
}
