import java.util.Scanner;

class askst {

	public static void main (String[] params) {
		stopReturn("Aldgate East");
		System.exit(0);
	}

	public static int stopReturn(String var1) {
	 
		String station = var1;	
		String Station_list;
	
		System.out.println("Type in a station to find its zone");

		switch (station) {
				case 1: station_list = "Aldgate East";//zone1
						System.out.println(askst.isItAldgateEast());				
						break;
				case 2: station_list = "Balham";//zone3
						//isItBalham();
						break;
				case 3: station_list = "Arsenal"; //zone2
						//isItArsenal();
						break;
				case 4: station_list = "Barking"; //zone4
						//isIt
						break;
				case 5: station_list = "Buckhurst Hill"; //zone5

						break;
				deafault: station_list = "Not a valid Station in my records";

		}
	}

	public static int isItAldgateEast() {
		return 1;
	}

	public static int isItBalham() {
		return 3;
	}

	public static int isItArsenal() {
		return 2;
	}

	public static int isItBarking() {
		return 4;
	}

	public static int isItBuckHill() {
		return 5;
	}
}
