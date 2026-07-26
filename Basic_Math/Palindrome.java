import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        Palindrome p = new Palindrome();
        if (p.isPalindrome(number)) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
        
    boolean isPalindrome(int n) {
        int reverse = 0;    
        int original = n;  
            while (n > 0) {
              int digit = n % 10;
               reverse = reverse * 10 + digit;
               n /= 10;
            } 
            if (original == reverse) {
                return true;
            } else {
                return false;
            }
      
    }
}
    


        

   
