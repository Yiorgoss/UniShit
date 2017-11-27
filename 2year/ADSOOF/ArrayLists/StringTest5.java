import java.util.Scanner;

class StringTest5
// Tests Java's indexOf and lastIndexOf methods in class String
{
 
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter a string: ");
  String str = input.nextLine();
  System.out.println("Enter a character: ");
  char ch = input.nextLine().trim().charAt(0);
  int pos = str.indexOf(ch);
  if(pos==-1)
     System.out.println("The character does not occur in the string");
  else
     {
      System.out.println("The first occurrence of the character is at "+
                         "position "+pos+" in the string");
      System.out.println("The last occurrence of the character is at "+ 
                         "position "+str.lastIndexOf(ch)+" in the string");

     }
 }

}
