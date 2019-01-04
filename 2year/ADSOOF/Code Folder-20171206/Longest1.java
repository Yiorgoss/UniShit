import java.util.*;

class Longest1
{
 public static void main(String[] args) throws Exception
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter some words (all on one line):");
  String line = input.nextLine();
  String[] words = line.split(" ");
  List<String> a = new ArrayList<String>();
  for(int i=0; i<words.length; i++)
     a.add(words[i]);
  Comparator<String> comparer = new LengthComparer();
  String longest = CollectionOps.biggest(a,comparer);
  System.out.println("The longest word is \""+longest+"\"");
 }
}
