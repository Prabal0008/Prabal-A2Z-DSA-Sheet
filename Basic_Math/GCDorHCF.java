import java.util.Scanner;
/*Note
Basic   greater%smaller-> (one is zero then other is GCD)*/
public class GCDorHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        GCDorHCF obj = new GCDorHCF();
        int gcd = obj.GCD(num1, num2);
        System.out.println("The GCD (HCF) of " + num1 + " and " + num2 + " is: " + gcd);
    
    }
    public int GCD(int n1, int n2) 
    {
        while(n1>0 && n2>0)
        {
            if(n1>n2)
            {
                n1=n1%n2;
            }
            else
            {
                n2=n2%n1;
            }
        }
        if(n1==0)
        {
            return n2;
        }
        else
        {
            return n1;
        }
    }
}
