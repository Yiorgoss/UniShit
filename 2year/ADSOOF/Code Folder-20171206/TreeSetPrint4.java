import java.util.*;

class TreeSetPrint4
{
 public static void main(String[] args) throws Exception
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter some words (all on one line):");
  String line = input.nextLine();
  String[] words = line.split(" ");
  Collection<String> a = new TreeSet<String>(new LengthComparer1());
  for(int i=0; i<words.length; i++)
     a.add(words[i]);
  int count=1;
  System.out.println("The words in order of length with duplicates deleted are: ");
  for(String str: a)
      {
       System.out.println(count+": "+str);
       count++;
      }
 }
}
