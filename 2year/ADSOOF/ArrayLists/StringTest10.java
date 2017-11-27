import java.util.Scanner;

class StringTest10
// Trying our own static methods startsWith
{
 
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter a string: ");
  String str1 = input.nextLine();
  System.out.println("Enter another string: ");
  String str2 = input.nextLine();
  if(startsWith(str1,str2))
     System.out.println("The first string starts with the second string");
  else if(startsWith(str2,str1))
     System.out.println("The second string starts with the first string");
  else
     System.out.println("Neither string starts with the other");
 }

 public static boolean startsWith(String str1,String str2)
 // Returns true if str1 starts with str2, false otherwise
 {
  int i;
  for(i=0 ;i<str1.length()&&i<str2.length(); i++)
      if(str1.charAt(i)!=str2.charAt(i))
         break;
  return i==str2.length();
 }
}
