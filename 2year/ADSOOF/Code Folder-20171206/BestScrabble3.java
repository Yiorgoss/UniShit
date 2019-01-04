import java.util.*;

class BestScrabble3
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
      int[] scores = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};

      int score(String str)
      {
       String str1 = str.toUpperCase();
       int score = 0;
       for(int i=0; i<str1.length(); i++)
          score+=scores[str1.charAt(i)-'A'];
       return score;
      }

      public int compare(String str1,String str2)
      {
       return score(str1)-score(str2);
      }
    };

  String best = Collections.max(a,comparer);
  System.out.print("The word with the highest Scrabble score is \""+best);
  System.out.println("\" with score "+Scrabble.score(best));
 }
}
