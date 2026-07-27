import java.util.Scanner;

public class Print1toNRevBack {
    public static void main(String[] args) 
    {
        System.out.println("Main begin ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        PrintRevNumBacktrack(1,n);
        System.out.println("Main end ");      
    }

    public static void PrintRevNumBacktrack(int i, int n)
    { 

        if(i>n)
            return;
        else
        PrintRevNumBacktrack(i+1,n);
        System.out.println(i);
 
    }
    
}
