class Q2 {

	public static void main( String [] args ) {
		int[] a = new int[]{ 1,2,2,2,5,6 };
		int b = 0;

		b = lessThan( a, 5);
		System.out.println( b );	

	}
	public static int lessThan( int[] a, int b ) {
		int count = 0;

		for( int i=0; i<a.length; i++ ) {
			if( a[i] < b ) {
				count += 1;
			}
		}
		return count;
	}
}