import java.util.*;

class CompareLength extends CompareSum implements Comparator<List<Integer>> {
	
	//could also instantiate CompareSum obj
	@Override
	public int compare( List<Integer> l1, List<Integer> l2){
		if( l1.size() == l2.size()){
			return sum(l1)-sum(l2);
		}
		return l1.size()-l2.size();
	}	
}