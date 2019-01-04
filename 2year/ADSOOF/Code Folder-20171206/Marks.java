import java.util.*;
import java.io.File;

class Marks
{
 public static void main(String[] args) throws Exception
 {
  Scanner screen = new Scanner(System.in);
  System.out.print("Enter file name for marks: ");
  String fileName = screen.nextLine();
  Scanner file = new Scanner(new File(fileName));
  Map<String,Integer> table = new HashMap<String,Integer>();
  while(file.hasNext())
     {
      String examNo = file.next();
      Integer mark = file.nextInt();
      table.put(examNo,mark);
     }
  System.out.print("Do you want to know any mark (yes/no) ? ");
  boolean flag = getYesNo(screen);
  while(flag)
      {
       System.out.print("Enter student number: ");
       String examNo = screen.next();
       Integer mark = table.get(examNo);
       if(mark==null)
          System.out.println("No student with number "+examNo);
       else
          System.out.println(examNo+" has mark "+mark);
       System.out.print("Do you want to know any other mark (yes/no) ? ");
       flag = getYesNo(screen);
      }
 }

 private static boolean getYesNo(Scanner input)
 {
  String word = input.next();
  while(!word.equals("yes")&&!word.equals("no"))
      {
       System.out.print("Please enter \"yes\" or \"no\": ");
       word = input.next();
      }
  return word.equals("yes");
 }
}
