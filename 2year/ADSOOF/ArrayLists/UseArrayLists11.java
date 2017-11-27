import java.util.*;

class UseArrayLists11
// Shows reversing, and adding an integer after all occurrences 
// of an integer  constructively in an ArrayList. Uses generic
// static methods from a separate class.
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
  System.out.println("\nThe ArrayList is "+a);
  ArrayListOps.destReverse(a);
  System.out.println("After reversing, the ArrayList is "+a);
  System.out.print("\nEnter two numbers: ");
  int p = input.nextInt(), q=input.nextInt();
  System.out.println("Add "+q+" after every "+p+" in the ArrayList");
  ArrayList<Integer> b=ArrayListOps.constAddAfter(a,p,q);
  System.out.println("\nThe ArrayList created is "+b);
  System.out.println("The original ArrayList is still "+a);
 }

}
