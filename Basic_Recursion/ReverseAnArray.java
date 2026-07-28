import java.util.Scanner;

public class ReverseAnArray {
 static int i=0;
    public static void main(String[] args)
     {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int n=sc.nextInt();
        int arr []= new int[n];
        System.out.println("Enter " + n + " elements:");
         for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ReverseAnArray obj = new ReverseAnArray();
        obj.reverse(arr, n);

         System.out.println("\nReversed array:");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
    
    public void reverse(int[] arr, int n)
    {
    if (i>=(n/2)) return;
    else
    {
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        i++;
        reverse( arr, n);

    }
}
    
    
}
