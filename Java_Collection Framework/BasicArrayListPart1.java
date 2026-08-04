import java.util.ArrayList;
import java.util.Collections;

class BasicArrayListPart1
{
    public static void main(String args[])
    {
        
    //Creation of array list
    ArrayList<Integer> list = new ArrayList <> ();

    //Add the ele
    list.add(1);
    list.add(2);
    list.add(5);
    System.out.println(list);

    //FETCHING THE ELEMENT IN THE ARRAYLIST
    System.out.println("First Element is : "+list.get(0));

    //To add the element in between the arrayList
    list.add(2, 9);;
      System.out.println(list);

    //Modify the ArrayList
    list.set(0,8);
    System.out.println(list);

    //To Delete element
    list.remove(3);
    System.out.println(list);

    //Size
    System.out.println("Size of the ArrayList is: "+list.size());

    //iteration in the ArrayList
    for(int i=0;i<list.size();i++)
    {
        System.out.print(list.get(i));
    }
     System.out.println();

    //Sorting in the ArrayList 
    Collections.sort(list);
       System.out.println(list);









    }
}