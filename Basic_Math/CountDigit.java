import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        CountDigit obj = new CountDigit();

        int result = obj.countDigits(number);

        System.out.println("Total digits: " + result);
    }

    // Logic method
    int countDigits(int number) {
        int count = 0;

        if (number == 0) return 1;

        while (number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }
}