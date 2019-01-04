import java.util.ArrayList;

class CheckArrayList {

	public static <T> Void checkArrl( Checker<T> check, ArrayList<T> arrl){
		for( int i=0; i<arrl.size(); i++){
			if( !check.check( arrl.get(i))){
				arrl.remove(i);
			}
		}
		return null;
	}
}