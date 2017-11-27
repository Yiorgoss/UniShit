class LispListA<E> 
{
 private E[] array;

 private LispListA(E[] a)
 {
  array = a;
 }

 public boolean isEmpty()
 {
  return array.length==0;
 }

 public E head()
 {
  return array[0];
 }

 public LispListA<E> tail()
 {
  E[] a = (E[]) new Object[array.length-1];
  for(int i=1; i<array.length; i++)
     a[i-1]=array[i];
  return new LispListA<E>(a);
 }

 public LispListA<E> cons(E obj)
 {
  E[] a = (E[]) new Object[array.length+1];
  a[0]=obj;
  for(int i=0; i<array.length; i++)
     a[i+1]=array[i];
  return new LispListA<E>(a);
 }

 public static <T> LispListA<T> empty()
 {
  return new LispListA<T>((T[]) new Object[0]);
 }

 public String toString()
 {
  String str = "{";
  if(array.length>0)
     {
      str+=array[0];
      for(int i=1; i<array.length; i++)
         str+=","+array[i];
     }
  return str+"}";
 }

}
