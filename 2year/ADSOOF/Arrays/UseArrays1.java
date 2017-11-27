import java.util.*;

class UseArrays1
// Demonstrates testing whether an integer is in an array of integers
{
 public static void main(String[] args) 
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter some numbers (all on one line, separated by spaces):");
  String line = input.nextLine();
  String[] numbers = line.split(" +");
  int[] a = new int[numbers.length];
  for(int i=0; i<a.length; i++)
      a[i]=Integer.parseInt(numbers[i]);
  System.out.println("The numbers are stored in an array");
  System.out.print("Enter a number: ");
  int n = input.nextInt();
  if(isIn(a,n))
     System.out.println("The number "+n+" is in the array");
  else
     System.out.println("The number "+n+" is not in the array");
 }

 public static boolean isIn(int[] a,int n)
 {
  for(int i=0; i<a.length; i++)
     {
      if(a[i]==n)
         return true;
     }
  return false;
 }
}
