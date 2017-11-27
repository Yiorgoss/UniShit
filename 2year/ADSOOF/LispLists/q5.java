class q5
{
	public static void main( String[] args ) 
	{
		LispList<Integer> ll = LispList.empty();
		ll=ll.cons(5);	ll=ll.cons(2); 	ll=ll.cons(12);	ll=ll.cons(5);
		ll=ll.cons(12); 	ll=ll.cons(4);	ll=ll.cons(3); 	ll=ll.cons(2);

		System.out.println( after( ll, 12));
	}
	public static LispList<Integer> after( LispList<Integer> ll, int a ) 
	{
		LispList<Integer> ret_ll = LispList.empty();
		ret_ll = after( ll, a, ret_ll );

		return ret_ll;
	}
	public static LispList<Integer> after( LispList<Integer> ll, int a, LispList<Integer> ret_ll )
	{
		
		if( !ll.tail().isEmpty() && ret_ll.isEmpty())
		{
			if( ll.head() == a)
			{
				ret_ll = ret_ll.cons( ll.tail().head());
			}
			ret_ll = after( ll.tail(), a, ret_ll);
		}
		else 
		{
			if( !ll.tail().isEmpty())
			{
				ret_ll = ret_ll.cons( ll.tail().head());
				ret_ll = after( ll.tail(), a, ret_ll);
			}
		}
		return ret_ll;
	}
}