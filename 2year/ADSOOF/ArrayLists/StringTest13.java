import java.util.Scanner;

class StringTest13
// Tests a method to replace one character by another in a String
// implemented recusrively
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
  System.out.println(replace(str,char1,char2));
 }

 public static String replace(String str,char ch1,char ch2)
 // Returns the string resulting from replacing all occurrences
 // of ch1 by ch2 in str.
 {
  if(str.equals(""))
     return "";
  else
     {
      String str1 = replace(str.substring(1),ch1,ch2);
      if(str.charAt(0)==ch1)
         return ch2+str1;
      else
         return str.charAt(0)+str1;
     }
 }
}
