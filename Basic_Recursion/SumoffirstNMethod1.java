import java.util.Scanner;

public class SumoffirstNMethod1 {
     public static void main(String[] args) 
    {
        System.out.println("Main begin ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        PrintsumNumber(n,0);
        System.out.println("Main end ");      
    }

    public static void PrintsumNumber(int i,int sum)
    {
        if(i<1)
        {
            System.out.println(sum);
            return;
        }
        else
        { 
             PrintsumNumber(i-1,sum+i);
        }
       
    }
}
    
    

