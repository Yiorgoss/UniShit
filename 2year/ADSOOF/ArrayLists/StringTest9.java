import java.util.Scanner;

class StringTest9
// Tests some methods in class Character
{
 
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a single character: ");
  String str = input.nextLine();
  char ch = str.charAt(0);
  if(Character.isWhitespace(ch))
     System.out.println("'"+ch+"' is a white space character");
  else if(Character.isDigit(ch))
      System.out.println("'"+ch+"' is a digit");
  else if(Character.isUpperCase(ch))
      {
       System.out.println("'"+ch+"' is an upper case letter");
       char ch1 = Character.toLowerCase(ch);
       System.out.println("'"+ch1+"' is its lower case equivalent");
      }
  else if(Character.isLowerCase(ch))
      {
       System.out.println("'"+ch+"' is a lower case letter");
       char ch1 = Character.toUpperCase(ch);
       System.out.println("'"+ch1+"' is its upper case equivalent");
      }
  else
      System.out.println("'"+ch+"' is neither a digit nor a letter");
 }

}
