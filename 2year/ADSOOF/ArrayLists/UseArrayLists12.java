import java.util.*;

class UseArrayLists12
// Shows the two different remove methods in class ArrayList
// using arrayList of Integer
{
 public static void main(String[] args) throws Exception
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter some numbers (all on one line, separated by spaces):");
  String line = input.nextLine();
  String[] numbers = line.split(" +");
  ArrayList<Integer> a = new ArrayList<Integer>();
  for(int i=0; i<numbers.length; i++)
      a.add(new Integer(numbers[i]));
  System.out.println("The numbers are stored in an ArrayList");
  System.out.println("The ArrayList is "+a);
  System.out.print("\nEnter a position to delete from the ArrayList: ");
  int pos = input.nextInt();
  int rem=a.remove(pos);
  System.out.println("Number removed is "+rem);
  System.out.println("Changes ArrayList to "+a);
  System.out.print("\nEnter a number to delete from the ArrayList: ");
  Integer num = input.nextInt();
  if(a.remove(num))
     System.out.println("Number has been removed");
  else
     System.out.println("Number not found in the ArrayList");
  System.out.println("ArrayList is now "+a);
 }

}
