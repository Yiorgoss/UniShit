class MyArrayList7 <E>
{
// Linked list implementation of ArrayList with size variable and pointer
// to back

 private Cell<E> myList,back;
 private int mySize;
 
 public MyArrayList7()
 {
  myList=null;
  back=null;
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
      {
       myList = new Cell<E>(item,null);
       back = myList;
      }
  else
     {
      back.next = new Cell<E>(item,null);
      back = back.next;
     }
  mySize=mySize+1;
 }

 public void add(int pos,E item)
 {
  if(pos>mySize)
     throw new IndexOutOfBoundsException();
  if(pos==0)
     {
      myList = new Cell<E>(item,myList);
      if(mySize==0)
         back=myList;
     }
  else
     {
      Cell<E> ptr=myList;
      for(int count=1; count<pos; ptr=ptr.next,count++) {}
      ptr.next = new Cell<E>(item,ptr.next);
      if(ptr==back)
         back=ptr.next;
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
      if(mySize==1)
         back=null;
      item=myList.first;
      myList=myList.next;
     }
  else
     {
      Cell<E> ptr=myList;
      for(int count=1; count<pos; ptr=ptr.next,count++) {}
      item=ptr.next.first;
      if(ptr.next==back)
         back=ptr;
      ptr.next=ptr.next.next;
     }
  mySize=mySize-1;
  return item;
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
          if(ptr.next==back)
             back=ptr;
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
