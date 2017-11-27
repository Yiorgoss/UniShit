class CanAndCash{
	private Can can;
	private int cash;
	CanAndCash( Can can, int cash){
		this.can 	= can;
		this.cash 	= cash;
	}
	public static CanAndCash buyCoke( DrinksMachine dm, int money){
		dm.insert( money);
		return new CanAndCash( dm.pressCoke(), dm.pressChange());
	}
	public static CanAndCash buySpriteOrFanta( DrinksMachine dm, int money){
		if( dm instanceof ExtDrinksMachine1) {
			dm.insert(money);
			return new CanAndCash((( ExtDrinksMachine1) dm ).pressSprite(), dm.pressChange());
		}
		else {
			dm.insert( money);
			return new CanAndCash( dm.pressFanta(), dm.pressChange());
		}
	}
	public int getChange(){
		return cash;
	}
}