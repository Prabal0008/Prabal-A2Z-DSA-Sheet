import java.util.Scanner;

public class PrintReverseNumberInLinear {

     public static void main(String[] args) 
    {
        System.out.println("Main begin ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        PrintRevNumber(1,n);
        System.out.println("Main end ");      
    }

    public static void PrintRevNumber(int i,int n)
    {
        if(n<1)
        {
            return;
        }
        else
        {
            System.out.println(n);
             PrintRevNumber(i,n-1);
        }
       
    }
    
}
