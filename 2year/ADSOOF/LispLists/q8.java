class q8
{
	public static void main( String[] args )
	{
		LispList<Integer> lla = LispList.empty();
		lla=lla.cons(1);	lla=lla.cons(3);	lla=lla.cons(2);
		lla=lla.cons(8);	lla=lla.cons(4);	lla=lla.cons(6);
		lla=lla.cons(5);

		LispList<Integer> llb = LispList.empty();
		llb=llb.cons(2);	llb=llb.cons(8);	llb=llb.cons(4);

		System.out.println( sublist( lla, llb));
	}
	public static boolean sublist( LispList<Integer> lla, LispList<Integer> llb )
	{
		Boolean bool = true;
		bool = sublist( lla, llb, bool);

		return bool;
	}
	public static boolean sublist( LispList<Integer> lla, LispList<Integer> llb, Boolean bool )
	{
		if( !lla.isEmpty() )
		{
			if( lla.head() != llb.head())
			{
				bool = false;
				bool = sublist( lla.tail(), llb, bool);
			}
			else if( !llb.tail().isEmpty())
			{
				bool = true;
				bool = sublist( lla.tail(), llb.tail(), bool);
			}
		}
		return bool;
	}
}