import java.util.ArrayList;

class Joiners
{
	public static <T> LispList<T> zipLists(Joiner<T> joiner,LispList<T> ls1,LispList<T> ls2)
	{
		if(ls1.isEmpty()||ls2.isEmpty())
			return LispList.empty();
		else
		{
			T h = joiner.join(ls1.head(),ls2.head());
			LispList<T> t = zipLists(joiner,ls1.tail(),ls2.tail());
			return t.cons(h);
		}
	}
	public static <T> ArrayList<T> zipArrayList( Joiner<T> joiner, ArrayList<T> arrl1, ArrayList<T> arrl2){
		//same method as zipLists but for arrayList
		//only works with lists of same size
		ArrayList<T> ret_arrl = new ArrayList<T>();

		if(arrl1.isEmpty() || arrl2.isEmpty()){
			return new ArrayList<T>();
		}
		else {
			for( int i=0; i<arrl1.size(); i++){
				ret_arrl.add( joiner.join( arrl1.get(i), arrl2.get(i)));
			}
		}
		return ret_arrl;
	}
	public static <T> T fold( Joiner<T> joiner, ArrayList<T> arrl){
		T ret_var = arrl.get(0);
		for( int i=1; i<arrl.size(); i++){
			ret_var = joiner.join( ret_var, arrl.get(i));
		}
		return ret_var;
	}
}
