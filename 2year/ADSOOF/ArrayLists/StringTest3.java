import java.util.Scanner;

class StringTest3
// Tests Java's substring method
{
 
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter a string: ");
  String str1 = input.nextLine();
  System.out.println("Enter two integers separated by a space: ");
  int start = input.nextInt();
  int finish = input.nextInt();
  System.out.println("The substring of \""+str1+"\" starting at "+start+
                     " and finishing at "+finish+" is:");
  String str2 = str1.substring(start,finish);
  System.out.println("\""+str2+"\"");
 }

}
