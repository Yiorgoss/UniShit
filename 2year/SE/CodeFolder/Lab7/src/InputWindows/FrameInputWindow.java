package InputWindows;

import javax.swing.*;

public class FrameInputWindow extends JFrame implements InputWindow {

	private javax.swing.JTextField input1TF;
	private javax.swing.JTextField input2TF;
	private javax.swing.JButton multiplyBtn;
	private javax.swing.JButton clearBtn;

	public FrameInputWindow() {
		input1TF = new JTextField(10);
		input2TF = new JTextField(10);
		multiplyBtn = new JButton("Multiply");
		clearBtn = new JButton("Clear");
		JPanel content = new JPanel();
		content.setLayout(new FlowLayout());
		content.add(new JLabel("Input 1"));
		content.add(input1TF);
		content.add(new JLabel("Input 2"));
		content.add(input2TF);
		content.add(multiplyBtn);
		content.add(clearBtn);
		this.setContentPane(content);
		this.pack();
		this.setTitle("Simple MVC Example(Multiplication)");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public String getInput1() {
		return input1TF.getText();
	}
	public void reset(){
		input1TF.setText("");
		input2TF.setText("");
	}

	public String getInput2() {
		return input2TF.getText();
	}

	public void addMultiplyListener(ActionListener mal) {
		multiplyBtn.addActionListener(mal);
	}
	public void addClearListener(ActionListener cal) {
		clearBtn.addActionListener(cal);
	}
	public void showError(String errMsg) {
		JOptionPane.showMessageDialog(this, errMsg);
	}

}