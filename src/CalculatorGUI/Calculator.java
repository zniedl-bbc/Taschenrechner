package CalculatorGUI;

import java.awt.BorderLayout;

import javax.swing.JWindow;

public class Calculator {
	private JWindow calculator = new JWindow(); 
	
	public Calculator() {
		
		this.initCalculator();
	}
	
	private void initCalculator(){
		calculator.setSize(600, 800);
		calculator.add(new NumberScreen(),BorderLayout.NORTH);
		calculator.setVisible(true);
	}
	
	
}
