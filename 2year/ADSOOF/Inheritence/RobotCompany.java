class RobotCompany {
	int balance;

	RobotCompany( int balance){
		this.balance = balance;
	}
	public void collect( FinalRobot robot){
		balance += robot.totalCommission;
		robot.resetTotal();
		System.out.println( balance);
	}
	public FinalRobot newRobot( int commission){
		return new FinalRobot( commission);
	}
}