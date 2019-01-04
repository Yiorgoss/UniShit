import java.util.*;

class CompareSum implements Comparator<List<Integer>> {
		

	//could also instantiate CompareLength obj
	@Override
	public int compare( List<Integer> l1, List<Integer> l2){
		if( sum(l1) == sum(l2)){
			return l1.size()-l2.size();
		}
		return sum(l1) - sum(l2);
	}
	public int sum( List<Integer> l){
		int sum = 0;
		for( int a : l){
			sum += a;
		}
		return sum;
	}
}