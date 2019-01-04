import java.util.*;

class UseCompareClosest {
	public static void main( String[] args){
		CompareClosest cc = new CompareClosest( 25);

		Integer[] arr = { 1, 2, 3, 26, 27, 28};
		List<Integer> arrl = Arrays.asList( arr);

		System.out.println( arrl);
		Collections.sort( arrl, new CompareClosest(25));
		System.out.println( arrl);

		TreeSet<Integer> ts = new TreeSet<Integer>( new CompareClosest(25));
		ts.add( 1); 	ts.add( 2);		ts.add( 3);
		ts.add( 26);	ts.add( 27);	ts.add( 28);

		System.out.println( ts);
	}

}