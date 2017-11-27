class MyArrayList8 <E>
{
// Doubly linked list implementation of ArrayList

 private Cell<E> front,back;
 private int mySize;
 
 public MyArrayList8()
 {
  front=null;
  back=null;
  mySize=0;
 }

 public E get(int pos)
 {
  Cell<E> ptr=front;
  if(pos>=mySize)
     throw new IndexOutOfBoundsException();
  for(int count=0; count<pos; ptr=ptr.next, count++) {}
  return ptr.data;
 }

 public void set(int pos,E item)
 {
  Cell<E> ptr=front;
  if(pos>=mySize)
     throw new IndexOutOfBoundsException();
  for(int count=0; count<pos; ptr=ptr.next, count++) {}
  ptr.data=item;
 }

 public void add(E item)
 {
  if(front==null)
      {
       front = new Cell<E>(item,null,null);
       back = front;
      }
  else
     {
      back.next = new Cell<E>(item,null,back);
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
      front = new Cell<E>(item,front,null);
      if(mySize==0)
         back=front;
      else
         front.next.prev=front;
     }
  else
     {
      Cell<E> ptr=front;
      for(int count=1; count<pos; ptr=ptr.next,count++) {}
      ptr.next = new Cell<E>(item,ptr.next,ptr);
      if(ptr==back)
         back=ptr.next;
      else
         ptr.next.next.prev=ptr.next;
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
      if(mySize==0)
         back=null;
      item=front.data;
      if(front.next!=null)
         front.next.prev=null;
      front=front.next;
      return item;
     }
  else
     {
      Cell<E> ptr=front;
      for(int count=1; count<pos; ptr=ptr.next,count++) {}
      mySize=mySize-1;
      item=ptr.next.data;
      if(ptr.next==back)
         {
          back=ptr;
          ptr.next=null;
         }
      else
         {
          ptr.next.next.prev=ptr;
          ptr.next = ptr.next.next;
         }
      return item;
     }
 }

 public boolean remove(E item)
 {
  if(front==null)
     return false;
  else if(item.equals(front.data))
     {
      mySize=mySize-1;
      if(front.next!=null)
         front.next.prev=null;
      front=front.next;
      return true;
     }
  else
     {
      Cell<E> ptr=front;
      for(; ptr.next!=null&&!item.equals(ptr.next.data); ptr=ptr.next) {}
      if(ptr.next==null)
         return false;
      else
         {
          mySize=mySize-1;
          if(ptr.next==back)
             {
              back=ptr;
              ptr.next=null;
             }
          else
             {
              ptr.next.next.prev=ptr;
              ptr.next = ptr.next.next;
             }
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
  int pos=0;
  Cell<E> ptr=front;
  for(; ptr!=null&&!item.equals(ptr.data); ptr=ptr.next, pos++) {}
  if(ptr==null)
     return -1;
  else
     return pos;
 }

 public int lastIndexOf(E item)
 {
  int pos=mySize-1;
  Cell<E> ptr=back;
  for(; ptr!=null&&!item.equals(ptr.data); ptr=ptr.prev, pos--) {}
  return pos;
 }

 public String toString()
 {
  String str="[";
  if(front!=null)
     {
      str+=front.data;
      for(Cell<E> ptr=front.next; ptr!=null; ptr=ptr.next)
          str+=","+ptr.data;
     }
  return str+"]";
 }
 
 private static class Cell <T>
 {
  T data;
  Cell<T> next,prev;

  Cell(T d,Cell<T> n,Cell<T> p)
  {
   data=d;
   next=n;
   prev=p;
  }
 }
}
