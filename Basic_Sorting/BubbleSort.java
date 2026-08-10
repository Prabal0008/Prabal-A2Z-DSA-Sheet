import java.util.Scanner;

public class BubbleSort {

    public int[] bubbleSort(int[] nums) {
    int n = nums.length;

    for (int i = n - 1; i >= 1; i--) {
        for (int j = 0; j <= i - 1; j++) {
            if (nums[j] > nums[j + 1]) {
                int temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
            }
        }
    }

    return nums;
}
   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int [] arr= new int[size];
        System.out.println("Enter the array elements");
        for(int i =0;i<size;i++)
        {
            arr[i]=sc.nextInt();
      
        }
        //Print the elements of the array
         for(int i =0;i<size;i++)
        {
            System.out.println("Elements of the array: "+arr[i]);;
   
        }

            // Call the returning bubbleSort method
    BubbleSort obj = new BubbleSort();
    arr = obj.bubbleSort(arr);
         System.out.println("\nAfter sorting:");
        for(int i =0;i<size;i++)
        {
            System.out.print(arr[i]+" ");;
   
        }

    }

    




    
}
