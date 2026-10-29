import java.util.*;
public class Palindrome 
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String Elements: ");
        String s=sc.nextLine();
        System.out.println("Enter the String Elements: "+s);

         StringBuilder sb=new StringBuilder(s);
         System.out.println("Enter the String Elements: "+sb);

         for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;

            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);



         }

         System.out.println("Reversed String is : "+sb);

      






        
    }

     
    
}
