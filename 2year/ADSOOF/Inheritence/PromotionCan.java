class PromotionCan extends Can {

	private boolean winnerMessage;
	PromotionCan( String cont) {
		super( cont);
		winnerMessage = false;
	}
	PromotionCan( String cont, String secretMessage) {
		super( cont);
		winnerMessage = true;
	}
	public boolean isWinner( ) throws CanNotEmptyException {
		if( !this.isFull()) {
			if( winnerMessage){
				System.out.println("WinnerWinner");
			}
			return winnerMessage;
		} 
		else {
			throw new CanNotEmptyException( "");
		}
	}
}