import java.util.*;

class HeadSetTest
{
 public static void main(String[] args) throws Exception
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter some words (all on one line):");
  String line = input.nextLine();
  String[] words = line.split(" ");
  SortedSet<String> s1 = new TreeSet<String>();
  for(String word : words)
     s1.add(word);
  System.out.println("The words are: "+s1);
  System.out.println("Enter a word to split at: ");
  String splitWord = input.next().trim();
  SortedSet<String> s2 = s1.headSet(splitWord);
  System.out.println("The words before this word are: "+s2);
  System.out.println("Enter a word to add: ");
  String addWord = input.next().trim();
  s1.add(addWord);
  System.out.println("The words are now: "+s1);
  System.out.println("The words before the split are now: "+s2);
 }
}
