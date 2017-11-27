import java.util.*;

class UseArrayLists13
{
// Shows the two different remove methods in class ArrayList
// using arrayList of String.

 public static void main(String[] args) throws Exception
 {
  Scanner input = new Scanner(System.in);
  System.out.println("\nEnter some words (all on one line, separated by spaces):");
  String line = input.nextLine();
  String[] words = line.split(" +");
  ArrayList<String> a = new ArrayList<String>();
  for(int i=0; i<words.length; i++)
      a.add(words[i]);
  System.out.println("The words are stored in an ArrayList");
  System.out.println("The ArrayList is "+a);
  System.out.print("\nEnter a position to delete from the ArrayList: ");
  int pos = input.nextInt();
  String rem=a.remove(pos);
  System.out.println("String removed is "+rem);
  System.out.println("Changes ArrayList to "+a);
  System.out.print("\nEnter a word to delete from the ArrayList: ");
  String word = input.next();
  if(a.remove(word))
     System.out.println("Word has been removed");
  else
     System.out.println("Word not found in the ArrayList");
  System.out.println("ArrayList is now "+a);
 }

}
