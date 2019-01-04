class CheckInt implements Checker<Integer> {
	public Boolean check( Integer arg){
		if( arg %2 ==1){
			return true;
		} 
		else {
			return false;
		}
	}
}