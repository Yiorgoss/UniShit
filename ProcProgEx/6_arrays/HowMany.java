import java.util.Scanner;

class HowMany {
	
	public static void main(String[] p){
		
		Scanner sc = new Scanner(System.in);
		
		String[] animal_arr = new String[] {"Komodo Dragon","Manatee","Kakapo","Florida Panther", "White Rhino"};
		int[] popul_arr = new int[5];
		
		int lowest = 1000000000;
		int most_enda = 0;

		for(int i=0; i<=4; i++){

			System.out.println(animal_arr[i] +":");
			System.out.println("How many are left in the wild?");
			
			int usr_inp = sc.nextInt();
			popul_arr[i] = usr_inp;
			
			if (usr_inp < lowest) {
				most_enda = i;
				lowest = usr_inp;
			}

System.out.println(lowest);
			if(i==4){
				System.out.println("The most endangered animal is the "+ animal_arr[most_enda]);
				System.out.println("There are only "+ popul_arr[most_enda] +" left in the wild");
				System.out.println("");
				for(int o=0; o<=4; o++){
					System.out.println(animal_arr[o] +", "+ popul_arr[o]);
				}
			}
		}		
	}
}