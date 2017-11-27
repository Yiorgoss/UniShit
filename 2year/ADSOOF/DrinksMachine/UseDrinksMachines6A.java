class UseDrinksMachines6A
{
 public static void main(String[] args)
 {
  DrinksMachineA machine = new DrinksMachineA(50,0,10);
  System.out.println("I insert 200p into the drinks machine");
  machine.insert(200);
  Can myCan1=null,myCan2=null;
  try {
       System.out.println("I press the button labelled \"Coke\"");
       myCan1 = machine.pressCoke();
       System.out.println("I press the button labelled \"Fanta\"");
       myCan2 = machine.pressFanta();
      }
  catch(EmptyMachineException e)
      {
       System.out.println("The machine is empty of "+e.getMessage()+"s");
      }
  System.out.println("I press the button labelled \"change\"");
  int myChange = machine.pressChange();
  System.out.println("I have "+myCan1+" and "+myCan2+" and "+myChange+"p");
 }
}
