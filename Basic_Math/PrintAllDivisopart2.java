import java.util.Arrays;
import java.util.Scanner;

public class PrintAllDivisopart2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();  
        PrintAllDivisopart2 obj = new PrintAllDivisopart2();
        int[] result = obj.divisors(number);
        System.out.println("Divisors are:");
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
}

    public int[] divisors(int n) {

          // Step 1: Count number of divisors
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        
        // Step 2: Create array of exact size
        int[] divisors = new int[count];
        int index = 0;        
        for (int i = 1; i <= Math.sqrt(n); i++) {
        
            if (n % i == 0) {
              divisors[index]=i;
              index++;
              if((n/i)!=i){
                divisors[index]=n/i;
                index++;
              }
            }
        }
        
        return divisors;

    }

    
}
