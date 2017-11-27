import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class ScannerTest2
{
 public static void main(String[] args) 
 {
  Scanner splitter = null, input = new Scanner(System.in);
  while(true)
     {
      System.out.println("Enter the name of a text file");
      String filename = input.nextLine().trim();
      try {
           splitter = new Scanner(new File(filename));
           break;
          }
      catch(FileNotFoundException e)
          {
           System.out.println("No file of that name found");
          }
     }
  System.out.println("\nThe text file reads:\n");
  while(splitter.hasNextLine())
      System.out.println(splitter.nextLine());
 }
}
