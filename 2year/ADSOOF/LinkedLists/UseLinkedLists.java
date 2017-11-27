import java.util.Scanner;

class UseLinkedLists
{

 public static void main(String[] args) 
 {
  /*Scanner input = new Scanner(System.in);
  Cell<Integer> list1,list2;
  int n,m1,m2;
  System.out.print("Enter a list (of integers): ");
  String line = input.nextLine();
  list1 = parseIntLinkedList(line);
  System.out.println("The list you entered is: ");
  System.out.println(linkedListToString(list1));
  System.out.print("Enter a number: ");
  n = input.nextInt();
  System.out.print("Enter another number: ");
  m1 = input.nextInt();
  System.out.println("Changing "+n+" to "+m1+" gives: ");
  destChange(n,m1,list1);
  System.out.println(linkedListToString(list1));
  System.out.print("Enter a third number: ");
  m2 = input.nextInt();
  System.out.println("Changing "+m1+" to "+m2+" constructively gives: ");
  list2 = constChange(m1,m2,list1);
  System.out.println(linkedListToString(list2));
  System.out.println("Leaving the original list as: ");
  System.out.println(linkedListToString(list1));
  */
  Cell<Integer> l1 = new Cell<Integer>( 1, new Cell<Integer>( 2, new Cell<Integer>( 3, new Cell<Integer>( 4, new Cell<Integer>( 5, null)))));
  Cell<Integer> l2;
  System.out.println( linkedListToString( l1));
  l2 = constChange( 1, 2, l1);
  System.out.println( linkedListToString(l1));
  System.out.println( linkedListToString(l2));
}

private static Cell<Integer> parseIntLinkedList(String str)
{
  Cell<Integer> list=null;
  String line = str.trim();
  String contents = line.substring(1,line.length()-1).trim();
  if(contents.length()==0)
   return null;
 String[] nums = contents.split(",");
 for(int i=nums.length-1; i>=0; i--)
 {
   String num = nums[i].trim();
   list = new Cell<Integer>(new Integer(num),list);
 }
 return list;
}

private static <T> String linkedListToString(Cell<T> list)
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

private static <T> void destChange(T n,T m,Cell<T> list)
{
  for(Cell<T> ptr=list; ptr!=null; ptr=ptr.next)
   if(ptr.first.equals(n))
    ptr.first=m;
}

private static <T> Cell<T> constChange(T n,T m,Cell<T> list)
{
  Cell<T> temp=null;
  for(;list!=null; list=list.next)
   if(list.first.equals(n))
    temp = new Cell<T>(m,temp);
  else
    temp = new Cell<T>(list.first,temp);
  System.out.println( linkedListToString( temp));
  for(;temp!=null; temp=temp.next)
   list = new Cell<T>(temp.first,list);
 return list;
}

private static class Cell <T>
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
