import java.util.ArrayList;

class Transformers
{
	public static <T> ArrayList<T> applyConst(Transformer<T> tran,ArrayList<T> a)
	{
		ArrayList<T> b = new ArrayList<T>();
		for(int i=0; i<a.size(); i++)
			b.add(tran.transform(a.get(i))); 
		return b;
	}

	public static <T> Void applyDest( Transformer<T> tran, ArrayList<T> a){
		//destructive version of applyConst
		for( int i=0; i<a.size(); i++){
			a.set( i, tran.transform( a.get(i)));
		}
		return null;
	}
	public static <T> LispList<T> transformList( Transformer<T> tran, LispList<T> ll){
		LispList<T> ret_ll = LispList.empty();
		for(; !ll.isEmpty(); ll=ll.tail()){
			ret_ll = ret_ll.cons(tran.transform( ll.head()));
		}
		for(; !ret_ll.isEmpty(); ret_ll=ret_ll.tail()){
			ll = ll.cons( ret_ll.head());
		}
		return ll;
	}
}
