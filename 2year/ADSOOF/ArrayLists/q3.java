import java.lang.*;

class q3 {

	public static void main( String[] args ) {

		String str1 = "Mabdam, I'm Adam";

		System.out.println( isPalindrome( str1 ));
	}
	public static boolean isPalindrome( String str ) {

		int i = 0;
		int j = str.length()-1;
		while( true ) {

			char ch1 = Character.toLowerCase( str.charAt(i) );
			char ch2 = Character.toLowerCase( str.charAt(j) );

			if( Character.isWhitespace(ch1) ) { i++; continue; }
			if( Character.isWhitespace(ch2) ) { j--; continue; }

			if( !Character.isLetter(ch1) && !Character.isDigit(ch1) ) { i++; continue; }
			if( !Character.isLetter(ch2) && !Character.isDigit(ch2) ) { j--; continue; }

			if( ch1 == ch2 ) { 
				if( i == j ) { return true; }
				i++;
				j--;
				continue;
			}
			break;
		}
		return false;
	}
}