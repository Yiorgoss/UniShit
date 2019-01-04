import java.util.*;

class CollectionOps
{
 public static <T extends Comparable<? super T>> T biggest(Collection<T> coll)
 {
  Iterator<T> it = coll.iterator();
  T biggest = it.next();
  while(it.hasNext())
     {
      T nextItem = it.next();
      if(nextItem.compareTo(biggest)>0)
         biggest = nextItem;
     }
  return biggest;
 }

 public static <T> T biggest(Collection<T> coll,Comparator<? super T> comp)
 {
  Iterator<T> it = coll.iterator();
  T biggest = it.next();
  while(it.hasNext())
     {
      T nextItem = it.next();
      if(comp.compare(nextItem,biggest)>0)
         biggest = nextItem;
     }
  return biggest;
 }

}
