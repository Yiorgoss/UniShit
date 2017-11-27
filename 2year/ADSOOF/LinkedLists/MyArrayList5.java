class MyArrayList5 <E>
{
// Linked list implementation of ArrayList

 private Cell<E> myList;
 
 public MyArrayList5()
 {
  myList=null;
 }

 public E get(int pos)
 {
  Cell<E> ptr=myList;
  for(int count=0; count<pos&&ptr!=null; ptr=ptr.next, count++) {}
  if(ptr==null)
     throw new IndexOutOfBoundsException();
  return ptr.first;
 }

 public void set(int pos,E item)
 {
  Cell<E> ptr=myList;
  for(int count=0; count<pos&&ptr!=null; ptr=ptr.next, count++) {}
  if(ptr==null)
     throw new IndexOutOfBoundsException();
  ptr.first=item;
 }

 public void add(E item)
 {
  if(myList==null)
     myList = new Cell<E>(item,null);
  else
     {
      Cell<E> ptr=myList;
      for(; ptr.next!=null; ptr=ptr.next) {}
      ptr.next = new Cell<E>(item,null);
     }
 }

 public void add(int pos,E item)
 {
  if(pos==0)
     myList = new Cell<E>(item,myList);
  else
     {
      Cell<E> ptr=myList;
      for(int count=1; ptr!=null&&count<pos; ptr=ptr.next,count++) {}
      if(ptr==null)
         throw new IndexOutOfBoundsException();
      ptr.next = new Cell<E>(item,ptr.next);
     }
 }

 public E remove(int pos)
 {
  E item;
  if(myList==null)
     throw new IndexOutOfBoundsException();
  else if(pos==0)
     {
      item=myList.first;
      myList=myList.next;
      return item;
     }
  else
     {
      Cell<E> ptr=myList;
      for(int count=1; ptr.next!=null&&count<pos; ptr=ptr.next,count++) {}
      if(ptr.next==null)
         throw new IndexOutOfBoundsException();
      item=ptr.next.first;
      ptr.next=ptr.next.next;
      return item;
     }
 }

 public boolean remove(E item)
 {
  if(myList==null)
     return false;
  else if(item.equals(myList.first))
     {
      myList=myList.next;
      return true;
     }
  else
     {
      Cell<E> ptr=myList;
      for(; ptr.next!=null&&!item.equals(ptr.next.first); ptr=ptr.next) {}
      if(ptr.next==null)
         return false;
      else
         {
          ptr.next = ptr.next.next;
          return true;
         }
     }
 }

 public int size()
 {
  int count=0;
  for(Cell<E> ptr=myList; ptr!=null; ptr=ptr.next, count++) {}
  return count;
 }
 
 public int indexOf(E item)
 {
  int count=0;
  Cell<E> ptr=myList;
  for(; ptr!=null&&!item.equals(ptr.first); ptr=ptr.next, count++) {}
  if(ptr==null)
     return -1;
  else
     return count;
 }

 public int lastIndexOf(E item)
 {
  int pos=-1;
  Cell<E> ptr=myList;
  for(int count=0; ptr!=null; ptr=ptr.next, count++)
      if(item.equals(ptr.first))
         pos=count;
  return pos;
 }

 public String toString()
 {
  String str="[";
  if(myList!=null)
     {
      str+=myList.first;
      for(Cell<E> ptr=myList.next; ptr!=null; ptr=ptr.next)
          str+=","+ptr.first;
     }
  return str+"]";
 }
 
 private static class Cell <T>
 {
  T first;
  Cell<T> next;

  Cell(T h,Cell<T> t)
  {
   first=h;
   next=t;
  }
 }
}
