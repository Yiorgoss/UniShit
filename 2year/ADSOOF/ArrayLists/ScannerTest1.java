import java.util.Scanner;
import java.io.*;

class ScannerTest1
{
 public static void main(String[] args) throws IOException
 {
  BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter some words: ");
  String words = input.readLine();
  Scanner splitter = new Scanner(words);
  System.out.println("\nThe words you entered are: ");
  while(splitter.hasNext())
      System.out.println(splitter.next());
 }
}
