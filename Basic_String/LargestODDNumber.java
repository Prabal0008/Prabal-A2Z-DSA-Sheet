import java.util.*;

public class LargestODDNumber {

public String largeOddNum(String s) {
        String test="";
        for(int i=0;i<s.length();i++)
        {
           if (Character.isDigit(s.charAt(i)) && (s.charAt(i) - '0') % 2 != 0)
            {
                 test=s.substring(0,i+1);
                 test=test.replaceFirst("^0+", "");
                 
            }
                
            else{
                System.out.println("");
            }
        
        }
        return test;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        LargestODDNumber lo=new LargestODDNumber();
        System.out.println(lo.largeOddNum(s));

    
    }
}
