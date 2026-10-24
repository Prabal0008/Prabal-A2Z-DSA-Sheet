import java.util.*;

class SumofArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
        System.out.println("Enter Arrays Elements: ");
        arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) { 
           System.out.println("Elements of an arrays are: " + arr[i]);
        }
        int sum=0;

        for (int i = 0; i < n; i++) { 
            sum=sum+arr[i];
           
        }
        System.out.println("Sum of the elements of the arrays are : "+sum);

    }

}