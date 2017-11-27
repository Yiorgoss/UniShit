import java.util.*;

class q11 {

	public static void main( String[] args ) {

		q10 inp = new q10();
		ArrayList<ArrayList<String>> strAL = new ArrayList<ArrayList<String>>();

		strAL = inp.fInput("twinkle.txt");	

		System.out.println( strAL );
	}
	public static <T> ArrayList<ArrayList<T>> doesContain_con( 
						ArrayList<ArrayList<T>> arrlist, T a ) {

		ArrayList<ArrayList<T>> ret_arrl = new ArrayList<ArrayList<T>>(arrlist);
		Iterator<ArrayList<T>> iterA = ret_arrl.iterator();

		while( iterA.hasNext() ) {

			ArrayList<T> elemA = iterA.next();
			Iterator<T> iterB = elemA.iterator();

			while( iterB.hasNext() ) {

				T elemB = iterB.next();

				if( elemB.equals() ) {
					iterA.remove();
				} 
			}
		}
			return ret_arrl;
	}
	public static <T> void doesContain_des( ArrayList<ArrayList<T>> arrlist, T a ) {

		Iterator<ArrayList<T>> iterA = arrlist.iterator();

		while( iterA.hasNext() ) {

			ArrayList<T> elemA = iterA.next();
			Iterator<T> iterB = elemA.iterator();

			while( iterB.hasNext() ) {

				T elemB = iterB.next();

				if( elemB.equals(a) ) {
					iterA.remove();
				} 
			}
		}
	}
}