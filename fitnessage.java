import java.util.Scanner;

class fitnessage {

	public static void main (String[] param) {
		Scanner sc = new Scanner(System.in);

		System.out.println("fitness test 1st score?");
		int num1 = sc.nextInt();

		System.out.println("fitness test 2nd score?");
		int num2 = sc.nextInt();
	
		if ((1 <= num1) && (num1 <= 40) && (1 <= num2) && (num2 <= 40)) {
			
			average(num1, num2);
			System.out.println("FitnessAge = " + fitnessAge(num1,num2));	
			
			System.out.println("what is your age?");
			int usrAge = sc.nextInt();			
			
			System.out.println(usrAge - (fitnessAge(num1,num2)) + " years away from PC Fit Age");

			return;
		} else {
			System.out.println("Incorrect test Result(s). Must be 1 <= x <= 40");
		}
		System.exit(0);
	}

	public static void average (int vara, int varb) {
		System.out.println("AverageScore = " + ((vara + varb)/2));
		return;
	}

	public static int fitnessAge (int vara, int varb) {
		int varA = vara;
		int varB = varb;
		int fitAge = (((4*(varA + varB)/5)+10));
		return fitAge;
	}
// JUST TO SHOW I KNOW HOW TO COMMENT.
}
