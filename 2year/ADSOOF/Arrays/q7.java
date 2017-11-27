class q7 {

	public static void main( String[] args ) {
		int[] arr = new int[]{ 1,8,13,16,16,19,27,30 };

		System.out.println( isAscending( arr ));
	}
	public static boolean isAscending( int[] arr ) {

		for( int i=1; i<arr.length; i++ ) {
			if( arr[i-1] > arr[i] ) {
				return false;
			}
		}
		return true;
	}
}