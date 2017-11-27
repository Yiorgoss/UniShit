class q3 
{
	public static void main( String[] args )
	{
		LispList<Integer> ll = LispList.empty();
		ll=ll.cons(17);	ll=ll.cons(11);	ll=ll.cons(20);	ll=ll.cons(34);
		ll=ll.cons(5);	ll=ll.cons(10);	ll=ll.cons(8);	ll=ll.cons(19);		
		ll=ll.cons(55);	ll=ll.cons(11);	ll=ll.cons(13);


		System.out.println( filter( ll, 12));
	}
	public static LispList<Integer> filter( LispList<Integer> ll, int a )
	{		
		LispList<Integer> ret_ll = LispList.empty();

		return filter( ll, a, ret_ll);
	}
	public static LispList<Integer> filter( LispList<Integer> ll, int a, LispList<Integer> ret_ll )
	{
		if( ll.head() > a)
		{
			ret_ll = ret_ll.cons( ll.head());
		}
		if( !ll.tail().isEmpty())
			{
				ret_ll = filter( ll.tail(), a, ret_ll);
			}
		return ret_ll;
	}
}


