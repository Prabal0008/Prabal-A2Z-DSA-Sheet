/*A prime number is a number which has only 2 factors */
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); 
        PrimeNumber pn = new PrimeNumber();
        if(pn.isPrime(number))  
        {
            System.out.println(number+" is a prime number");
        }
        else
        {
            System.out.println(number+" is not a prime number");
        }

    }    
    public boolean isPrime(int n) 
    {
        //Step 1:Create a exact ;eength array to store the factors of the number
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        //Step 2:creeta an array of exact size
        int[] factors = new int[count];
        int index = 0;
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                factors[index]=i;
                index++;
                if((n/i)!=i)
                {
                    factors[index]=n/i;
                    index++;
                }
            }
        }
        if(factors.length==2)
        {
            return true;
        }
        else
        {
            return false;
        }
          
    }
}
