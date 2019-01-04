import java.util.Comparator;

class Scrabble implements Comparator<String>
{

 public static final int[] scores = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};

 public static int score(String str)
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
}
