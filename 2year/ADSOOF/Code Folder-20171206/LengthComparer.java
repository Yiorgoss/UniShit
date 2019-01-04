import java.util.Comparator;

class LengthComparer implements Comparator<String>
{
 public int compare(String str1,String str2)
 {
  return str1.length()-str2.length();
 }
}
