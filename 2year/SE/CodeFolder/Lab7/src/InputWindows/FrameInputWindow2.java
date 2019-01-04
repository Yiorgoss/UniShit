package InputWindows;

import javax.swing.*;

public class FrameInputWindow2 extends JFrame implements InputWindow {

	private javax.swing.JTextField input1TF;
	private javax.swing.JTextField input2TF;
	private javax.swing.JButton multiplyBtn;
	private javax.swing.JButton clearBtn;

	public FrameInputWindow2() {
		Font f = new Font("Courier", Font.BOLD,14);
		input1TF = new JTextField(5); input2TF = new JTextField(5);
		multiplyBtn = new JButton("Multiply");
		multiplyBtn.setFont(f);
		clearBtn = new JButton("Clear");
		clearBtn.setFont(f);
		JPanel content = new JPanel();
		content.setLayout(new FlowLayout());
		JLabel in1 = new JLabel("Input 1");
		in1.setFont(f);
		content.add(in1);
		content.add(input1TF);
		JLabel in2 = new JLabel("Input 2");
		in2.setFont(f);
		content.add(in2);
		content.add(input2TF);
		content.add(multiplyBtn);
		content.add(clearBtn);
		this.setContentPane(content);
		this.pack();
		this.setTitle("Alternative Frame for MVC Example(Multiplication)");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public String getInput1() {
		return input1TF.getText();
	}
	public String getInput2() {
		return input2TF.getText();
	}
	public void reset(){
		input1TF.setText("");
		input2TF.setText("");
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