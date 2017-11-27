import java.util.Scanner;

class UseDrinksMachines2
{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  DrinksMachine machine = new DrinksMachine(50,10,10);
  System.out.print("Enter the sum of money you wish to spend on cokes: ");
  int amount = input.nextInt();
  int cans = spendOnCokes(amount,machine);
  int change = machine.pressChange();
  System.out.println("You have bought "+cans+" cans of coke");
  System.out.println("You have "+change+"p left");
  if(machine.cokesEmpty())
     System.out.println("You have emptied the machine of cokes");
  else
     System.out.println("The machine still has some cokes left");
 }

 public static int spendOnCokes(int sum,DrinksMachine mach)
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
}
