import java.util.*;
class BasicsOfString{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String txt="This is First String";
        System.out.println(txt);
          System.out.println(txt.charAt(0));

        System.out.println("Enter the String");
        String word=sc.nextLine();

        System.out.println("The String Output is: "+word);

        System.out.println(word.length());

      


        for(int i=0;i<word.length();i++)
        {
            System.out.println("The Elements in the String are: "+ word.charAt(i));
        }
        
        //Logic for checking the vowels

        int count=0;
      
          for(int i=0;i<word.length();i++)
        {
            char ch = Character.toLowerCase(word.charAt(i));
            if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count++;
            }
            System.out.println("The Elements in the String are: "+ word.charAt(i));
        }
        System.out.println("Total vowels: " + count);




    }
}