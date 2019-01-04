class WordStoreImp_v2 implements WordStore{

	private final double LOAD_FACTOR = 0.7;
	private Word[] table;
	private int size;

	WordStoreImp_v2( int n){
		//this.size = sizeCalc( n);
		this.size = sizeCalc(n);
		this.table = new Word[size];
	}

	//basic resizing of array not needed
	//since data set is know beforehand no need to make it dynamic
	//size > data set 
	private int sizeCalc( int num){
		double size = ((double) num)*(1.0/LOAD_FACTOR);
		return (int) size + 1;	
	}
	// return absolute value
	private int abs( int a){
		if( a < 0){
			return -a;
		}
		return a;
	}

	@Override
	public String toString(){
		String str = "";
		for( int i = 0; i<size; i++){
			str += ""+ table[i] +"\n";
		}
		return str;
	}



	/**
	*Robin Hood Hashing 
	**	Used for memory efficiency
	**	Reduced clustering
	**	decent Performance with loadfactor > 0.9
	**
	** 	"Taking from the rich, giving to the poor"
	** 	poor being the distance from the initial hashed bucket
	**	if bucket occupied, move up until bucket unnocupied
	** 	or insert is "poorer" than entry at current bucket
	*/
	public void add( String word){

		int hash = abs( (int)(( (double)word.hashCode()) % size));
		System.out.println( hash);
		Word nWord, cWord;

		nWord = new Word( word, 1);
		if( table[hash] == null){
		//if table entry is unused -> add new word
			table[hash] = nWord;
		}
		else {
		//hashCode collision
			cWord = table[hash]; 	//get current bucket
			while( cWord != null){
			//return if current bucket is null
				if( cWord.getKey().equals( word)){
				//current bucket value = new word value
				//duplicate value --> increment count on current bucket
					int k = cWord.getCount() + 1;
					cWord.setCount( k);
					return;
				}
				else {
				//values differ --> unique collision
					if( cWord.getDIB() < nWord.getDIB()){
					//if new word is further from initial bucket
					//swap the two buckets
						int new_dib = cWord.getDIB() + 1;
						table[hash] = nWord;
						nWord = cWord;
						nWord.setDIB( new_dib);
					} 
					else {
					//otherwise increment distance from initial bucket
						int new_dib = nWord.getDIB() + 1;
						nWord.setDIB( new_dib);
					}
				//repeat until current bucket is empty
				}
				hash += 1;
				cWord = table[hash];
			}
			table[hash] = nWord;
		//add new Word to null Bucket
		}
	}

	/**
	**	Remove method implements backward shifting	
	**	that is when the bucket with key matching argument is found
	**	remove bucket and shift all buckets in front one bucket further back
	**	until bucket found with DIB == 0 or if next bucket is unnocupied
	**	Decrement DIB counter
	**
	**	if an item could have been added in the bucket
	**	it would have found it by now
	**/
	public void remove( String word){
		int hash = abs( (int)(( (double)word.hashCode()) % (1/LOAD_FACTOR)));
		Word cWord, temp;
		int k;
		
		if( table[hash] == null){
		//	unnocupied bucket = argument not found - exit
			return;
		}
		else {
		//	establish a current bucket
			cWord = table[hash];
			k = 1;
			while( cWord != null){
			//	as long as current bucket is not null
				if( table[hash].getDIB() == 0 && k == 0){
					table[hash] = null;
					return;
				}
				else {
					if( cWord.getKey().equals( word)){
					//	if bucket key = argument - remove bucket
						table[hash] = null;
						hash += 1;
						if( hash >= size){ return; } 	//reached end of array
						cWord = table[hash];
						while( cWord != null){
						// begin backwards shift
							if( cWord.getDIB() == 0){ break; }	//stop at DIB == 0

							k = cWord.getDIB() - 1;
							cWord.setDIB( k);					//decrement DIB
							table[hash-1] = cWord;				//Move Position
							hash += 1;
							cWord = table[hash];				//increment hash until eit condition is met
						}

						table[hash-1] = null;		//remove final copied bucket
						return;
					}
					else {
						k = 0;
						hash += 1;				
						cWord = table[hash];			//increment
					}
				}
			}
		}
	}
	public int count( String word){
		int hash = abs( (int)(( (double)word.hashCode()) % (1/LOAD_FACTOR)));
		Word cWord;
		if( table[hash] == null){
			//word is not stored
			return 0;
		}
		else {
			cWord = table[hash];
			while( cWord != null){
			//	as long as current bucket is not null
				if( cWord.getDIB() == 0 && !cWord.getKey().equals( word)){
					hash += 1;
					cWord = table[hash];
					continue;
				}
				else {
					if( cWord.getKey().equals( word)){
						return cWord.getCount();
					}
					else {
						hash += 1;
						cWord = table[hash];
					}
				}
			}
		}
		return 0;	
	}

	private class Word{
		private String key;
		private int count;
		private int dib;

		Word(){}

		Word( String key, int count){
			this.key = key;
			this.count = count;
		}
		public String getKey(){ return this.key; }
		public int getCount(){ return this.count; }
		public int getDIB(){ return this.dib; }

		public void setCount( int count){ this.count = count; }
		public void setKey( String key){ this.key = key; }
		public void setDIB( int dib){ this.dib = dib; }

		@Override
		public String toString(){

			return key +" --> "+ count +" :: "+dib;
		}

	}
}