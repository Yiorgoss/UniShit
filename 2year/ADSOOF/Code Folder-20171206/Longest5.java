import java.util.*;

class Longest5
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
  Comparator<String> comparer = new 
    Comparator<String>()
       {
        public int compare(String str1,String str2)
        {
         return str1.length()-str2.length();
        }
       };
  String longest = Collections.max(a,comparer);
  System.out.println("The longest word is \""+longest+"\"");
 }
}
