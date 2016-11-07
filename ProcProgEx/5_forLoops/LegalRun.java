import java.util.Scanner;

class LegalRun {

	public static void main(String[] p) {
		int total = 0;

		for(int i = 1; i <= 4; i++) {
			
			Scanner sc = new Scanner(System.in);	
			System.out.println("What is the disavility class of Runner "+ i +"?");
						
			int usr_inp_int = sc.nextInt();
			total += disabVar(usr_inp_int);

			if (i == 4){
				if (isLegal(total) == true){
					System.out.println("The team has "+ total +" points so is legal");
				} else {
					System.out.println("the team has "+ total +"points so is NOT legal");		 
				}
			}	
		}
	}	


	public static int disabVar(int p){
		int disabtot = 0;
		disabtot += p;
		return disabtot;
	}	
	
	public static boolean isLegal(int p){
		if(p >= 32){
			return false;
		} else {
			return true;
		}
	}
}

