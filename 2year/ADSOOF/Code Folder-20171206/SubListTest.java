import java.util.*;

class SubListTest
{
 public static void main(String[] args) throws Exception
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter some words (all on one line):");
  String line = input.nextLine();
  String[] words = line.split(" ");
  List<String> a = new ArrayList<String>();
  for(String word : words)
     a.add(word);
  int count=0;
  System.out.println("The words are: ");
  for(String str : a)
      {
       System.out.println(count+": "+str);
       count++;
      }
  System.out.print("Enter a start index: ");
  int start = input.nextInt();
  System.out.print("Enter a finish index: ");
  int finish = input.nextInt();
  List<String> sublist = a.subList(start,finish);
  System.out.println("The sublist in this range is: ");
  count=0;
  for(String str : sublist)
      {
       System.out.println(count+": "+str);
       count++;
      }
  System.out.print("Enter a position in this sublist you wish to add at: ");
  int addPos = input.nextInt();
  System.out.print("Enter a word you wish to add: ");
  String word = input.next();
  sublist.add(addPos,word);
  System.out.println("The sublist is now: ");
  count=0;
  for(String str : sublist)
      {
       System.out.println(count+": "+str);
       count++;
      }
  System.out.println("The full list is now: ");
  count=0;
  for(String str : a)
      {
       System.out.println(count+": "+str);
       count++;
      }
 }
}
