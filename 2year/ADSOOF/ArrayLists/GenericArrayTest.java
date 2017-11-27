import java.util.*;

class GenericArrayTest
// Demonstrates testing whether a string is in an array of strings
// and testing whether an integer is in an array of integers,
// using a generic method.
{
 public static void main(String[] args) throws Exception
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter some words (all on one line):");
  String line = input.nextLine();
  String[] a = line.split(" ");
  System.out.println("The words are stored in an array");
  System.out.print("Enter a word: ");
  String str = input.nextLine();
  if(isIn(a,str))
     System.out.println("The word \""+str+"\" is in the array");
  else
     System.out.println("The word \""+str+"\" is not in the array");
  System.out.println("Enter some numbers (all on one line, separated by spaces):");
  line = input.nextLine();
  a = line.split(" ");
  Integer[] numbers = new Integer[a.length];
  for(int i=0; i<numbers.length; i++)
      numbers[i]=Integer.parseInt(a[i]);
  System.out.println("The numbers are stored in an array");
  System.out.print("Enter a number: ");
  Integer n = input.nextInt();
  if(isIn(numbers,n))
     System.out.println("The number "+n+" is in the array");
  else
     System.out.println("The number "+n+" is not in the array");
 }

 public static <T> boolean isIn(T[] a,T item)
 {
  for(int i=0; i<a.length; i++)
     {
      if(a[i].equals(item))
         return true;
     }
  return false;
 }
}
