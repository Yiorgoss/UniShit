import java.util.Scanner;

class UseDrinksMachines3
{
 public static void main(String[] args)
 {
  int p;
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the price for drinks on machine 1: ");
  p = input.nextInt();
  DrinksMachine mach1 = new DrinksMachine(p,10,10);
  System.out.print("Enter the price for drinks on machine 2: ");
  p = input.nextInt();
  DrinksMachine mach2 = new DrinksMachine(p,10,10);
  mach1.insert(100);
  mach2.insert(100);
  DrinksMachine mach3 = cheaper(mach1,mach2);
  Can myCan = mach3.pressCoke();
  int myChange = mach1.pressChange()+mach2.pressChange();
  System.out.println("After buying a can from the cheaper machine ");
  System.out.println("I am left with "+myChange+"p from two pounds");
 }

 public static DrinksMachine cheaper(DrinksMachine m1,DrinksMachine m2)
 {
  if(m1.getPrice()<m2.getPrice())
     return m1;
  else
     return m2;
 }

}
