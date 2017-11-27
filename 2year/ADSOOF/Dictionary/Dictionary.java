

class Dictionary
{
	String[] word_arr = new String[0];

	public void add( String word1, String word2)
	{
		String[] ret_word_arr = new String[word_arr.length+2];

		for( int i=0; i<word_arr.length; i++ )
		{
			ret_word_arr[i] = word_arr[i];
		}
		ret_word_arr[word_arr.length] 	= word1;
		ret_word_arr[word_arr.length+1] = word2;

		word_arr = null;
		word_arr = ret_word_arr;
	}
	public boolean contains( String word)
	{
		boolean bool = false;
		for( int i=0; i<word_arr.length; i+=2)
		{
			if( word_arr[i].equals( word))
			{
				bool = true;
			}
		}
		return bool;
	}
	public String equiv( String word) throws NotFoundException
	{
		String ret_str = "";
		try{
			for( int i=0; i<word_arr.length; i++)
			{
				if( word_arr[i].equals( word))
				{
					if( i == word_arr.length){ throw new NotFoundException( word);}
					ret_str = word_arr[i+1];
					break;
				}
			}	
		} catch( NotFoundException nfe) {
			
		}
		return ret_str;
	}
	public void remove( String word) throws NotFoundException
	{
		String[] ret_word_arr = new String[word_arr.length-2];
		
		int count = 0;
		for( int i=0; i<word_arr.length; i+=2)
		{
			if( count == ret_word_arr.length) {
				throw new NotFoundException( word);
			}
			if( word_arr[count].equals( word))
			{
				count += 2;
				continue;
			}
			ret_word_arr[i] 	= word_arr[count];
			ret_word_arr[i+1]	= word_arr[count+1];
			count += 2;
		}
		word_arr = null;
		word_arr = ret_word_arr;
	}
	public boolean same( String word1, String word2) throws NotFoundException
	{
		boolean bool 	= false;
		boolean is_here = false;

		for( int i=0; i<word_arr.length; i+=2)
		{
			if( word_arr[i].equals( word1) && word_arr[i+1].equals( word2))
			{
				bool 	= true;
				is_here = true;
				break;
			}
			else if( word_arr[i].equals(word1))
			{
				is_here = true;
			}
		}
		if( is_here == false) { throw new NotFoundException( word1); }
		return bool;
	}
	public int size()
	{
		int count = 0;
		for( String item : word_arr)
		{
			count += 1;
		}
		return count/2;
	}
}