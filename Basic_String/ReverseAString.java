import java.util.*;

class ReverseAString{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String charcters");
        String s = sc.nextLine();
        System.out.println("The String charcters are: "+s);
        for(int i=0;i<s.length();i++)
        {
          System.out.println("The String charcters are: "+s.charAt(i)); 
        }
        
        String rev="";
        for(int i=s.length();i>0;i--)
        {
         rev=rev+s.charAt(i-1)+"";
        }

        System.out.println("The Reversed String is: "+rev);
        


    }
}