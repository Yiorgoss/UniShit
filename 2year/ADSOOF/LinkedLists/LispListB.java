class LispListB<E> 
{
 private Cell<E> myList;

 private LispListB(Cell<E> list)
 {
  myList=list;
 }

 public boolean isEmpty()
 {
  return myList==null;
 }

 public E head()
 {
  return myList.first;
 }

 public LispListB<E> tail()
 {
  return new LispListB<E>(myList.rest);
 }

 public LispListB<E> cons(E item)
 {
  return new LispListB<E>(new Cell<E>(item,myList));
 }

 public static <T> LispListB<T> empty()
 {
  return new LispListB<T>(null);
 }

 public boolean equals(Object other)
 {
  if(!(other instanceof LispListB))
     return false;
  LispListB<E> otherList = (LispListB) other;
  if(this.isEmpty())
     return otherList.isEmpty();
  else
     return this.head().equals(otherList.head()) &&
            this.tail().equals(otherList.tail());
 }

 public String toString()
 {
  if(isEmpty())
     return "[]";
  else
     return "["+head()+restToString(tail());
 }

 private static <T> String restToString(LispListB<T> l)
 {
  if(l.isEmpty())
     return "]";
  else
     return ","+l.head()+restToString(l.tail());
 }

 private static class Cell <T>
 {
  T first;
  Cell<T> rest;

  Cell(T h,Cell<T> t)
  {
   first=h;
   rest=t;
  }
 }
 
}
