class linked_lists {
	public static <T> boolean isSublist( Cell<T> l1, Cell<T> l2){
		boolean bool = false;
		for( ; l1!=null; l1=l1.next){
			System.out.println( l1.current+"||"+l2.current);
			if( l1.current.equals( l2.current)){
				bool = isSublist( l1.next, l2.next);
				if( l2.next == null){
					return true;
				}
			} 
		}
		return bool;
	}
	public static Cell<Integer> recDestMerge2( Cell<Integer> l1, Cell<Integer> l2) {
		Cell<Integer> ret_cell = null;

		if( l1 == null) { return l2; }
		if( l2 == null) { return l1; }
		if( l1.current == l2.current) {
			l1 = l1.next;
		}
		if( l1 != null && l2 != null) {
			if( l1.current < l2.current) {
				ret_cell = l1;
				ret_cell.next = recDestMerge2(l1.next, l2);
			} else {
				ret_cell = l2;
				ret_cell.next = recDestMerge2(l1, l2.next);
			}
		}
		return ret_cell;
	}
	public static Cell<Integer> recDestMerge( Cell<Integer> l1, Cell<Integer> l2) {
		Cell<Integer> ret_cell = null;

		if( l1 == null) { return l2; }
		if( l2 == null) { return l1; }
		if( l1 != null && l2 != null) {
			if( l1.current < l2.current) {
				ret_cell = l1;
				ret_cell.next = recDestMerge(l1.next, l2);
			} else {
				ret_cell = l2;
				ret_cell.next = recDestMerge(l1, l2.next);
			}
		}
		return ret_cell;
	}
	public static boolean recIsAscending( Cell<Integer> list){
		boolean bool = true;
		if( list.next != null) {
			if( list.current <= list.next.current){
				bool = recIsAscending( list.next);
			} else {
				bool = false;
			}
		}
		return bool;
	}
	public static <T> void destRecInsertAfter( Cell<T> list, T var1, T var2){
		if( list.next != null) {
			if( list.current.equals( var1)) {
				list.next = new Cell<T>( var2, list.next);
				destRecInsertAfter( list.next.next, var1, var2);
			} else {
				destRecInsertAfter( list.next, var1, var2);
			}
		}
	}
	public static <T> Cell<T> iteConsDeleteAll( T var, Cell<T> list){
		Cell<T> temp = null;
		for( ; list!=null; list=list.next){
			if( !list.current.equals( var)) {
				temp = new Cell<T>( list.current, temp);
			}
		}
		for( ; temp!=null; temp=temp.next){
			list = new Cell<T>(temp.current, list);
		}
		return list;
	}
	public static <T> void iteDestDelete( T var, Cell<T> list){
		for( Cell<T> ptr=list; ptr.next!=null; ptr=ptr.next) {
			if( ptr.next.current.equals(var)){
				ptr.next = ptr.next.next;
				break;
			}
			if( ptr.current.equals( var)) {
				ptr.current = ptr.next.current;
				ptr.next = ptr.next.next;
				break;
			}
		}
	}
	public static <T> boolean iteContains( T var, Cell<T> list){
		for( Cell<T> ptr=list; ptr !=null; ptr=ptr.next){
			if( ptr.current.equals( var)) {
				return true;
			}
		}
		return false;
	}
	public static <T> boolean recContains( T var, Cell<T> list) {
		boolean bool = false;

		if( list.current.equals(var)){
			bool = true;
		} else {
			if( list.next == null){ return false; }
			bool = recContains( var, list.next);
		}
		return bool;
	}
	public static <T> String toString( Cell<T> list) {
		String ret = "";
		for(Cell<T> ptr=list; ptr !=null; ptr=ptr.next){
			ret += ptr.current +" ";
		}
		return ret;
	}
	public static void ex1(){
		Cell<Integer> l1 = new Cell<Integer>( 1, new Cell<Integer>( 2, null));

		System.out.println( "\t"+ iteContains( 1, l1) +"<-- Iterative");
		System.out.println( "\t"+ recContains( 2, l1) +"<-- Recursive");
		System.out.println( "\t"+ toString(l1) +"\n");
	}
	public static void ex2(){
		Cell<Integer> l1 = new Cell<Integer>( 1, new Cell<Integer>( 2, new Cell<Integer>( 3, new Cell<Integer>( 4, new Cell<Integer>( 5, null)))));
		System.out.println( "\t"+ toString( l1));
		iteDestDelete( 1, l1);
		System.out.println( "\t"+ toString( l1));
	}
	public static void ex3(){
		Cell<Integer> l1 = new Cell<Integer>( 1, new Cell<Integer>( 2, new Cell<Integer>( 3, new Cell<Integer>( 4, new Cell<Integer>( 5, null)))));
		Cell<Integer> l2;

		System.out.println( "\t"+ toString(l1));
		l2 = iteConsDeleteAll( 1, l1);
		System.out.println( "\t"+ toString(l1));
		System.out.println( "\t"+ toString(l2));
	}
	public static void ex4(){
		Cell<Integer> l1 = new Cell<Integer>( 1, new Cell<Integer>( 2, new Cell<Integer>( 3, new Cell<Integer>( 2, new Cell<Integer>(4, null)))));

		System.out.println(  "\t"+ toString(l1));
		destRecInsertAfter( l1, 2, 13);
		System.out.println(  "\t"+ toString(l1));
	}
	public static void ex5(){
		Cell<Integer> l1 = new Cell<Integer>( 1, new Cell<Integer>( 2, new Cell<Integer>( 3, new Cell<Integer>( 4, null))));

		System.out.println( "\t"+ toString(l1));
		System.out.println( "\t"+ recIsAscending(l1));
	}
	public static void ex6(){
		Cell<Integer> l1 = new Cell<Integer>( 1, new Cell<Integer>( 3, null));
		Cell<Integer> l2 = new Cell<Integer>( 2, new Cell<Integer>( 4, null));
		Cell<Integer> l3;

		System.out.println( "\t"+ toString(l1));
		System.out.println( "\t"+ toString(l2));
		l3 = recDestMerge( l1, l2);
		System.out.println( "\t"+ toString(l1));
		System.out.println( "\t"+ toString(l2));
		System.out.println( "\t"+ toString(l3));
	}
	public static void ex7(){
		Cell<Integer> l1 = new Cell<Integer>( 1, new Cell<Integer>( 2, new Cell<Integer>( 3, null)));
		Cell<Integer> l2 = new Cell<Integer>( 2, new Cell<Integer>( 4, null));
		Cell<Integer> l3;

		System.out.println( "\t"+ toString(l1));
		System.out.println( "\t"+ toString(l2));
		l3 = recDestMerge2( l1, l2);
		System.out.println( "\t"+ toString(l1));
		System.out.println( "\t"+ toString(l2));
		System.out.println( "\t"+ toString(l3));
	}
	public static void ex8(){
		Cell<Integer> l1 = new Cell<Integer>( 1, new Cell<Integer>( 2, new Cell<Integer>( 3, null)));
		Cell<Integer> l2 = new Cell<Integer>( 2, new Cell<Integer>( 3, null));

		System.out.println( isSublist( l1, l2));
	}
	public static void main( String[] args) {
		System.out.println( "EX 1");
		ex1();
		System.out.println( "EX 2");
		ex2();
		System.out.println( "EX 3");
		ex3();
		System.out.println( "EX 4");
		ex4();
		System.out.println( "EX 5");
		ex5();
		System.out.println( "EX 6");
		ex6();
		System.out.println( "EX 7");
		ex7();
		System.out.println( "EX 8");
		ex8();
	}
	private static class Cell <T> {
		T current;
		Cell<T> next;
		//Cell<T> previous;

		Cell( T c, Cell<T> n ){
			current = c;
			next = n;
		}
	}
}