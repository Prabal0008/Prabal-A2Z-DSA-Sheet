import java.util.Scanner;

public class PrintLinearNumber {
    
      public static void main(String[] args) 
    {
        System.out.println("Main begin ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        PrintNumber(1,n);
        System.out.println("Main end ");      
    }

    public static void PrintNumber(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        else
        {
            System.out.println(i);
             PrintNumber(i+1,n);
        }
       
    }
    
}
