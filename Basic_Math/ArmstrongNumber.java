import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        ArmstrongNumber obj = new ArmstrongNumber(); 
        boolean result = obj.isArmstrong(number);
        if (result) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }

    }

    public  boolean isArmstrong(int n)
    {
        int sum=0;
        int original=n;

        while   (n>0)
        {
            int digit=n%10;
            sum=sum+digit*digit*digit;
            n/=10;
        }
        if(original==sum)
        {
            return true;
        }
        else
        {
            return false;
        }
    

    }

    
}
