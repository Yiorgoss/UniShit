import java.util.Scanner;

class UseDrinksMachines5
{
 public static void main(String[] args)
 {
  int p,c,f,s;
  Scanner input = new Scanner(System.in);
  System.out.println("Machine 1 is a standard machine");
  System.out.print("Enter the price for drinks on machine 1: ");
  p = input.nextInt();
  System.out.print("Enter the number of cokes in machine 1: ");
  c = input.nextInt();
  System.out.print("Enter the number of fantas in machine 1: ");
  f = input.nextInt();
  DrinksMachine mach1 = new DrinksMachine(p,c,f);
  System.out.println("Machine 2 is an extended machine");
  System.out.print("Enter the price for drinks on machine 2: ");
  p = input.nextInt();
  System.out.print("Enter the number of cokes in machine 2: ");
  c = input.nextInt();
  System.out.print("Enter the number of fantas in machine 2: ");
  f = input.nextInt();
  System.out.print("Enter the number of sprites in machine 2: ");
  s = input.nextInt();
  ExtDrinksMachine1 mach2 = new ExtDrinksMachine1(p,c,f,s);
  DrinksMachine cheaper = DrinksMachineOps.cheaper(mach1,mach2);
  System.out.print("Enter the amount of money you wish to spend on cokes "+
                   "on the cheaper machine: ");
  int amount = input.nextInt();
  int cokes = DrinksMachineOps.spendOnCokes(amount,cheaper);
  amount = cheaper.pressChange();
  System.out.println("You have "+cokes+" cokes and "+amount+"p change");
  mach2.insert(amount);
  System.out.println("Put the change in Machine 2 and press the Sprite button");
  Can can = mach2.pressSprite();
  amount = mach2.pressChange();
  if(can==null)
     System.out.println("No sprites available");
  else
     System.out.println("You have a "+can+" and "+amount+"p change");
 }

}
