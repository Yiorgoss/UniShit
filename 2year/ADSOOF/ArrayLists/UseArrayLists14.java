import java.util.*;

class UseArrayLists14
// Shows destructively removing the integer before all occurrences of 
// an integer in an ArrayList
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
  System.out.print("\nEnter a number: ");
  int p = input.nextInt();
  System.out.println("Remove the number before every "+p+" in the ArrayList");
  removeBefore(a,p);
  System.out.println("\nThe ArrayList is now "+a);
 }

 public static void removeBefore(ArrayList<Integer> a,int m)
 // Removes the number which occurs before every occurrence of m in a, 
 // does this destructively
 {
  int i=1;
  while(i<a.size())
    if(a.get(i).equals(m))
       a.remove(i-1);
    else
       i++;
 }
}
