import java.util.*;

class Q9 {

    public static void main( String[] a ) {
        Scanner sc = new Scanner( System.in );
        String usrInp;
        DrinksMachineB mach1 = new DrinksMachineB( 100, 10, 0 );
        DrinksMachineB mach2 = new DrinksMachineB( 100, 10, 10 );
        Can canBought;
        int cashCollected;
        int moneyInserted = 0;

        while( true ) {

            System.out.println( "How much are you inserting" );
            usrInp = sc.nextLine();            

            if( usrInp.equals( "Operator" )) {
                cashCollected = mach1.collectCash();
                cashCollected += mach2.collectCash();

                System.out.println( "$"+ cashCollected );
                break;
            }
            if( usrInp.equals( "exit" )) {
                break;
            }
            
            moneyInserted = Integer.parseInt( usrInp );            

            System.out.println( "What do you want" );
            usrInp = sc.nextLine(); 

            try{ 
                if( usrInp.equals( "a can of coke" )) {
                    if( mach1.cokesEmpty() == false ) {
                        mach1.insert( moneyInserted );
                        canBought = mach1.pressCoke();
                  } else {
                        mach2.insert( moneyInserted );
                        canBought = mach2.pressCoke();
                    }
                } else if ( usrInp.equals( "a can of fanta" )) {
                    if( mach1.fantasEmpty() == false ) {
                        mach1.insert( moneyInserted );
                        canBought = mach1.pressFanta();
                    } else {
                        mach2.insert( moneyInserted );
                        canBought = mach2.pressFanta();
                    }
                }
            } catch( NotEnoughMoneyException neme ) {
                System.out.println( "Try Again. Not Enough Money" );
                continue;
            } catch( EmptyMachineException eme ) {
                System.out.println( "No drinks available. Try Again." );
                continue;
            } catch( Exception e ) { System.out.println( "Random" ); }
        }
    }
}
