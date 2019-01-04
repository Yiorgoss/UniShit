package InputWindows;

import controllers.*;

public class ConsoleInputWindow implements InputWindow {

	private java.util.Scanner in;
	private String input1;
	private String input2;
	ConsoleController cc;

	public ConsoleInputWindow() {
		in = new Scanner(System.in);
		input1 = "";
		input2 = "";
	}
	public void addController(ConsoleController cc) {
		this.cc = cc;
	}
	public void setInputs() {
		System.out.print("Enter input 1:");
		input1 = in.nextLine();
		System.out.print("Enter input 2:");
		input2 = in.nextLine();
		cc.multiply();
	}
	public String getInput1() {
		return this.input1;
	}
	public String getInput2() {
		return this.input2;
	}
	public boolean checkForExit() {
		System.out.print("Multiply more numbers?(y/n/r(eset)/e(xit)) ");
		String userIN = in.nextLine();
		if (userIN.equalsIgnoreCase("y")) {
			return true;
		} else if (userIN.equalsIgnoreCase("e")) {
			System.exit(0);
		} else if (userIN.equalsIgnoreCase("r")) {
			cc.reset();
			return true;
		} else;
		return false;
	}
	public void showOpeningMessage() {
		System.out.println("A Simple MVC Example(Multiplication)");
		System.out.println("Awaiting input");
	}
	public void showError(String errMsg) {
		System.err.println(errMsg);
	}

}