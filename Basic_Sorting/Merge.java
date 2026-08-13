import java.util.Scanner;
import java.util.ArrayList;

public class Merge {
   
public void merge(int []arr,int low,int mid,int high)
{
    ArrayList<Integer> list = new ArrayList<>();
    int left=low;
    int right=mid+1;
    while(left<=mid && right<=high)
    {
        if(arr[left]<arr[right])
        {
            list.add(arr[left]);
            left++;

        }
        else
        {
            list.add(arr[right]);
            right++;

        }
    }
    while(left<=mid)
    {
        list.add(arr[left]);
        left++;
    }
      while(right<=high)
    {
        list.add(arr[right]);
        right++;
    }
    for(int i=low;i<=high;i++)
    {
        arr[i]=list.get(i-low);

    }

}    
public void mS(int [] arr,int low,int high)
{
    if(low==high) return;
    int mid=(low+high)/2;
    mS(arr,low,mid);
    mS(arr,mid+1,high);
    merge(arr,low,mid,high);

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
       /*  //Print the elements of the array
         for(int i =0;i<size;i++)
        {
            System.out.println("Elements of the array: "+arr[i]);;
   
        }*/

         // CALL merge sort (missing earlier)
    Merge obj = new Merge();
    obj.mS(arr,0,size-1);

    // Print sorted array
    for(int i =0;i<size;i++)
    {
        System.out.println("Elements of the sorted array: "+arr[i]);
    }
    }

}
