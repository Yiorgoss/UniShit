import java.util.Scanner;

class StringTest8
// Tests Java's method toBinaryString in class Integer
{
 
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter an integer: ");
  int n = input.nextInt();
  String str = Integer.toBinaryString(n);
  System.out.println("In binary, this integer is: ");
  System.out.println(str);
 }

}
