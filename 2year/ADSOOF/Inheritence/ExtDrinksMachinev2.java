import java.util.ArrayList;

class ExtDrinksMachinev2 extends DrinksMachine {


	ExtDrinksMachinev2( CanFactory cf, int price, int numCoke, int numFanta, int numpromoCoke, int numpromoFanta){
		super( price);
		initMachine(cf, numCoke, numFanta, numpromoCoke, numpromoFanta);
	}
	private void initMachine( CanFactory cf, int nC, int nF, int nPC, int nPF) {
		int count = 0;
		while( nC != 0 && nF != 0 && nPC != 0 && nPF != 0){
			if( nC >= 0){
				loadCoke( cf.makeCan( "coke", false));
				nC--;
			}
			if( nF >= 0) {
				loadFanta( cf.makeCan( "fanta", false));
				nF--;
			}
			if( nPC >= 0){
				loadPromoCoke( cf.makeCan( "coke", true));
				nPC--;
			}
			if( nPF >= 0){
				loadPromoFanta( cf.makeCan( "fanta", true));
				nPF--;
			}
		}
	}
	public void loadPromoCoke( Can promoCan){
		loadCoke( promoCan);
	}
	public void loadPromoFanta( Can promoCan){
		loadFanta( promoCan);
	}
}