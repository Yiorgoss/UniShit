class UseDrinksMachines6
{
 public static void main(String[] args)
 {
  try {
       DrinksMachine machine = new DrinksMachine(50,0,10);
       Can aCan = new Can("coke");
       aCan.drink();
       machine.loadCoke(aCan);
       System.out.println("I insert 200p into the drinks machine");
       machine.insert(200);
       System.out.println("I press the button labelled \"Coke\"");
       Can myCan = machine.pressCoke();
       System.out.println("I press the button labelled \"change\"");
       int myChange = machine.pressChange();
       System.out.println("I have "+myCan+" and "+myChange+"p");
       System.out.println("I drink from the can");
       myCan.drink();
       System.out.println("Now I have "+myCan+" and "+myChange+"p");
       System.out.println("I drink from the can again");
       myCan.drink();
       System.out.println("And now I have "+myCan+" and "+myChange+"p");
      }
  catch(NullPointerException e)
      {
       System.out.println("Error: method called on null");
      }
  catch(EmptyCanException e)
     {
      System.out.println("Error: attempt to drink from empty can");
     }
 }
}
