import java.util.Scanner;

class fitnessage {

	public static void main (String[] param) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Score for fitness test 1?");
		int num1 = sc.nextInt(); // user input first score

		System.out.println("Score for fitness test 2?");
		int num2 = sc.nextInt(); // user input second score
	
		if ((1 <= num1) && (num1 <= 40) && (1 <= num2) && (num2 <= 40)) { // if both user inputs are below 40 and above 1 
			
			average(num1, num2); // call average method
			System.out.println("Your PC Fit age is " + fitnessAge(num1,num2)); //print the method fitnessAge with arguments the fitness scores	
			
			System.out.println("what is your actual age?");
			int usrAge = sc.nextInt();			// user input age
			
			System.out.println("You are "+ (usrAge - (fitnessAge(num1,num2))) +" years away from PC Fit Age"); //more output of calculations

			return;
		} else {
			System.out.println("Incorrect test Result(s). Must be 1 <= x <= 40"); // if that fails print error and close
		}
		System.exit(0);
	}

	public static void average (int vara, int varb) {
		System.out.println("Your average score is " + ((vara + varb)/2)); // print average age + calculate it
		return;
	}

	public static int fitnessAge (int vara, int varb) {
		int varA = vara;
		int varB = varb;
		int fitAge = (((4*(varA + varB)/5)+10)); // calculate fitness age
		return fitAge; // return the fitnessage
	} 
}
