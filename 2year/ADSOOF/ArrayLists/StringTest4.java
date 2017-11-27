import java.util.Scanner;

class StringTest4
// Tests Java's String methods startsWith, endsWith, compareTo
{
 
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter a string: ");
  String str1 = input.nextLine();
  System.out.println("Enter another string: ");
  String str2 = input.nextLine();
  if(str1.startsWith(str2))
     System.out.println("The first string starts with the second string");
  else if(str2.startsWith(str1))
     System.out.println("The second string starts with the first string");
  if(str1.endsWith(str2))
     System.out.println("The first string ends with the second string");
  else if(str2.endsWith(str1))
     System.out.println("The second string ends with the first string");
  int comp = str1.compareTo(str2);
  if(comp==0)
     System.out.println("The two strings are identical");
  else if(comp<0)
     System.out.println("The first string comes before the second alphabetically");
  else
     System.out.println("The first string comes after the second alphabetically");
 }

}
