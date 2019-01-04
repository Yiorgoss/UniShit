import java.util.*;

class BiggestInt
{
 public static void main(String[] args) throws Exception
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter some integers (all on one line):");
  String line = input.nextLine();
  String[] words = line.split(" ");
  List<Integer> a = new ArrayList<Integer>();
  for(int i=0; i<words.length; i++)
     a.add(Integer.parseInt(words[i]));
  int pos = ListOps.posBiggest(a);
  System.out.print("The biggest integer is "+a.get(pos));
  System.out.println(" at position "+pos);
 }
}
