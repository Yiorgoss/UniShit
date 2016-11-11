import java.util.Scanner;

class statask {

	public static void main (String[] params) {
		
		System.out.println("Type Station Name for Zone number");

		Scanner sc = new Scanner(System.in);

		String usr_inp = sc.nextLine(); // user input station name they want the zone of
	    int question = stopReturn(usr_inp); // create an integer question and give it the value of the method stopReturn with argument the station name
		String station = stationName(question); // create string station and give it the value of method stationName with argument question 

		System.out.println(station + " is in zone " + question); // output station name and corresponding
		System.exit(0);
	}	

	public static int stopReturn(String var1) { // return station number by calling methods isIt(station name) and equating them with values they should be returning if true
	 
		String station = var1;	
		int x;

		if (isItAldgateEast(station) == 1) {
			x = 1;
		} else if (isItBalham(station) == 3) {
			x = 3;
		} else if (isItArsenal(station) == 2) {
			x = 2;
		} else if (isItBarking(station) == 4) { 
			x = 4;
		} else if (isItBuckHill(station) == 5) {
			x = 5;
		} else {
			x = 0;
		}
		return x;
	}

	public static String stationName(int var) {

		int stationNum = var; // if variable var = 1,2,3..etc defaults to invalid option
		String station_name;
		switch (stationNum) {
			case 1: station_name = "Aldgate East";
					break;
			case 2: station_name = "Arsenal";
					break;
			case 3: station_name = "Balham";
					break;
			case 4: station_name = "Barking";
					break;
			case 5: station_name = "Buckhurst Hill";
					break;
			default: station_name = "Invalid option";
		}
		return station_name; // return whatever breaks 
	}

	public static int isItAldgateEast(String vara) {  // methods to test if user input the right station name and what he input

		if (vara.equals( "Aldgate East")) {
			return 1;
		} else {
			return 0;
		}
	}

	public static int isItBalham(String vara) {
		
		if (vara.equals("Balham")) {	
			return 3;
		} else {
			return 0;
		}
	}

	public static int isItArsenal(String vara) {
		if (vara.equals("Arsenal")) {
			return 2;
		} else {
			return 0;
		}
	}

	public static int isItBarking(String vara) {
		if (vara.equals("Barking")) {
			return 4;
		} else {
			return 0;
		}
	}

	public static int isItBuckHill(String vara) {
		if (vara.equals("Buckhurst Hill")) {
			return 5;
		} else {
			return 0;
		}
	}
}
