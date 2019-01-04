import java.util.*;

class UnmodifiableTreeSetTest
{
 public static void main(String[] args) throws Exception
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter some words (all on one line):");
  String line = input.nextLine();
  String[] words = line.split(" ");
  Set<String> a = new TreeSet<String>();
  for(int i=0; i<words.length; i++)
     a.add(words[i]);
  System.out.println("The words are: "+a);
  Set<String> b = Collections.unmodifiableSet(a);
  System.out.println("Unmodifiable view of the words is: "+b);
  System.out.println("Enter a word to delete: ");
  String delWord = input.next().trim();
  a.remove(delWord);
  System.out.println("Changes words to: "+a);
  System.out.println("Unmodifiable view is: "+b);
 }
}
