import java.util.ArrayList;

class CanBuyer {

	protected int commission;
	protected int totalCommission;
	protected ArrayList<DrinksMachine> dm_arr;

	CanBuyer( int commission) {
		this.commission = commission;
		totalCommission = 0;
		dm_arr = new ArrayList<DrinksMachine>();
	}
	CanBuyer( int commission, ArrayList<DrinksMachine> dm_arr) {
		this.commission = commission;
		totalCommission = 0;
		this.dm_arr = dm_arr;
	}
	public CanAndCash buyCoke( int money){
		DrinksMachine cheapDM = dm_arr.get(0);
		for(int i=1; i<dm_arr.size(); i++){
			cheapDM = DrinksMachineOps.cheaper( cheapDM, dm_arr.get(i));
		}
		totalCommission += commission;
		return CanAndCash.buyCoke( cheapDM, money - commission - cheapDM.getPrice());
	}
	public CanAndCash buyFanta( int money) {
		DrinksMachine cheapDM = dm_arr.get(0);
		for( int i=1; i<dm_arr.size(); i++) {
			cheapDM = DrinksMachineOps.cheaper( cheapDM, dm_arr.get(i));
		}
		totalCommission += commission;
		return CanAndCash.buySpriteOrFanta( ((DrinksMachine)cheapDM), money - commission - cheapDM.getPrice());	 
	}
	public void resetTotal(){
		this.totalCommission = 0;
	}
}