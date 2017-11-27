import java.util.*;

class q8andq9 {

	public static void main( String[] args ) {
		ArrayList<ArrayList<Integer>> arrlM = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> arrlTemp = new ArrayList<ArrayList<Integer>>();

		ArrayList<Integer> arrlA = new ArrayList<Integer>();
		ArrayList<Integer> arrlB = new ArrayList<Integer>();
		ArrayList<Integer> arrlC = new ArrayList<Integer>();
		ArrayList<Integer> arrlD = new ArrayList<Integer>();

		arrlA.add(1);	arrlA.add(2); 	arrlA.add(3);
		arrlB.add(7); 	arrlB.add(5);
		arrlC.add(4);	arrlC.add(4);	arrlC.add(2);
		arrlD.add(8);	arrlD.add(12); 	arrlD.add(3);

		arrlM.add(arrlA);	arrlM.add(arrlB);	arrlM.add(arrlC);	arrlM.add(arrlD);

		System.out.println( arrlM +"Original Array");
		arrlTemp = doesContain_con( arrlM, 2 );
		System.out.println( arrlM +"\t\tConstructively Altered Original ");
		System.out.println( arrlTemp );
		

		doesContain_des( arrlM, 2 );
		System.out.println( "\n"+ arrlM +"\t\tDestructively Altered Original");		
	}
	public static ArrayList<ArrayList<Integer>> doesContain_con( 
						ArrayList<ArrayList<Integer>> arrlist, int a ) {

		ArrayList<ArrayList<Integer>> ret_arrl = new ArrayList<ArrayList<Integer>>(arrlist);
		Iterator<ArrayList<Integer>> iterA = ret_arrl.iterator();

		while( iterA.hasNext() ) {

			ArrayList<Integer> elemA = iterA.next();
			Iterator<Integer> iterB = elemA.iterator();

			while( iterB.hasNext() ) {

				int elemB = iterB.next();

				if( elemB == a ) {
					iterA.remove();
				} 
			}
		}
			return ret_arrl;
	}
	public static void doesContain_des( ArrayList<ArrayList<Integer>> arrlist, int a ) {

		Iterator<ArrayList<Integer>> iterA = arrlist.iterator();

		while( iterA.hasNext() ) {

			ArrayList<Integer> elemA = iterA.next();
			Iterator<Integer> iterB = elemA.iterator();

			while( iterB.hasNext() ) {

				int elemB = iterB.next();

				if( elemB == a ) {
					iterA.remove();
				} 
			}
		}
	}
}