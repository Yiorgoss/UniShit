class UseDrinksMachines1
{
 public static void main(String[] args)
 {
  DrinksMachine machine = new DrinksMachine(50,10,10);
  System.out.println("I insert 200p into the drinks machine");
  machine.insert(200);
  System.out.println("I press the button labelled \"Coke\"");
  Can myCan = machine.pressCoke();
  System.out.println("I press the button labelled \"change\"");
  int myChange = machine.pressChange();
  System.out.println("I have "+myCan+" and "+myChange+"p");
 }
}
