package models;

import java.util.*;

public class SimpleSums extends Observable {

	protected int input1;
	protected int input2;

	public int getInput1() {
		return this.input1;
	}

	public int getInput2() {
		return this.input2;
	}

	public void modifyValues(int input1, int input2) {
		this.input1 = input1;
		this.input2 = input2;
		result = input1 * input2;
		setChanged();
		notifyObservers();
	}
	public void reset() {
		input1 = 0;
		input2 = 0;
		result = 0;
		setChanged();
		notifyObservers();
	}

}