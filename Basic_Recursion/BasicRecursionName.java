import java.util.Scanner;
public class BasicRecursionName {

    static int count=1;
    public static void main(String[] args) 
    {
        System.out.println("Main begin ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        PrintName(1,n);
        System.out.println("Main end ");      
    }

    public static void PrintName(int i, int n)
    { 

        if(i>n)
            return;
        else
        System.out.println("prabal");
       
        PrintName(i+1,n);

    }
}
