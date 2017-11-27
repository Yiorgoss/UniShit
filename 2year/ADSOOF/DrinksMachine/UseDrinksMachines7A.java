import java.util.Scanner;

class UseDrinksMachines7A
{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  DrinksMachineA machine = new DrinksMachineA(50,10,10);
  System.out.print("Enter the sum of money you wish to spend on cokes: ");
  int amount = input.nextInt();
  System.out.print("Enter the number of cokes you wish to buy: ");
  int number = input.nextInt();
  try {
       buyCokes(number,amount,machine);
       System.out.println("You successfully bought "+number+" cokes");
      }
  catch(EmptyMachineException e)
      {
       System.out.println("The machine ran out of cokes");
      }
  int change = machine.pressChange();
  System.out.println("You have "+change+"p left");
 }

 public static void buyCokes(int num,int sum,DrinksMachineA mach)
 throws EmptyMachineException
 {
  mach.insert(sum);
  for(int i=0; i<num; i++)
      mach.pressCoke();
 }
}
