import java.util.*;

class UseArrayLists5
// Shows adding an integer after all occurrences of an integer 
// destructively in an ArrayList.
// Corrected to deal with the two integers being the same.
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
  System.out.print("\nEnter two numbers: ");
  int p = input.nextInt(), q=input.nextInt();
  System.out.println("Add "+q+" after every "+p+" in the ArrayList");
  addAfter(a,p,q);
  System.out.println("\nThe ArrayList is now "+a);
 }

 public static void addAfter(ArrayList<Integer> a,int m,int n)
 // Adds n after every occurrence of m in a, destructively
 {
  for(int i=0; i<a.size(); i++)
    if(a.get(i).equals(m))
       {
        a.add(i+1,n);
        i++;
       }
 }
}
