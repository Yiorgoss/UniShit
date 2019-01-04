class CheckStr implements Checker<String>{
	public Boolean check( String arg){
		if( arg.length() >= 3 ){
			return true;
		}
		return false;
	}
}