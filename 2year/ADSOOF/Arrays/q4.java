import java.lang.Math;

class q4 {

	public static void main( String[] args ) {

		int[] arr = new int[] { 19,25,30,47,5,10,20,36,21,11,13 };
		int num = 0;

		num = targetClose( arr, 25 );

		System.out.println( num );
	}
	public static int targetClose( int[] arr, int a ) {

		int position = 0;
		int smallest = Math.abs( arr[0] - a);

		for( int i=0; i<arr.length; i++ ) {
			if( Math.abs(a - arr[i]) < smallest ) {
				smallest = Math.abs(a - arr[i]);
				position = i;
			}
		}
		return position;
	}
}