import java.util.Scanner;

class StringTest11
// Trying our own static methods startsWith implemented recursively
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
  if(str2.length()==0)
     return true;
  else if(str1.length()==0)
     return false;
  else if(str1.charAt(0)!=str2.charAt(0))
     return false;
  else
     return startsWith(str1.substring(1),str2.substring(1));
 }
}
