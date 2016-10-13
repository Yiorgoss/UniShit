import java.util.Scanner;

class statask {

	public static void main (String[] params) {
		
		System.out.println("Type Station Name for Zone number");

		Scanner sc = new Scanner(System.in);
		String usr_inp = sc.nextLine();
		stopReturn(usr_inp);
		System.out.println(stopReturn(usr_inp));
		System.exit(0);
	}

	public static int stopReturn(String var1) {
	 
		String station = var1;	
		
		if (isItAldgateEast(station) != 0) {
			System.out.println("whatever");
		} else {
		//ItAldgateEast(station);
		//sItBalham(station);
		//sItArsenal(station);
		//sItBarking(station);
        //isItBuckHill(station);
		return 0;
		}
	}


	public static int isItAldgateEast(String vara) {

		if (vara == "Aldgate East") {
			return 1;
		} else {
			return 0;
		}
	}

	public static int isItBalham(String vara) {
		
		if (vara == "Balham"){	
			return 3;
		} else {
			return 0;
		}
	}

	public static int isItArsenal(String vara) {
		if (vara == "Arsenal") {
			return 2;
		} else {
			return 0;
		}
	}

	public static int isItBarking(String vara) {
		if (vara == "Barking") {
			return 4;
		} else {
			return 0;
		}
	}

	public static int isItBuckHill(String vara) {
		if (vara == "Buckhurst Hill") {
			return 5;
		} else {
			return 0;
		}
	}
}
