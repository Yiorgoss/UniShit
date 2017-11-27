import java.util.Scanner;

class StringTest2
// Tests Java's method to replace one character by another in a String
{
 
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter a string: ");
  String str = input.nextLine();
  System.out.println("Enter two characters separated by a space: ");
  String[] words = input.nextLine().split(" ");
  Character char1 = words[0].charAt(0);
  Character char2 = words[1].charAt(0);
  System.out.println("The result of replacing '"+char1+"' by '"+char2+"' is ");
  System.out.println(str.replace(char1,char2));
 }

}
