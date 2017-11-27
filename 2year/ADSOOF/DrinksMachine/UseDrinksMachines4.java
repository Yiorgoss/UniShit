import java.util.Scanner;

class UseDrinksMachines4
{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the price for drinks on your machine: ");
  int p = input.nextInt();
  DrinksMachine machine1 = new DrinksMachine(p);
  DrinksMachine machine2 = cheaperBy10p(machine1);
  System.out.println("The price you entered is "+p+"p");
  System.out.println("Machine 1 charges "+machine1.getPrice()+"p");
  System.out.println("Machine 2 charges "+machine2.getPrice()+"p");
 }

 public static DrinksMachine cheaperBy10p(DrinksMachine mach1)
 {
  int p = mach1.getPrice()-10;
  DrinksMachine mach2 = new DrinksMachine(p);
  return mach2;
 }

}
