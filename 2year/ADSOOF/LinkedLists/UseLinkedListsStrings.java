import java.util.*;

class UseLinkedListsStrings
{

 public static void main(String[] args) 
 {
  Scanner input = new Scanner(System.in);
  Cell<String> list1,list2;
  String w1,w2;
  System.out.print("Enter a list (of words): ");
  String line = input.nextLine();
  list1 = sortAndParseStringLinkedList(line);
  System.out.println("The list you entered, after sorting, is: ");
  System.out.println(linkedListToString(list1));
  System.out.print("Enter a word: ");
  w1 = input.next();
  System.out.println("Inserting "+w1+" destructively gives: ");
  destInsert(w1,list1);
  System.out.println(linkedListToString(list1));
  System.out.print("Enter another word: ");
  w2 = input.next();
  System.out.println("Inserting "+w2+" constructively gives: ");
  list2 = constInsert(w2,list1);
  System.out.println(linkedListToString(list2));
  System.out.println("Leaving the original list as: ");
  System.out.println(linkedListToString(list1));
 }

 private static Cell<String> sortAndParseStringLinkedList(String str)
 {
  Cell<String> list=null;
  String line = str.trim();
  String contents = line.substring(1,line.length()-1).trim();
  if(contents.length()==0)
     return null;
  String[] words = contents.split(",");
  Arrays.sort(words);
  for(int i=words.length-1; i>=0; i--)
      {
       String word = words[i].trim();
       list = new Cell<String>(word,list);
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

 private static <T extends Comparable<? super T>> void destInsert(T w,Cell<T> list)
 {
  if(w.compareTo(list.first)<0)
     {
      list.next = new Cell<T>(list.first,list.next);
      list.first=w;
     }
  else
     {
      Cell<T> ptr;
      for(ptr=list; ptr.next!=null&&w.compareTo(ptr.next.first)>0; ptr=ptr.next)
         {}
      ptr.next = new Cell<T>(w,ptr.next);
     }
 }

 private static <T extends Comparable<? super T>> Cell<T> constInsert(T w,Cell<T> list)
 {
  if(list==null)
     return new Cell<T>(w,null);
  else if(w.compareTo(list.first)<0)
     return new Cell<T>(w,list);
  else 
     return new Cell<T>(list.first,constInsert(w,list.next));
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
