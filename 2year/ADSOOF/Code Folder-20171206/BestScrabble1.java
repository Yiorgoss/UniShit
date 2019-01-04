import java.util.*;

class BestScrabble1
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
  Comparator<String> comparer = new Scrabble();
  String best = CollectionOps.biggest(a,comparer);
  System.out.print("The word with the highest Scrabble score is \""+best);
  System.out.println("\" with score "+Scrabble.score(best));
 }
}
