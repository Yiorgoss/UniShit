import java.util.Scanner;

class UseDrinksMachines4d
{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the price for drinks on your machine: ");
  int p = input.nextInt();
  DrinksMachine machine = new DrinksMachine(p);
  System.out.println("The price you entered is "+p+"p");
  System.out.println("The machine starts off charging "+machine.getPrice()+"p");
  reduceBy10p(machine);
  System.out.println("The machine now charges "+machine.getPrice()+"p");
 }

 public static void reduceBy10p(DrinksMachine mach1)
 {
  int p = mach1.getPrice()-10;
  mach1.setPrice(p);
 }

}
