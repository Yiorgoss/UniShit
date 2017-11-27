import java.util.*;

class UseArrayLists17
// Demonstrates changing all occurrences of an actual object in an 
// ArrayList of objects to another object destructively. 
// Compares with changing all occurrences of an object as tested by equals.
// Does this with a generic method.
{
 public static void main(String[] args) throws Exception
 {
  ArrayList<Pair> pairlist = new ArrayList<Pair>();
  Scanner input = new Scanner(System.in);
  System.out.println("Enter some pairs of integers");
  System.out.println("Put each pair on a separate line, and enter an empty line to finish");
  System.out.println();
  while(true)
     {
      System.out.print(": ");
      String line = input.nextLine();
      line=line.trim();
      if(line.length()==0)
         break;
      try {
           pairlist.add(makePair(line));
          }
      catch(NoPairException e)
          {
           System.out.println("Ignored, as it is not a pair of integers");
          }
     }
  System.out.println();
  System.out.println("The arraylist is: "+pairlist);
  System.out.println();
  Pair p1, p2;
  while(true)
     {
      System.out.print("Enter a pair of integers: ");
      try {
           String line = input.nextLine();
           line=line.trim();
           p1=makePair(line);
           break;
          }
      catch(NoPairException e)
          {
           System.out.println("Ignored, as it is not a pair of integers");
          }
     }
  System.out.println(); 
  while(true)
     {
      System.out.print("Enter a pair of integers: ");
      try {
           String line = input.nextLine();
           line=line.trim();
           p2=makePair(line);
           break;
          }
      catch(NoPairException e)
          {
           System.out.println("Ignored, as it is not a pair of integers");
          }
     }
  change(pairlist,p1,p2);
  System.out.println();
  System.out.println("Changing all occurrences of "+p1+" to "+p2+" gives:");
  System.out.println(pairlist);
  System.out.println();
  Pair p3,p4;
  int pos;
  while(true)
     {
      System.out.print("Enter the position of an object in the arraylist: ");
      String line = input.nextLine();
      line=line.trim();
      try {
           pos=Integer.parseInt(line);;
           if(pos<0||pos>=pairlist.size())
               System.out.println("Ignored, as it is not a valid position");
           else
              {
               p3=pairlist.get(pos);
               break;
              }
          }
      catch(NumberFormatException e)
          {
           System.out.println("Ignored, as it is not a valid position");
          }
     }
  System.out.println();
  while(true)
     {
      System.out.print("Enter a pair of integers: ");
      try {
           String line = input.nextLine();
           line=line.trim();
           p4=makePair(line);
           break;
          }
      catch(NoPairException e)
          {
           System.out.println("Ignored, as it is not a pair of integers");
          }
     }
  changeObject(pairlist,p3,p4);
  System.out.println();
  System.out.println("Changing all aliases of the object at position "+pos+" to "+p2+" gives:");
  System.out.println(pairlist);
  System.out.println();
 }

 public static Pair makePair(String line) throws NoPairException
 {
  String[] numbers = line.split(" +");
  if(numbers.length!=2)
     throw new NoPairException();
  try {
       int m = new Integer(numbers[0]);
       int n = new Integer(numbers[1]);
       return new Pair(m,n);
      }
  catch(NumberFormatException e)
      {
       throw new NoPairException();
      }
 }

 public static <T> void change(ArrayList<T> a,T obj1,T obj2)
 // Change all occurrences of obj1 to obj2 destructively
 // Positions holding an object equal to obj1 by method equals are changed.
 {
  for(int i=0; i<a.size(); i++)
    if(a.get(i).equals(obj1))
       a.set(i,obj2);
 }
 
 public static <T> void changeObject(ArrayList<T> a,T obj1,T obj2)
 // Change all occurrences of actual object obj1 to obj2 destructively
 // I.e. only positions holding an alias to obj1 are changed
 {
  for(int i=0; i<a.size(); i++)
    if(a.get(i)==obj1)
       a.set(i,obj2);
 }
}
