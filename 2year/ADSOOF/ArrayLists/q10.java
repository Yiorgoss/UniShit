import java.util.*;
import java.io.*;

class q10 {

	public static void main( String[] args ) {

		ArrayList<ArrayList<String>> textAL = new ArrayList<ArrayList<String>>();

		textAL = fInput( "twinkle.txt" );
		System.out.println( textAL );
	}
	public static ArrayList<ArrayList<String>> fInput( String fname ) {

		ArrayList<ArrayList<String>> retAL = new ArrayList<ArrayList<String>>();
		try{

			BufferedReader in = new BufferedReader( new FileReader( new File( fname )));
			String line;
			
			while(( line = in.readLine() ) != null ) {
				
				String[] arr = line.split(" ");
				ArrayList<String> arrStr = new ArrayList<String>();
				for( int i=0; i<arr.length; i++) {

					arrStr.add( arr[i] );
				}
				retAL.add( arrStr );
			}
		}catch( IOException ioe ) {

		}
		return retAL;
	}
}