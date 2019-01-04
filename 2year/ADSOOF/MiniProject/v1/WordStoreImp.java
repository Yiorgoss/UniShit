
class WordStoreImp implements WordStore {

	private int size=0;
	private Word[] hashMap;
	//private final HashFunction hf = new HashFunction();
	private int bucket_size;
	int collisions = 0;

	WordStoreImp( int bucket_size) {
		this.bucket_size = bucket_size;
		this.hashMap = new Word[bucket_size];
	}

	//return absolute value
	public int abs( int a){
		if( a < 0){
			return -a;
		}
		return a;
	}

	//add string to wordStore
	public void add( String word) {
		//compute hash = absolute value of standard java hashCode() 
		int hash = abs( word.hashCode()%bucket_size);
		size++;
		if( hashMap[hash] == null){
			hashMap[hash] = new Word( size, word);	
		}
		else {
			//collision handling
			collisions++;
			for( ; hashMap[hash] != null; hashMap[hash]=hashMap[hash].next()){
				if( hashMap[hash].next() == null){
					hashMap[hash].setNext( new Word( size++, word));
					break;
				}
			}
		//	if( hashMap[hash].next() == null){ hashMap[hash].setNext( new Word( size, word)); }
		}
		if( hashMap[hash].getVal().equals( "scaky")){ System.out.println(hashMap[hash].getCount());}
	}

	//count number of times each argument is present;
	public int count( String word) {
		int hash = abs( word.hashCode()%bucket_size);
		Word temp = hashMap[hash];
		int count = 0;	
		while( true){
			count++;
			if( temp.next() != null){
				temp = temp.next();
				//System.out.println( temp.getCount());
				continue;
			}
			return count;
		}	
	}

	//replace Word with a null Word
	public void remove( String word) {
		int hash = abs( word.hashCode() % bucket_size);

		if( hashMap[hash].getVal().equals( word)){
			hashMap[hash] = new Word();
			size--;
		}
		else {
			System.out.println( "Value Does Not Exist");
		}	
	}
}