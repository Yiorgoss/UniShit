class Word {	
	private Integer count;
	private String value;
	private Word next;
	private HashFunction hf = new HashFunction();

	Word( ){}

	Word( int count, String key){
		this.count = count;	
		this.value = key;
	}
	public int getCount(){ return this.count;}
	public void setCount( int key){ this.count=count;}

	public String getVal(){ return this.value;}
	public void setVal( String value){ this.value = value;}

	public Word next(){ return this.next;}
	public void setNext( Word next){ 
		this.next = next;
	}
}