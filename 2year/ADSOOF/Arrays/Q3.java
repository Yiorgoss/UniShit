class Q3 {

	public static void main( String[] args ) {
		int[] arr = new int[] { 7, 11, 13, 8, 5, 10, 20 };

		int[] constructive = new int[arr.length];
		int[] destructive = new int[arr.length];

		constructive = constArr( arr, 12, 5 );
		destructive = destrArr( arr, 12, 5 );

		System.out.println( arr );
		System.out.println( constructive );
		System.out.println( destructive );

		for(int i=0; i< arr.length; i++ ) {
			System.out.println( constructive[i] );
		}
	}
	public static int[] constArr( int[] arr, int a, int b ) {

		int[] ret_arr = new int[arr.length];
		for( int i=0; i<arr.length; i++ ) {
			if( arr[i] < a ) {
				ret_arr[i] = arr[i] * b;
			} else {
				ret_arr[i] = arr[i];
			}
		}
		return ret_arr;
	}
	public static int[] destrArr( int[] arr, int a, int b ) {

		for( int i=0; i<arr.length; i++ ) {
			if( arr[i] < a ) {
				arr[i] *= b;
			}
		}
		return arr;
	}
}