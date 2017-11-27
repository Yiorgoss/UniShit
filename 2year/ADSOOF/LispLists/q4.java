class q4 
{
	public static void main( String[] args ) 
	{
		LispList<Integer> ll = LispList.empty();
		ll=ll.cons(2);	ll=ll.cons(3);		ll=ll.cons(4);		ll=ll.cons(12);
		ll=ll.cons(5);	ll=ll.cons(12);		ll=ll.cons(2);	 	ll=ll.cons(5);

		System.out.println( multiply( ll, 5));
	}
	public static LispList<Integer> multiply( LispList<Integer> ll, int a )
	{
		LispList<Integer> ret_ll = LispList.empty();
		ret_ll = multiply( ll, a, ret_ll);

		return ret_ll;
	}
	public static LispList<Integer> multiply( LispList<Integer> ll, int a, LispList<Integer> ret_ll )
	{
		if( !ll.tail().isEmpty())
		{
			ret_ll = ret_ll.cons( ll.head() * a);
			ret_ll = multiply( ll.tail(), a, ret_ll);
		}
		return ret_ll;
	}
}


