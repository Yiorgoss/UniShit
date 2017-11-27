import java.util.Scanner;

class UseLinkedListsRec
{

 public static void main(String[] args) 
 {
  Scanner input = new Scanner(System.in);
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
  if(list!=null)
     {
      if(list.first.equals(n))
         list.first=m;
      destChange(n,m,list.next);
     }
 }

 private static <T> Cell<T> constChange(T n,T m,Cell<T> list)
 {
  if(list==null)
     return null;
  else
     {
      Cell<T> tail = constChange(n,m,list.next);
      T head = list.first;
      if(head.equals(n))
         return new Cell<T>(m,tail);
      else
         return new Cell<T>(head,tail);
     }
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
