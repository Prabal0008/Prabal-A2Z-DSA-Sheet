import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Main begin ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

        System.out.println("Fibbonacii is : "+fib(n));
        System.out.println("Main end ");  
        
    }

    public static int fib(int n) 
    {
        if(n<=1)
        {
          return n;

        }
        else
        {
            return fib(n-1)+fib(n-2);
        }
            
        

    }
}
