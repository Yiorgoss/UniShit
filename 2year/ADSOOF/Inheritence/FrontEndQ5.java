import java.util.ArrayList;

class FrontEndQ5 {
	public static void main( String[] args) throws CanNotEmptyException{
		CanFactory cf = new CanFactory( 50);
		q5 promoMach = new q5( cf, 1, 5, 5, 5, 5);
		ArrayList<Can> cokes = promoMach.getCoke();
		int count =0;

		for( int i=0; i<cokes.size(); i++){
			if( cokes.get(i) instanceof Can){
				System.out.println( count);
				count++;
			}
		}
		count = 0;
		for( int i=0; i<cokes.size(); i++){
			if( cokes.get(i) instanceof PromotionCan){
				cokes.get(i).drink();
				System.out.println( ( (PromotionCan) cokes.get(i)).isWinner() +"\t"+count);

				count++;
			}

		}
	}
}