import java.util.*;

class TreeSetPrint1
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
  int count=1;
  System.out.println("The words (duplicates deleted) are: ");
  for(Iterator<String> it=a.iterator(); it.hasNext(); )
      {
       String str = it.next();
       System.out.println(count+": "+str);
       count++;
      }
 }
}
