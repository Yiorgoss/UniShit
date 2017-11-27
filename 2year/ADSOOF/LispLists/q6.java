class q6 
{
	public static void main( String[] args ) 
	{
		LispList<Integer> ll = LispList.empty();
		ll=ll.cons(5);	ll=ll.cons(2); 	ll=ll.cons(12);	ll=ll.cons(5);
		ll=ll.cons(2); ll=ll.cons(4);	ll=ll.cons(3); 	ll=ll.cons(2);

		System.out.println( positions( ll, 2));
	}
	public static LispList<Integer> positions( LispList<Integer> ll, int a) 
	{
		LispList<Integer> ret_ll = LispList.empty();
		int count = -1;

		ret_ll = positions( ll, a, ret_ll, count );

		return ret_ll;
	}
	public static LispList<Integer> positions( 	LispList<Integer> ll, int a,
												LispList<Integer> ret_ll, int count )
	{
		count++;
		if( !ll.tail().isEmpty())
		{
			if( ll.head() == a) 
			{
				ret_ll = positions( ll.tail(), a, ret_ll, count);
				ret_ll = ret_ll.cons( count);
			}
			else
			{
				ret_ll = positions( ll.tail(), a, ret_ll, count);
			}
		}
		return ret_ll;
	}
}

