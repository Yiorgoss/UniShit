package observers;

import javax.swing.*;
import java.util.*;

/**
 * @author mustafa
 */
public class ObserverFrame extends JFrame implements Observer {

	private javax.swing.JTextField input1TF;
	private javax.swing.JTextField input2TF;
	private javax.swing.JTextField outputTF;

	public ObserverFrame(int index) {
		input1TF = new JTextField(10);
		input1TF.setEditable(false);
		input2TF = new JTextField(10);
		input2TF.setEditable(false);
		outputTF = new JTextField(10);
		outputTF.setEditable(false);
		JPanel content = new JPanel();
		content.setLayout(new FlowLayout());
		content.add(new JLabel("Input1 value"));
		content.add(input1TF);
		content.add(new JLabel("Input2 value"));
		content.add(input2TF);
		content.add(new JLabel("Result"));
		content.add(outputTF);
		this.setContentPane(content);
		this.pack();
		this.setTitle("Observer Frame " + (index + 1));
		this.setLocation(0, index * 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public void update(Observable o, Object arg) {
		if (o instanceof SimpleSums) {
			SimpleSums s = (SimpleSums) o;
			int input1 = s.getInput1();
			int input2 = s.getInput2();
			if (input1 == 0 && input2 == 0) {
				input1TF.setText(String.valueOf(""));
				input2TF.setText(String.valueOf(""));
				outputTF.setText(String.valueOf(""));
			} else {
				input1TF.setText(String.valueOf(input1));
				input2TF.setText(String.valueOf(input2));
				outputTF.setText(String.valueOf(s.getResult()));
			}
		}
	}
}