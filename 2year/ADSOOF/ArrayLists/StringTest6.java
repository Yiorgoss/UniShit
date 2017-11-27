import java.util.Scanner;

class StringTest6
// Tests Java's toUpperCase and toLowerCase methods in class String
{
 
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter a string: ");
  String str = input.nextLine();
  String upper = str.toUpperCase();
  String lower = str.toLowerCase();
  System.out.println("Converting to all upper case gives ");
  System.out.println(upper);
  System.out.println("Converting to all lower case gives ");
  System.out.println(lower);
 }

}
