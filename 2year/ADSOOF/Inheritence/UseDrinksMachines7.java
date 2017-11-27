import java.util.Scanner;

class UseDrinksMachines7
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
  System.out.println("Machine 2 is a machine that sells sprites");
  System.out.print("Enter the price for drinks on machine 2: ");
  p = input.nextInt();
  System.out.print("Enter the number of cokes in machine 2: ");
  c = input.nextInt();
  System.out.print("Enter the number of fantas in machine 2: ");
  f = input.nextInt();
  System.out.print("Enter the number of sprites in machine 2: ");
  s = input.nextInt();
  ExtDrinksMachine1a mach2 = new ExtDrinksMachine1a(p,c,f,s);
  System.out.print("Enter the amount of money you wish to spend on cokes "+
                   "on Machine 1: ");
  int amount = input.nextInt();
  int cokes = DrinksMachineOps.spendOnCokes(amount,mach1);
  amount = mach1.pressChange();
  System.out.println("You have "+cokes+" cokes and "+amount+"p change");
  System.out.print("Enter the amount of money you wish to spend on cokes "+
                   "on Machine 2: ");
  amount = input.nextInt();
  cokes = spendOnCokes(amount,mach2);
  amount = mach2.pressChange();
  System.out.println("You have "+cokes+" more cokes and "+amount+"p change");
  System.out.print("Enter the amount of money you wish to spend on sprites "+
                   "on Machine 2: ");
  amount = input.nextInt();
  int sprites = spendOnCokes(amount,mach2);
  amount = mach2.pressChange();
  System.out.println("You have "+sprites+" sprites and "+amount+"p change");
  mach2.insert(amount);
 }

 public static int spendOnCokes(int sum, ExtDrinksMachine1a mach)
 {
  int count=0;
  mach.insert(sum);
  while(!mach.cokesEmpty()&&mach.getBalance()>=mach.getPrice())
     {
      mach.pressCoke();
      count++;
     }
  return count;
 }

 public static int spendOnSprites(int sum, ExtDrinksMachine1a mach)
 {
  int count=0;
  mach.insert(sum);
  while(!mach.spritesEmpty()&&mach.getBalance()>=mach.getPrice())
     {
      mach.pressCoke();
      count++;
     }
  return count;
 }

}
