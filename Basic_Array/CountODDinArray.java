import java.util.Scanner;

public class CountODDinArray {
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
        
        CountODDinArray a = new CountODDinArray();
        a.countOdd(arr,n);
        System.out.println("ODD Element of array: " + a.countOdd(arr,n));
        
    }
    

    public  int countOdd(int[] arr, int n)
     {
        int count=0;
          for (int i = 0; i < n; i++) {
            
            if(arr[i]%2==1)
            {
                count++;
            }
        }
        

        return count;
       

    }
    
}
