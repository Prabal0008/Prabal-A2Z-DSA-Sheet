import java.util.*;

public class BasicOFStringApnaCol {

    public static void main(String[] args) {
        // String Declartion
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the String");
        // String s=sc.nextLine();
        // System.out.println("String Elements are: " +s);

        // String Concatenation

        // String fn = "Prabal";
        // String ln = "gade";
        // String fullname = fn + " " + ln;
        // System.out.println(fullname);

        // // //CharAt
        // // for(int i=0;i<fullname.length();i++)
        // // {
        // // System.out.println(fullname.charAt(i));
        // // }

        // // Compare

        // String name1 = "tony";
        // String name2 = "tony";

        // // s1>s2:+v3
        // // s1=s2:0
        // // s1<s2:-ve

        // if (name1.compareTo(name2) == 0) {
        // System.out.println("Equal");

        // } else {
        // System.out.println("NOT Equal");

        // }

        // Substing

        // String sentence="Prabal";
        // System.out.println(sentence.substring(1,3));

        /************ String Builders in Java *************/

        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // CharAt
        System.out.println(sb.charAt(0));

        // Set
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        //insert
        sb.insert(0, 's');
        System.out.println(sb);

        sb.insert(3, 'x');
        System.out.println(sb);

        //delete
        sb.delete(3, 4);
        System.out.println(sb);

        //append-insert at end

        sb.append("PR");
                System.out.println(sb);






    }
}
