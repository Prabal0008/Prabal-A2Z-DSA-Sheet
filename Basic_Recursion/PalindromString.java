import java.util.*;
public class PalindromString 
{
    static int i=0;
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.next();
        System.out.println("String: "+s);
        PalindromString obj = new PalindromString();
        boolean result = obj.palindromeCheck(s);
        System.out.println("Is Palindrome: " + result);

    }
    public boolean palindromeCheck(String s) {
       
         if (i >= s.length() / 2)
            return true;

        if (s.charAt(i) != s.charAt(s.length() - 1 - i))
            return false;
        i++;
        return palindromeCheck(s);
        
    }


}
    

