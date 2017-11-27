
class q2 
{
	public static void main( String[] args ) 
	{
		LispList<Integer> lla = LispList.empty();
		lla=lla.cons(6);	lla=lla.cons(7);	lla=lla.cons(8);	
		lla=lla.cons(11);	lla=lla.cons(12);	lla=lla.cons(14);

		LispList<Integer> llb = LispList.empty();
		llb=llb.cons(25);	llb=llb.cons(3);	llb=llb.cons(4);
		llb=llb.cons(2);	llb=llb.cons(5);	llb=llb.cons(12);
		llb=llb.cons(2);	llb=llb.cons(25);

		System.out.println( iteLen(lla) +"\tsize Iterative");
		System.out.println( recLen(lla) +"\tsize Recursive");

		System.out.println( iteCount(llb, 2) +"\t#o2 Iterative");
		System.out.println( recCount(llb, 2) +"\t#o2 Recursive");

		System.out.println( iteOrder(lla) +"\tOrder Iterative");
		System.out.println( recOrder(lla) +"\tOrder Recursive");
		System.out.println( recOrder(llb) +"\tOrder Recursive");
	}
	public static int iteLen( LispList<Integer> ll ) 
	{
		int sum = 0;
		for( ; !ll.isEmpty(); ll=ll.tail()) 
		{
			sum += 1;
		}
		return sum;
	}
	public static int recLen( LispList<Integer> ll )  
	{
		int sum = 1;
		if( !ll.tail().isEmpty() )
		{
			sum += recLen( ll.tail());
		}
		return sum;
		//return recLen( ll, 0);
	}
	public static int iteCount( LispList<Integer> ll, int a )
	{
		int count = 0;
		for( ; !ll.isEmpty(); ll=ll.tail()) 
		{
			if( ll.head() == a)
			{
				count++;
			}
		}
		return count;
	}
	public static int recCount( LispList<Integer> ll, int a ) 
	{
		int count = 0;

		if( !ll.isEmpty())
		{
			count = recCount(ll, a, count);
		}
		return count;
	}
	public static int recCount( LispList<Integer> ll, int a, int count )
	{
		if( ll.head() == a) 
		{
			count ++;
		}
		if( !ll.tail().isEmpty())
		{
			count = recCount( ll.tail(), a, count );
		}
		return count;
	}
	public static boolean iteOrder( LispList<Integer> ll )
	{
		boolean bool = true;
		for( ; !ll.tail().isEmpty(); ll=ll.tail())
		{
			if( ll.head() < ll.tail().head())
			{
				bool = false;
				break;
			}
		}
		return bool;
	}
	public static boolean recOrder( LispList<Integer> ll )
	{
		Boolean bool = true;
		bool = recOrder( ll, bool);

		return bool;
	}
	public static boolean recOrder( LispList<Integer> ll, Boolean bool )
	{
		if( bool == false ) 
		{
			return bool;
		}
		if( !ll.tail().isEmpty()) 
		{
			if( ll.head() < ll.tail().head()) 
			{
				bool = false;
			}
			bool = recOrder( ll.tail(), bool);
		}
		return bool;
	}
}






