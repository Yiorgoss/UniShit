import java.util.Scanner;

class UseLispLists2
{

 public static void main(String[] args) 
 {
  Scanner in = new Scanner(System.in);
  LispList<Integer> ls;
  System.out.print("Enter a list (of integers): ");
  String str = in.nextLine();
  ls = parseIntLispList(str);
  System.out.print("The list you entered is: ");
  System.out.println(ls);
  int listSum = sum(ls);
  System.out.println("The sum of the contents of the list is: "+listSum);
  System.out.println("The list is still "+ls);
 }

 public static int sum(LispList<Integer> ls)
 {
 int sumSoFar=0;
 for(; !ls.isEmpty(); ls=ls.tail())
    {
     int n = ls.head();
     sumSoFar = sumSoFar+n;
    }
 return sumSoFar;
 }

 public static LispList<Integer> parseIntLispList(String str)
 {
  String line = str.trim();
  String contents = line.substring(1,line.length()-1).trim();
  if(contents.length()==0||line.charAt(0)!='['||line.charAt(line.length()-1)!=']')
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

}
