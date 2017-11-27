import java.util.*;

class UseArrayListsLispLists
{
 public static void main(String[] args) throws Exception
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter a list of lists of integers (all on one line):");
  String line = input.nextLine();
  ArrayList<LispList<Integer>> a = makeArrayListLispListInt(line);
  System.out.println("The lists are stored in an ArrayList: ");
  System.out.println(a);
  System.out.print("Enter a list of integers: ");
  line = input.nextLine();
  LispList<Integer> ls = makeLispListInt(line);
  int pos = a.indexOf(ls);
  if(pos==-1)
     System.out.println("The list is not in the ArrayList");
  else
     System.out.println("The list is at position "+pos+
                        " in the ArrayList");
 }

 public static ArrayList<LispList<Integer>> makeArrayListLispListInt(String str)
 // Takes a string representing a list of lists of integers and returns
 // the equivalent arrayList of Lisp lists of Integers
 {
  str=str.trim();
  str=str.substring(1,str.length()-1).trim();
  str=str.substring(1,str.length()-1);
  String[] lists = str.split("\\] *, *\\[");
  ArrayList<LispList<Integer>> a = new ArrayList<LispList<Integer>>();
  for(int i=0; i<lists.length; i++)
      {
       LispList<Integer> ls = makeLispListInt1(lists[i]);
       a.add(ls);
      }
  return a;
 }

 public static LispList<Integer> makeLispListInt(String str)
 // Takes a string representing a list of integers and returns
 // the equivalent Lisp list of integers
 {
  str=str.trim();
  str=str.substring(1,str.length()-1).trim();
  return makeLispListInt1(str);
 }

 private static LispList<Integer> makeLispListInt1(String str)
 {
  String[] ints = str.split(" *, *");
  LispList<Integer> ls = LispList.<Integer>empty();
  for(int i=ints.length-1; i>=0; i--)
     ls=ls.cons(Integer.parseInt(ints[i]));
  return ls;
 }

}

