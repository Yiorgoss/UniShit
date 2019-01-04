class graph {
	public static void main( String[] args){
		WordGen wg = new WordGen();
		WordStoreImp_v2 h_map = new WordStoreImp_v2(10);
		for( int i=0; i<10; i++){
			h_map.add( wg.make());
		}
		System.out.println( h_map);
	}
}