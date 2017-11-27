import java.util.Arrays;

class q6 {

	public static void main( String[] args ) {

		int[] arr = new int[]{ 17,11,20,34,5,10,8,19,55,11,13};
		int num = 12;

		//arr = remLessThan( arr, num );

		System.out.println( Arrays.toString( remLessThan( arr, num )));
	}
	public static int[] remLessThan( int[] arr, int a ) {
		
		int[] ret_arr = new int[arr.length];
		int i=0;

		for( int num : arr ) {
			if( num > a ) {
				ret_arr[i] = num;
				i++;
			}
		}
		return cleanUp( ret_arr, arr.length-i );
	}
	public static int[] cleanUp( int[] arr, int size ) {

		int[] ret_arr = new int[size+1];
		int i = 0;

		for( int a : arr ) {
			if( a == 0 ) { break; }
			ret_arr[i] = a;
			i++;
		}
		return ret_arr;
	}
}