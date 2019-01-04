import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class UseChecker1 {
	public static void main( String[] arg){
		Scanner sc = new Scanner( System.in);

		System.out.println( "Enter a list of Strings");
		String str = sc.nextLine();
		String[] strs = str.split(" ");
		ArrayList<String> arrl = new ArrayList<String>( Arrays.asList( strs));

		System.out.println( arrl);
		System.out.println( "Without false cases");
		
		Checker<String> check = new CheckStr();
		CheckArrayList checkarrl = new CheckArrayList();
		
		checkarrl.checkArrl( check, arrl);
		System.out.println( arrl);
	}
}