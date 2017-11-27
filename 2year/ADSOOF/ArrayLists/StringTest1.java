import java.util.Scanner;

class StringTest1
// Tests a method to replace one character by another in a String
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

 public static String replace(String str1,char ch1,char ch2)
 // Returns the string resulting from replacing all occurrences
 // of ch1 by ch2 in str.
 {
  String str2="";
  for(int i=0; i<str1.length(); i++)
     if(str1.charAt(i)==ch1)
        str2=str2+ch2;
     else
        str2=str2+str1.charAt(i);
  return str2;
 }
}
