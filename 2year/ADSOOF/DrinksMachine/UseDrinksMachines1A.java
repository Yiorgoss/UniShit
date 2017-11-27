class UseDrinksMachines1A
{
 public static void main(String[] args)
 {
  DrinksMachineA machine = new DrinksMachineA(50,0,10);
  System.out.println("I insert 200p into the drinks machine");
  machine.insert(200);
  System.out.println("I press the button labelled \"Coke\"");
  try {
       Can myCan;
       myCan = machine.pressCoke();
       System.out.println("I press the button labelled \"change\"");
       int myChange = machine.pressChange();
       System.out.println("I have "+myCan+" and "+myChange+"p");
      }
  catch(EmptyMachineException e)
      {
       System.out.println("The machine is empty");
       System.out.println("I press the button labelled \"change\"");
       int myChange = machine.pressChange();
       System.out.println("I have "+myChange+"p");
      }
  System.out.println("I have finished");
 }
}
