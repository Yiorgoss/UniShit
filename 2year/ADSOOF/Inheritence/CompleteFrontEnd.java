import java.util.ArrayList;
import java.util.Random;

class CompleteFrontEnd {
	public static void main( String[] args) {

		ArrayList<DrinksMachine> dm_arr = new ArrayList<DrinksMachine>();
		CanFactory cf = new CanFactory( 50);
		FinalRobot fr = new FinalRobot( 1, dm_arr); //must add method to initialise local drink machines
		RobotCompany rc = new RobotCompany( 0); 
		int balance = 100;

		Random rand = new Random();
		int n=6;
		
		dm_arr.add( new ExtDrinksMachinev2( cf, 2, n, n, n, n));
		dm_arr.add( new ExtDrinksMachinev2( cf, 3, n, n, n, n));
		dm_arr.add( new ExtDrinksMachinev2( cf, 2, n, n, n, n));
		dm_arr.add( new ExtDrinksMachinev2( cf, 1, n, n, n, n));

		CanAndCash returns;
		for( int i=0; i<5; i++){
			returns = fr.buyCoke( balance);
			fr.buyFanta( balance);
		}
		rc.collect( fr);
		//print in RobotCompany -- showbalance
	}
}