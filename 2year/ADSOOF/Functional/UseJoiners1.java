import java.util.Scanner;
import java.util.ArrayList;

class Use§1
{

   public static void main(String[] args) 
   {
      Scanner in = new Scanner(System.in);
      LispList<Integer> ls1,ls2,ls3;
      System.out.print("Enter a list (of integers): ");
      String str = in.nextLine();
      ls1 = parseIntLispList(str);
      System.out.print("Enter another list (of integers): ");
      str = in.nextLine();
      ls2 = parseIntLispList(str);
      Joiner<Integer> adder = new JoinByAdding();
      ls3 = Joiners.zipLists(adder,ls1,ls2);
      System.out.println("Adding corresponding integers in the lists gives:\n"+ls3);

      System.out.println( "________________________________________");
      ArrayList<Integer> arrl1,arrl2,arrl3;

      System.out.println( "ENTER ONE LIST SEPERATED BY SPACE");
      str = in.nextLine();
      arrl1 = parseIntArrayList(str);
      System.out.println( "ENTER SECOND LIST SEPERATED BY SPACE");
      str = in.nextLine();
      arrl2 = parseIntArrayList(str);
      arrl3 = Joiners.zipArrayList( adder, arrl1, arrl2);

      System.out.println( "joining lists by adding give:");
      System.out.println( arrl3);

  }

  public static LispList<Integer> parseIntLispList(String str)
  {
      String line = str.trim();
      String contents = line.substring(1,line.length()-1).trim();
      if(contents.length()==0)
       return LispList.empty();
   String[] nums = contents.split(",");
   LispList<Integer> list = LispList.empty();
   for(int i=nums.length-1; i>=0; i--)
   {
     String num = nums[i].trim();
     list = list.cons(Integer.parseInt(num));
 }
 return list;
}
public static ArrayList<Integer> parseIntArrayList( String str){
    //converted code suitable for arrayList
    //functionality desired by question eludes me
  String line = str.trim();
  String contents = line.substring(1,line.length()-1).trim();
  if( contents.length() == 0){
    return new ArrayList<Integer>();
  }
  String[] nums = contents.split(",");
  ArrayList<Integer> list = new ArrayList<Integer>();
  for( int i=0; i<nums.length; i++){
    String num = nums[i].trim();
    list.add( Integer.parseInt(num));
  }
  return list;
}

}
