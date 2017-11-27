import java.util.*;

class ArrayListOps
{
 public static <T> void destChange(ArrayList<T> a,T m,T n)
 // Change all occurrences of m to n in a, destructively
 {
  for(int i=0; i<a.size(); i++)
    if(a.get(i).equals(m))
       a.set(i,n);
 }

 public static <T> ArrayList<T> constChange(ArrayList<T> a,T m,T n)
 // Change all occurrences of m to n in a, constructively
 {
  ArrayList<T> b = new ArrayList<T>();
  for(int i=0; i<a.size(); i++)
    {
     T k = a.get(i);
     if(k.equals(m))
        b.add(n);
     else
        b.add(k);
    }
  return b;
 }

 public static <T> void destAddAfter(ArrayList<T> a,T m,T n)
 // Adds n after every occurrence of m in a, destructively
 {
  for(int i=0; i<a.size(); i++)
    if(a.get(i).equals(m))
       {
        a.add(i+1,n);
        i++;
       }
 }

 public static <T> ArrayList<T> constAddAfter(ArrayList<T> a,T m,T n)
 // Adds n after every occurrence of n in a constructively.
 {
  ArrayList<T> b = new ArrayList<T>();
  for(int i=0; i<a.size(); i++)
    {
     T k=a.get(i);
     b.add(k);
     if(k.equals(m))
       b.add(n);
    }
  return b;
 }

 public static <T> void destReverse(ArrayList<T> a)
 // Reverse a, destructively
 {
  int mid = a.size()/2;
  for(int i=0; i<mid; i++)
     {
      T k=a.get(i);
      a.set(i,a.get(a.size()-i-1));
      a.set(a.size()-i-1,k);
     }
 }

 public static <T> ArrayList<T> constReverse(ArrayList<T> a)
 // Reverse a, constructively
 {
  ArrayList<T> b =  new ArrayList<T>();
  for(int i=a.size()-1; i>=0; i--)
     b.add(a.get(i));
  return b;
 }
}
