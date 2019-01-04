import java.util.Comparator;

class LengthComparer1 implements Comparator<String>
{
 public int compare(String str1,String str2)
 {
  if(str1.length()==str2.length())
     return str1.compareTo(str2);
  else
     return str1.length()-str2.length();
 }
}
