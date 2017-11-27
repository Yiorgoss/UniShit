import java.util.*;
class q2 {

	public static void main( String[] args ) {

		String str1 = "totototaltotllltoal";
		String str2 = "total";

		System.out.println( doesContain( str1, str2 ));
	}
	public static boolean doesContain( String str, String sub ) {

		int subl = sub.length();
		int strl = str.length();

		for( int i=0; i<(strl - subl); i++ ) {
			if( sub.equals( str.substring( i, i+subl ))) {
				return true;
			}
		}
		return false;
	}
}