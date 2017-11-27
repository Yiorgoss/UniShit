import java.util.*;
import java.util.Arrays;

class q5 {

	public static void main( String[] args ) {

		int[] arr = new int[] { 7,11,13,8,5,8,10,27,30,11,5 };
		int[] short_arr = new int[arr.length];

		short_arr = shorten( arr, 8, 27 );
		//short_arr = cleanUp( short_arr );
		System.out.println( Arrays.toString( short_arr ));
	}
	public static int[] shorten( int[] arr, int a, int b ) {
		int[] temp_arr = new int[arr.length];
		int first = 0;
		int second = 0;

		for( int i=0; i<arr.length; i++ ) {
			if(( arr[i] == a )&&( first == 0 )) {
				first = i; 
			}			
			if(( arr[i] == b ) && ( second == 0 )) {
				second = i;
			}
		}
		for( int i=0; i<=second-first; i++ ) {
			temp_arr[i] = arr[first+i];
		}

		return cleanUp( temp_arr, second-first );
	}
	public static int[] cleanUp( int[] arr, int size ) {
		int[] retArr = new int[size+1];
		int i=0;

		for( int a : arr ){
			if( a == 0){ break; }
			retArr[i] = a;
			i++;
		}
		return retArr;
	}
}




