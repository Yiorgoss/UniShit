import java.util.*;

class UseMyArrayLists7
{
 public static void main(String[] args) throws Exception
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter a list of integers:");
  String line = input.nextLine();
  MyArrayList7<Integer> a = makeArrayListInt(line);
  System.out.println("The integers are stored in a MyArrayList7 object:");
  System.out.println(a);
  System.out.print("Enter a position: ");
  int pos=input.nextInt();
  System.out.print("Enter an integer: ");
  int n=input.nextInt();
  try {
       a.add(pos,n);
       System.out.println("Adding "+n+" at position "+pos+" gives:");
       System.out.println(a);
      }
  catch(IndexOutOfBoundsException e)
      {
       System.out.println(pos+" is greater than the ArrayList size "+a.size());
      }
  System.out.print("Enter a position: ");
  pos=input.nextInt();
  try {
       a.remove(pos);
       System.out.println("Removing the item at position "+pos+" gives:");
       System.out.println(a);
      }
  catch(IndexOutOfBoundsException e)
      {
       System.out.println(pos+" is not less than the ArrayList size "+a.size());
      }
  System.out.print("Enter a number: ");
  n=input.nextInt();
  a.add(n);
  System.out.println("Adding "+n+" to the end gives: ");
  System.out.println(a);
 }

 public static MyArrayList7<Integer> makeArrayListInt(String str)
 {
  str=str.trim();
  str=str.substring(1,str.length()-1);
  String[] ints = str.split(",");
  MyArrayList7<Integer> a = new MyArrayList7<Integer>();
  for(int i=0; i<ints.length; i++)
     a.add(Integer.parseInt(ints[i].trim()));
  return a;
 }
 
}

