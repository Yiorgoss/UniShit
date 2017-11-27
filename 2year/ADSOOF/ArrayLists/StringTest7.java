import java.util.*;

class StringTest7
// Tests a method to replace one character by another in an array
// and convert it to a string
{
 
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter a string: ");
  String str1 = input.nextLine();
  char[] a = str1.toCharArray();
  System.out.println("The string converts to the array: ");
  System.out.println(Arrays.toString(a));
  System.out.print("Enter an array index: ");
  int pos = input.nextInt();
  input.nextLine();
  System.out.print("Enter a character: ");
  char ch = input.nextLine().trim().charAt(0);
  a[pos]=ch;
  System.out.println("Changing the character indexed by "+pos+
                     " in the array to '"+ch+"' gives");
  System.out.println(Arrays.toString(a));
  String str2 = new String(a);
  System.out.println("The string created from this is ");
  System.out.println(str2);
 }

}
