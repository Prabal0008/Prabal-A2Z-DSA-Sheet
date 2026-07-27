import java.util.Scanner;

public class SumOfFirstNMethod2 {
     public static void main(String[] args) 
    {
        System.out.println("Main begin ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("Sum is : "+PrintsumNumber(n));
        System.out.println("Main end ");      
    }

    public static int PrintsumNumber(int n)
    {
        if(n==0)
        {
           
            return 0;
        }
        else
        { 
            return n+PrintsumNumber(n-1);
        }
       
    }
}
