class UseDrinksMachineB3 {

    public static void main( String[] a ){
        DrinksMachineB machine = new DrinksMachineB( 80, 10, 10 );
        machine.insert(260);
        
        try {
            Can can1;
            Can can2;
            Can can3;

            can1 = machine.pressCoke();
            can2 = machine.pressCoke();
            can3 = machine.pressCoke();

            int myChange = machine.pressChange();

            System.out.println( "I have 3 "+ can1 +" and "+ myChange );          
 
        } catch( EmptyMachineException e ) {
            System.out.println( machine.pressChange() );

        } catch( NotEnoughMoneyException e ) {
            System.out.println( machine.pressChange() );
        }
    }
}
