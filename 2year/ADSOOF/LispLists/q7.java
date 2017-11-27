class q7
{
	public static void main( String[] args)
	{
		LispList<Integer> ll = LispList.empty();
		ll=ll.cons(14);	ll=ll.cons(12);	ll=ll.cons(9);
		ll=ll.cons(8);	ll=ll.cons(3);	ll=ll.cons(7);

		System.out.println( removePos( ll, 5));
	}
	public static LispList<Integer> removePos( LispList<Integer> ll, int a )
	{
		LispList<Integer> ret_ll = LispList.empty();
		int count = -1;
		ret_ll = removePos( ll, a, ret_ll, count);

		return ret_ll;
	}
	public static LispList<Integer> removePos( 	LispList<Integer> ll, int a,
												LispList<Integer> ret_ll, int count )
	{
		count++;
		if( !ll.isEmpty()) 
		{
			if( count != a ) {
				ret_ll = removePos( ll.tail(), a, ret_ll, count );
				ret_ll = ret_ll.cons( ll.head());
			} 
			else
			{
				ret_ll = removePos( ll.tail(), a, ret_ll, count );
			}

		}
		return ret_ll;
	}
}