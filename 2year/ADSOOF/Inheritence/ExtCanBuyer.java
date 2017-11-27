import java.util.ArrayList;

class ExtCanBuyer extends CanBuyer {
	private ArrayList<ExtDrinksMachine1> edm_arr;

	ExtCanBuyer( int commission) {
		super( commission);
		edm_arr = new ArrayList<ExtDrinksMachine1>();
	}
	ExtCanBuyer( int commission, ArrayList<DrinksMachine> dm_arr){
		super( commission, dm_arr);
	}	

	//TODO
	//SINGLE RESPONSIBILTIY.
	public CanAndCash buySprite( int money){
		DrinksMachine temp;
		for( int i=0; i<dm_arr.size(); i++){
			temp = dm_arr.get(i);
			if( temp instanceof ExtDrinksMachine1){
				edm_arr.add( (ExtDrinksMachine1)temp);
			}
		}
		temp = edm_arr.get(0);
		for( int i=1; i<edm_arr.size(); i++){
			temp = DrinksMachineOps.cheaper( temp, edm_arr.get(1));
		}
		totalCommission += commission;
		return CanAndCash.buySpriteOrFanta( temp, money - commission);
	}
}