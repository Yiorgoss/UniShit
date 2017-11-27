import java.util.Scanner;

class UseDrinksMachines5A
{
 public static void main(String[] args)
 {
  int p;
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the price for drinks on machine 1: ");
  p = input.nextInt();
  DrinksMachineA mach1 = new DrinksMachineA(p,0,10);
  System.out.print("Enter the price for drinks on machine 2: ");
  p = input.nextInt();
  DrinksMachineA mach2 = new DrinksMachineA(p,10,10);
  mach1.insert(100);
  mach2.insert(100);
  DrinksMachineA mach3 = cheaper(mach1,mach2);
  try {
       if(!mach3.cokesEmpty())
           {
            Can myCan = mach3.pressCoke();
            System.out.println("I bought a can of Coke from the cheaper machine");
           }
       else
          {
           System.out.println("The cheaper machine has no cans of Coke left");
           if(mach3==mach2)
              mach3=mach1;
           else
              mach3=mach2;
           if(!mach3.cokesEmpty())
               {
                Can myCan = mach3.pressCoke();
                System.out.println("So I bought one from the other machine");
               }
           else
               System.out.println("Neither has the other machine");
          }
     }
  catch(EmptyMachineException e)
     {
     }
  int myChange = mach1.pressChange()+mach2.pressChange();
  System.out.println("I am left with "+myChange+"p from two pounds");
 }

 public static DrinksMachineA cheaper(DrinksMachineA m1,DrinksMachineA m2)
 {
  if(m1.getPrice()<m2.getPrice())
     return m1;
  else
     return m2;
 }

}
