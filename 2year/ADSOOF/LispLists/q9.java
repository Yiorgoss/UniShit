class q9 
{
	public static void main( String[] args ) 
	{
		LispList<Integer> lla = LispList.empty();
		lla=lla.cons(5);	lla=lla.cons(6);
		lla=lla.cons(4);	lla=lla.cons(8);
		lla=lla.cons(2);	lla=lla.cons(3);
		lla=lla.cons(1);

		LispList<Integer> llb = LispList.empty();
		llb=llb.cons(66);	llb=llb.cons(3);
		llb=llb.cons(8);	llb=llb.cons(1);

		System.out.println( subset( lla, llb));
	}
	public static boolean subset( LispList<Integer> lla, LispList<Integer> llb )
	{
		LispList<Integer> temp = lla;
		boolean bool = false;

		for( ; !lla.isEmpty(); lla=lla.tail())
		{
			if( llb.isEmpty()) { break; }
			if( lla.head() == llb.head())
			{
				llb = llb.tail();
				lla = temp;
				continue;
			}
		}
		if( llb.isEmpty())
		{
			bool = true;
		}
		else
		{
			bool = false;
		}
		return bool;
	}	
}


