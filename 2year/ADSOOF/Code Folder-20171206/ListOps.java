import java.util.List;

class ListOps
{
 public static <T extends Comparable<? super T>> int posBiggest(List<T> ls)
 {
  int pos = 0;
  for(int i=1; i<ls.size(); i++)
     if(ls.get(i).compareTo(ls.get(pos))>0)
        pos=i;
  return pos;
 }
}
