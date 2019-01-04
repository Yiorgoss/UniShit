package InputWindows;

/**
 * @author Mustafa
 */
public interface InputWindow {

	String getInput1();

	String getInput2();

	/**
	 * 
	 * @param errMsg
	 */
	void showError(String errMsg);

}