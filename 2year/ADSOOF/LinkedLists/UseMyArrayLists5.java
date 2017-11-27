import java.util.*;

class UseMyArrayLists5
{
 public static void main(String[] args) throws Exception
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter some words (all on one line):");
  String line = input.nextLine();
  String[] words = line.split(" ");
  MyArrayList5<String> a = new MyArrayList5<String>();
  for(int i=0; i<words.length; i++)
      a.add(words[i]);
  System.out.println("The words are stored in a MyArrayList5 object");
  System.out.println("\nThe collection is "+a);
  System.out.print("\nEnter a word: ");
  String word = input.next();
  int pos1 = a.indexOf(word);
  int pos2 = a.lastIndexOf(word);
  if(pos1==-1)
     System.out.println("The word \""+word+"\" does not occur in the collection");
  else
     {
      System.out.println("The first occurrence of \""+word+"\" is at position "+pos1);
      System.out.println("The last occurrence of \""+word+"\" is at position "+pos2);
      a.remove(word);
      System.out.println("The collection with \""+word+"\" removed is \n"+a);
     }
  System.out.print("\nEnter a number: ");
  int pos = input.nextInt();
  a.remove(pos);
  System.out.print("The collection with the word at position "+pos);
  System.out.println(" removed is \n"+a);
 }

}

