import java.util.Scanner;

class UseDrinksMachines8A
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
       number = Integer.parseInt(e.getMessage());
       System.out.println("You bought "+number+" cokes ");
       System.out.println("Then the machine ran out of cokes");
      }
  int change = machine.pressChange();
  System.out.println("You have "+change+"p left");
 }

 public static void buyCokes(int num,int sum,DrinksMachineA mach)
 throws EmptyMachineException
 {
  int count=0;
  mach.insert(sum);
  try {
       for(count=0; count<num; count++)
          mach.pressCoke();
      }
  catch(EmptyMachineException e)
     {
      throw new EmptyMachineException(""+count);
     }
 }
}
