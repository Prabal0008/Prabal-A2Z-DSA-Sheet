import java.util.*;
public class SelectionSort {

    public static void selection_sort(int arr[],int size)
    {
        for(int i=0;i<=size-2;i++)    
            {
                int  min = i;
                for(int j=i;j<=size-1;j++)
                {
                    if(arr[j]<arr[min])
                    {
                        min=j;

                    }
                }
                //swapping code
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;

            }

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

        selection_sort(arr,size);
        for(int i =0;i<size;i++)
        {
            System.out.print(arr[i]);;
   
        }




    }
}
