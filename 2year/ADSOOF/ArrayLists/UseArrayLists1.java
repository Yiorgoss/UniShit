import java.util.*;

class UseArrayLists1
// Demonstrates changing all occurrences of an integer in an 
// ArrayList of integers to another integer destructively, 
// showing difference between aliasing and copying.
// Includes method to create new unset ArrayList of given length
// and static method to copy in order to program ArrayLists like 
// arrays - note this is NOT a good way to copy ArrayLists!
{
 public static void main(String[] args) throws Exception
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter some numbers (all on one line, separated by spaces):");
  String line = input.nextLine();
  String[] numbers = line.split(" +");
  ArrayList<Integer> a = makeArrayListInt(numbers.length);
  for(int i=0; i<numbers.length; i++)
      a.set(i,new Integer(numbers[i]));
  System.out.println("The numbers are stored in an ArrayList");
  ArrayList<Integer> b=a;
  ArrayList<Integer> c=copy(a);
  System.out.println("\nThe ArrayList is "+a);
  System.out.println("The ArrayList viewed through its alias is "+b);
  System.out.println("The copy of the ArrayList is "+c);
  System.out.print("\nEnter two numbers: ");
  int p = input.nextInt(), q=input.nextInt();
  System.out.println("Change "+p+" to "+q+" in the ArrayList");
  change(a,p,q);
  System.out.println("\nThe ArrayList is now "+a);
  System.out.println("The ArrayList viewed through its alias is now "+b);
  System.out.println("The copy of the ArrayList is now "+c);
 }

 private static ArrayList<Integer> makeArrayListInt(int n)
 {
  ArrayList<Integer> a = new ArrayList<Integer>();
  for(int i=0; i<n; i++)
     a.add(0);
  return a;
 }

 public static ArrayList<Integer> copy(ArrayList<Integer> a)
 {
  ArrayList<Integer> b = makeArrayListInt(a.size());
  for(int i=0; i<a.size(); i++)
     b.set(i,a.get(i));
  return b;
 }

 public static void change(ArrayList<Integer> a,int m,int n)
 // Change all occurrences of m to n in a destructively
 {
  for(int i=0; i<a.size(); i++)
    if(a.get(i).equals(m))
       a.set(i,n);
 }
}
