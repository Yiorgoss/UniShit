class Checkers {	
	public <T> boolean check( Checker<T> check, T arg){
		return check.check( arg);
	}
	// public boolean checkInt( Checker<Integer> check, int arg){
	// 	return check.check( arg);
	// }
	// public boolean checkStr( Checker<String> check, String arg){
	// 	return check.check( arg);
	// }
}