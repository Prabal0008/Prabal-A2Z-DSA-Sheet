import java.util.*;

public class HighestFrequencyElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lenght of array: ");
        int n=sc.nextInt();

        int [] arr=new int[n];

        for(int i=0;i<n;i++)
        {
             System.out.println("Enter the array ele: ");
             System.out.println("===============");
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.println("The array ele are: "+arr[i]);
             System.out.println("===============");
        }

        //precompute

        int [] hash=new int[n+1];
    

        for(int i=0;i<n;i++)
        {
            hash[arr[i]]++;
        }

        for(int i=0;i<n+1;i++)
        {
            System.out.println("The HASH array elements are: ########: "+hash[i]);
        }

        //Element to check the max element in the hash array
        int max=hash[0];
         for(int i=0;i<n+1;i++)
        {
            if(hash[i]>max)
                {
                    max=hash[i];

                };

            
        }

        System.out.println("The Max element in Occurence array is: "+(max-1));










    }
    
}
