import java.util.*;

class TreeSetTest
{
 public static void main(String[] args) throws Exception
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter some words (all on one line):");
  String line = input.nextLine();
  String[] words = line.split(" ");
  Collection<String> a = new TreeSet<String>();
  for(int i=0; i<words.length; i++)
     a.add(words[i]);
  System.out.println("The words are: "+a);
 }
}
