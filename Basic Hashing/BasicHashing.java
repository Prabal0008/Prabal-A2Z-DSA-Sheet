import java.util.*;
public class BasicHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenght of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the array elements: ");
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            System.out.println("The array elements: "+arr[i]);
           
        }

        //PreCompute
        int [] hash=new int[13];

        for(int i=0;i<n;i++)
        {
            hash[arr[i]]+=1;
        }

        for(int i=0;i<13;i++)
        {
            System.out.println("==========================");
            System.out.println("Hash arr elements "+i+" "+hash[i]);
        }

       
        System.out.println("Enter the Query ");
        int q=sc.nextInt();
        System.out.println("The Number of occurence of "+q+" is "+hash[q3]);


    }
}