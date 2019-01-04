class GenHelloAdder implements Transformer<String> {
	private String first;

	public GenHelloAdder( String a){
		first = a;
	}
	public String transform( String a){
		return first +" "+ a;
	}
}