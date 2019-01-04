import java.util.*;

class LastAlphabetically
{
 public static void main(String[] args) throws Exception
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter some words (all on one line):");
  String line = input.nextLine();
  String[] words = line.split(" ");
  List<String> a = new LinkedList<String>();
  for(int i=0; i<words.length; i++)
     a.add(words[i]);
  int pos = ListOps.posBiggest(a);
  System.out.print("The last word alphabetically is \""+a.get(pos));
  System.out.println("\" at position "+pos);
 }
}
