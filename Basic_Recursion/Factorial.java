import java.util.Scanner;

public class Factorial {
    public static void main(String[] args)
     {
        System.out.println("Main begin ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("factorial is : "+factorial(n));
        System.out.println("Main end ");  
        
    }
    

     public static int factorial(int n)
    {
        if(n==0)
        {
           
            return 1;
        }
        else
        { 
            return n*factorial(n-1);
        }
       
    }
}
