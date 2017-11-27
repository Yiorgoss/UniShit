class blah {
	public static void main( String[] args) {
		Blah<Integer> list = new Blah<Integer>( 1, new Blah<Integer>( 4, new Blah<Integer>( 2, null)));
		System.out.println( "Ex 1: ");
	}
}