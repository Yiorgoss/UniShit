package controllers;

import InputWindows.*;
import models.*;
import java.awt.event.*;

public class FrameController2 {

	FrameInputWindow2 m_input;
	SimpleSums m_model;

	public FrameController2(SimpleSums model, FrameInputWindow2 input) {
		m_model = model;
		m_input = input;
//... Add listeners to the input.
		input.addMultiplyListener(new MultiplyListener());
		input.addClearListener(new ClearListener());
	}
	public class MultiplyListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				m_model.modifyValues(Integer.parseInt(m_input.getInput1()),
					Integer.parseInt(m_input.getInput2()));
			} catch (NumberFormatException nfex) {
				m_input.showError("Bad input: '" + m_input.getInput1() + "'" + ", '" +
					m_input.getInput2() + "'");
			}
		}
 }//end inner class MultiplyListener
 public class ClearListener implements ActionListener {
 	@Override
 	public void actionPerformed(ActionEvent e) {
 		m_model.reset();
 		m_input.reset();
 	}
 }// end inner class ClearListener
}