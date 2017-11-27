import java.util.Scanner;

class UseDrinksMachines4A
{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the price for drinks on your machine: ");
  int p = input.nextInt();
  DrinksMachineA machine1 = new DrinksMachineA(p);
  DrinksMachineA machine2 = cheaperBy10p(machine1);
  System.out.println("The price you entered is "+p+"p");
  System.out.println("Machine 1 charges "+machine1.getPrice()+"p");
  System.out.println("Machine 2 charges "+machine2.getPrice()+"p");
 }

 public static DrinksMachineA cheaperBy10p(DrinksMachineA mach1)
 {
  int p = mach1.getPrice()-10;
  DrinksMachineA mach2 = new DrinksMachineA(p);
  return mach2;
 }

}
