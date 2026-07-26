import java.util.Scanner;

public class ReverseAnumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        ReverseAnumber obj = new ReverseAnumber();
        System.out.println("The reverse of the number is: " + obj.reverseNumber(number));
    }

    // Logic method
    int reverseNumber(int number) {
        int reverse = 0;      
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
           
        }

        return reverse;
    }
}