import java.util.*;

class q8 {

	public static void main( String[] args ){
		int[] arr1 = new int[]{ 17,11,20,34,5,10,8,19,55,11,13 };
		int[] arr2 = new int[]{ 19,20,13,19,55,8 };

		System.out.println( doesOccur( arr1, arr2 ));
	}
	public static boolean doesOccur( int[] arr1, int[] arr2 ) {
		int count = 0;
		for( int i=0; i<arr1.length; i++ ) {
			for( int j=0; j<arr2.length; j++ ) {
				if( arr2[j] == arr1[i] ) {
					count++;
				}
			}
		}
		if( count == arr2.length ) {
			return true;
		}
		return false;
	}
}