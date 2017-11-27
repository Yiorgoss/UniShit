import java.util.*;

class UseArrayLists8
// Shows adding a string after all occurrences of a string
// constructively in an ArrayList
{
 public static void main(String[] args) throws Exception
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter some words (all on one line, separated by spaces):");
  String line = input.nextLine();
  String[] words = line.split(" +");
  ArrayList<String> a = new ArrayList<String>();
  for(int i=0; i<words.length; i++)
      a.add(words[i]);
  System.out.println("The words are stored in an ArrayList");
  System.out.println("\nThe ArrayList is "+a);
  System.out.print("\nEnter two words: ");
  String p = input.next(), q=input.next();
  System.out.println("Add "+q+" after every "+p+" in the ArrayList");
  ArrayList<String> b=addAfter(a,p,q);
  System.out.println("\nThe ArrayList created is "+b);
  System.out.println("The original ArrayList is still "+a);
 }

 public static ArrayList<String> addAfter(ArrayList<String> a,String m,String n)
 // Adds n after every occurrence of m in a, constructively.
 {
  ArrayList<String> b = new ArrayList<String>();
  for(int i=0; i<a.size(); i++)
    {
     String k=a.get(i);
     b.add(k);
     if(k.equals(m))
       b.add(n);
    }
  return b;
 }
}
