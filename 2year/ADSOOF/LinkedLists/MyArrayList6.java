class MyArrayList6 <E>
{
// Linked list implementation of ArrayList with size variable

 private Cell<E> myList;
 private int mySize;
 
 public MyArrayList6()
 {
  myList=null;
  mySize=0;
 }

 public E get(int pos)
 {
  Cell<E> ptr=myList;
  if(pos>=mySize)
     throw new IndexOutOfBoundsException();
  for(int count=0; count<pos; ptr=ptr.next, count++) {}
  return ptr.first;
 }

 public void set(int pos,E item)
 {
  Cell<E> ptr=myList;
  if(pos>=mySize)
     throw new IndexOutOfBoundsException();
  for(int count=0; count<pos; ptr=ptr.next, count++) {}
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
  mySize=mySize+1;
 }

 public void add(int pos,E item)
 {
  if(pos>mySize)
     throw new IndexOutOfBoundsException();
  if(pos==0)
     myList = new Cell<E>(item,myList);
  else
     {
      Cell<E> ptr=myList;
      for(int count=1; count<pos; ptr=ptr.next,count++) {}
      ptr.next = new Cell<E>(item,ptr.next);
     }
  mySize=mySize+1;
 }

 public E remove(int pos)
 {
  E item;
  if(pos>=mySize)
     throw new IndexOutOfBoundsException();
  else if(pos==0)
     {
      mySize=mySize-1;
      item=myList.first;
      myList=myList.next;
      return item;
     }
  else
     {
      Cell<E> ptr=myList;
      for(int count=1; count<pos; ptr=ptr.next,count++) {}
      mySize=mySize-1;
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
      mySize=mySize-1;
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
          mySize=mySize-1;
          ptr.next = ptr.next.next;
          return true;
         }
     }
 }

 public int size()
 {
  return mySize;
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
