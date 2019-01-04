class WordStoreImp implements WordStore{

	private final double LOAD_FACTOR = 0.7;
	private Word[] table;
	private int size;

	//test Varaible
	int used=0;


	WordStoreImp( int n){
		this.size = sizeCalc(n);
		this.table = new Word[n];
	}

	private int sizeCalc( int num){
		// double size = ((double) num)*(1.0/LOAD_FACTOR);
		// return (int) size + 1;
		return num;	
	}
	//graph representation of table.
	@Override
	public String toString(){
		String str = "";
		Word temp = new Word();
		for( Word a : table){
			str += a;
			if( a == null){ 
				str += "\n";
				continue;
			}

			if( a.getNext() != null){
				temp = a;
			}
			while( temp.getNext() != null){
				temp = temp.getNext();
				str += "     ~>~>  "+ temp;

			}
			str +="\n";
		}
		return str;
	}

	//return absolute value
	private int abs( int a){
		if( a < 0){
			return -a;
		}
		return a;
	}
	//collision detecting add method
	public void add( String word){
		int hash = abs( word.hashCode()%size);	
		Word newWord = new Word( word, 1);
		//is bucket occupied?

		if( table[hash] == null ){ 
			table[hash] = newWord;
			used++;
			return;
		}
		else {
			Word curWord = table[hash];
			int i = 1;
			while( curWord.getNext() != null){
				if( curWord.getKey().equals( word)){ i++; } // only increment count if word matches
				newWord.setCount( i);
				curWord = curWord.getNext();
			}
			curWord.next( newWord );
		}
	}
	public int count( String word){
		int hash = abs( word.hashCode()%size);
		Word temp = table[hash];
		if( table[hash] == null){
			return 0;
		}
		else {
			while( table[hash].getNext() != null){
			//iterate through and change temp to the furthermost value;
				if( table[hash].getNext().getKey().equals( word)){
				//if the next value is argument 
				//change furthermost
					temp = table[hash].getNext();
				}
				table[hash] = table[hash].getNext();
			}
			//retreive count of the last variable
			return temp.getCount();
		}
	}

	public void remove( String word){
		int hash = abs( word.hashCode()%size);

		Word current = table[hash];
		Word keep = null;
		if( current == null){ return;}
		while( current != null){
			if( !current.getKey().equals( word)){
				//if the current value is not the same as the argument
				if( keep == null ){
					//if current value is the first copy of the value
					keep = new Word( current.getKey(), current.getCount());
				}
				else{
					keep.next( new Word( current.getKey(), current.getCount()));
				}
				
			}			
			current = current.getNext();
		}
		table[hash] = keep;
	}
	private class Word{
		private String key;
		private int count;
		private Word next;

		Word(){}

		Word( String key, int count){
			this.key = key;
			this.count = count;
		}
		public String getKey(){ return this.key; }
		public Word getNext(){ return this.next; }
		public int getCount(){ return this.count; }

		public void next( Word next){ this.next = next; }
		public void setCount( int count){ this.count = count; }
		public void setKey( String key){ this.key = key; }

		@Override
		public String toString(){
			return key +" :: "+ count;
		}

	}
}