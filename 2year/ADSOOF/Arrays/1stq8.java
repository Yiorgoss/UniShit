 import java.util.*;
 class q8 {

	public static void main( String[] args ){
		int[] arr1 = new int[]{ 17,11,20,34,5,10,8,19,55,11,13 };
		int[] arr2 = new int[]{ 19,20,13,19,55,8 };

		System.out.println( doesOccur( arr1, arr2, arr2.length ));
	}
	public static boolean doesOccur( int[] arr1, int[] arr2, int length_arr2 ) {

		boolean bool = true;
		
		for( int a : arr1 ) {
			System.out.println( "aaaa"+ length_arr2 );
			if( a == arr2[length_arr2-1] ) {
				doesOccur( arr1, arr2, length_arr2-1 );
				bool = true;
			}
			if( length_arr2 == 0 ) { System.out.println( "aaaa" ); return true; }
			System.out.println( "aaaa" );
			return false;
		}
		return false;	
	}
}