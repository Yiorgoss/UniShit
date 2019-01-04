import java.util.Comparator;
import java.lang.Math;

class CompareClosest implements Comparator<Integer> {
	private int num;

	CompareClosest( int num){
		this.num = num;
	}
	
	@Override
	public int compare( Integer a, Integer b){
		return (Math.abs( a-num) - Math.abs( b-num));
	}
}