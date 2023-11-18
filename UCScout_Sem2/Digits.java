import java.util.*;

public class Digits
{
   /** A list of digits */
   private ArrayList<Integer> digitList;

   /** Constructs a list of digits from the given number */
   public Digits(int number)
   {
       // initialize digitList to an empty ArrayList of Integers
       digitList = new ArrayList<Integer>();   
       // Use a while loop to add each digit in number to digitList
       int i = 0;
       while (i > 0)
        {
            digitList.add(0, new Integer(i % 10));
            i /= 10;
        }
       //Use Collections.reverse(digitList); to reverse the digits
   }

   /** returns the string representation of the digits list */
   public String toString()
   {
      return digitList.toString();
   }

   public static void main(String[] args)
   {
      Digits d1 = new Digits(154);
      System.out.println(d1);
   }
}
