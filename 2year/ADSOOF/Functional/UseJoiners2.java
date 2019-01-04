import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

class UseJoiners2 {
	public static void main( String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println( "Enter a string of numbers");
		String str = sc.nextLine();

		String[] strs = str.split( " ");
		ArrayList<String> arrl = new ArrayList<String>( Arrays.asList( strs));

		Joiner<String> join = new Join2Str();

		System.out.println( Joiners.fold( join, arrl));
	}
}