import java.util.*;

class UseArrayLists16
// Demonstrates changing all occurrences of a pair of integers in an 
// ArrayList of pairs of integers to another pair of integers destructively. 
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
  System.out.println("Changing all occurrences of the first pair to the second pair gives:");
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
 {
  for(int i=0; i<a.size(); i++)
    if(a.get(i).equals(obj1))
       a.set(i,obj2);
 }
}
