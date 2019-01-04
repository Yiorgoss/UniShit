]class HashFunction {
	private int random = 0x1670F; //91919 in hex

	//implement crc hashing for string
	public int crcHash( String str){
		int ret = str.hashCode();
		int high_order = ret & 0xf8000000; 	// 32 bit with first 5 bits = 1 rest 0

		ret = ret << 5;
		ret = ret ^ ( high_order >> 27);

		ret = ret ^ random;
		return ret;
	}

	//hashing function crc for integer values;
	public int crcHash( int ret){
		int high_order = ret & 0xf8000000; 	// 32 bit with first 5 bits = 1 rest 0

		ret = ret << 5;
		ret = ret ^ ( high_order >> 27);

		ret = ret ^ random;
		return ret;
	}
}