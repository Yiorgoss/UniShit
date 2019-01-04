import java.util.*;

class AsListTest2
{
 public static void main(String[] args) throws Exception
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter some words (all on one line):");
  String line = input.nextLine();
  String[] words = line.split(" ");
  List<String> list = Arrays.asList(words);
  System.out.println("The words viewed as a list are: ");
  int count=0;
  for(String str: list)
     {
      System.out.println(count+": "+str);
      count++;
     }
  System.out.print("Enter a position: ");
  int pos = input.nextInt();
  System.out.print("Enter a word: ");
  String word = input.next();
  list.add(pos,word);
  System.out.println("After adding word at position in list, array is: ");
  for(int i=0; i<words.length; i++)
      System.out.println(i+": "+words[i]);
 }
}
