class q9 {

	public static void main( String[] args ) {

		 int[] arr1 = new int[] { 7,11,40,8,5,10,8,10 };
		 int[] arr2 = new int[] { 35,10,13,40,7 };

		 System.out.println( howMany( arr1, arr2 ));
	}
	public static int howMany( int[] arr1, int[] arr2 ) {

		int count = 0;
		for( int a1 : arr1 ) {
			for( int a2 : arr2 ) {
				if( a1 == a2 ) {
					count++;
				}
			}
		}
		return count;
	}
}