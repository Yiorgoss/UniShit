import java.util.Scanner;

class LegalRun {

	public static void main(String[] p) {  
		int total = 0; // creating integer to keep track of total
                       // could have used an array to store each value

		for(int i = 1; i <= 4; i++) { // asks for 4 input of runners disability
			
			Scanner sc = new Scanner(System.in);	
			System.out.println("What is the disavility class of Runner "+ i +"?");
						
			int usr_inp_int = sc.nextInt();

		    if (usr_inp_int >= 0) {	// making sure that the input is not below 0
                total += disabVar(usr_inp_int); // if it isnt add on to total
            } else { // otherwise exit program and tell user what went wrong
                System.out.println("Illegal Input.\nMust be > 1");
                System.exit(0);
            }
        }			

        if (isLegal(total) == true) {
            System.out.println("The team has "+ total +" points so is legal");
        } else {
    		System.out.println("The team has "+ total +"points so is NOT legal"); 
		}
	}	

	public static int disabVar(int p){
		int disabtot = 0;
		disabtot += p;
		return disabtot;
	}	
	
	public static boolean isLegal(int p) { // method that tests if final input is legal
		if (p >= 32) {         
			return false;
		} else {
			return true;
		}
	}
}

