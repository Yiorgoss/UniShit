class CellsAndPointers
{

 public static void main(String[] args) 
 {
  Cell<Character> l1,l2,ptr;
  l1 = new Cell<Character>('a',new Cell<Character>('b',new Cell<Character>('c',new Cell<Character>('d',null))));
  l2 = new Cell<Character>('x',new Cell<Character>('y',null));
  
  System.out.println("The lists start as: ");
  System.out.println(listToString(l1));
  System.out.println(listToString(l2));


  /*****************
   *               *
   * Add code here *
   *               *
   * ***************/
  /*****************/


  System.out.println("The lists become: ");
  System.out.println(listToString(l1));
  System.out.println(listToString(l2));

  Cell blah = new Cell( 5, null);
 }

 private static <T> String listToString(Cell<T> list)
 {
  String str="[";
  if(list!=null)
     {
      str+=list.first;
      for(Cell<T> ptr=list.next; ptr!=null; ptr=ptr.next)
         str+=","+ptr.first;
     }
  return str+"]";
 }

 private static class Cell<T>
 {
  T first;
  Cell<T> next;

  Cell(T f,Cell<T> n)
  {
   first=f;
   next=n;
  }
 }

}
