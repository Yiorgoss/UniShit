import java.util.Random;
import java.util.ArrayList;

class CanFactory {

	private int win_perc;


	CanFactory( int win_perc) { 
		//win_percentage(1..100) 100 = 100% chance of winning
		this.win_perc = win_perc;
		//order = new ArrayList<ArrayList<Can>>();
	}

	public Can makeCan( String cont, boolean isPromo) {
		if( isPromo) {
			return makePromoCan( cont);
		}
		return new Can( cont);
	}
	public PromotionCan makePromoCan( String cont ){
		Random rand = new Random();
		int winner = rand.nextInt(100) + 1;

		//if random number is less than the win percentage, winner Can returned
		if( winner <= win_perc) {
			return new PromotionCan( cont, "secretMessage");
		}
		return new PromotionCan( cont);
	}
	// public void createOrder( int coke, int fanta, int prCoke, int prFanta){
		
	// 	ArrayList<Can> cokeArr = new ArrayList<Can>();
	// 	ArrayList<Can> fantaArr = new ArrayList<Can>();
	// 	ArrayList<PromotionCan> promoCoke = new ArrayList<PromotionCan>();
	// 	ArrayList<PromotionCan> promoFanta = new ArrayList<PromotionCan>();

	// 	while( true) {
	// 		if( coke >= 0 ){
	// 			cokeArr.add( makeCan( "coke", false));
	// 		}
	// 		if( fanta >= 0) {
	// 			fantaArr.add( makeCan( "fanta", false));
	// 		}
	// 		if( prCoke >= 0) {
	// 			promoCoke.add( makeCan( "coke", true));
	// 		}
	// 		if( prFanta >= 0){
	// 			promoFanta.add( makeCan( "fanta", true));
	// 		}
	// 	}
	// 	order.add( cokeArr); 	order.add( fantaArr);
	// 	order.add( promoCoke);	order.add( promoFanta);
	// }
}