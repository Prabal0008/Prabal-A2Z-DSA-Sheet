import java.util.Scanner;

public class Print1toNBacktrcking {

    public static void main(String[] args) 
    {
        System.out.println("Main begin ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        PrintNumBacktrack(n,n);
        System.out.println("Main end ");      
    }

    public static void PrintNumBacktrack(int i, int n)
    { 

        if(i<1)
            return;
        else
        PrintNumBacktrack(i-1,n);
        System.out.println(i);

    }
    
}
