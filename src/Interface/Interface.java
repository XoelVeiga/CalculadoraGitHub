package Interface;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Interface extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public Interface() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel Results = new JPanel();
		add(Results, BorderLayout.SOUTH);
		Results.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		Results.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		Results.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel numOper = new JPanel();
		add(numOper, BorderLayout.CENTER);
		numOper.setLayout(new BorderLayout(0, 0));
		
		JPanel operations = new JPanel();
		numOper.add(operations, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("   Basic Operations   :");
		operations.add(lblNewLabel);
		
		JButton btnDiv = new JButton("/");
		operations.add(btnDiv);
		
		JButton btnMul = new JButton("*");
		operations.add(btnMul);
		
		JButton btnSubstraction = new JButton("-");
		operations.add(btnSubstraction);
		
		JButton btnAdd = new JButton("+");
		operations.add(btnAdd);
		
		JButton btnResult = new JButton("=");
		operations.add(btnResult);
		
		JPanel Nums = new JPanel();
		numOper.add(Nums, BorderLayout.CENTER);
		Nums.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		Nums.add(panel_3);
		
		JPanel numsA = new JPanel();
		panel_3.add(numsA);
		numsA.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel = new JPanel();
		numsA.add(panel);
		
		JButton btn7 = new JButton("7");
		panel.add(btn7);
		
		JPanel panel_2 = new JPanel();
		numsA.add(panel_2);
		
		JButton btn8 = new JButton("8");
		panel_2.add(btn8);
		
		JPanel panel_1 = new JPanel();
		numsA.add(panel_1);
		
		JButton btn9 = new JButton("9");
		panel_1.add(btn9);
		
		JPanel numsB = new JPanel();
		panel_3.add(numsB);
		numsB.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_4 = new JPanel();
		numsB.add(panel_4);
		
		JButton btn4 = new JButton("4");
		panel_4.add(btn4);
		
		JPanel panel_5 = new JPanel();
		numsB.add(panel_5);
		
		JButton btn5 = new JButton("5");
		panel_5.add(btn5);
		
		JPanel panel_6 = new JPanel();
		numsB.add(panel_6);
		
		JButton btn6 = new JButton("6");
		panel_6.add(btn6);
		
		JPanel numsC = new JPanel();
		panel_3.add(numsC);
		numsC.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_8 = new JPanel();
		numsC.add(panel_8);
		
		JButton btn1 = new JButton("1");
		panel_8.add(btn1);
		
		JPanel panel_9 = new JPanel();
		numsC.add(panel_9);
		
		JButton btn2 = new JButton("2");
		panel_9.add(btn2);
		
		JPanel panel_10 = new JPanel();
		numsC.add(panel_10);
		
		JButton btn3 = new JButton("3");
		panel_10.add(btn3);
		
		JPanel numsD = new JPanel();
		panel_3.add(numsD);
		numsD.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_11 = new JPanel();
		numsD.add(panel_11);
		
		JButton btn0 = new JButton("0");
		panel_11.add(btn0);
		
		JPanel panel_12 = new JPanel();
		numsD.add(panel_12);
		
		JButton btnpoint = new JButton(".");
		panel_12.add(btnpoint);
		
		JPanel panel_7 = new JPanel();
		Nums.add(panel_7, BorderLayout.WEST);
		
		JButton button = new JButton("Useless Button");
		panel_7.add(button);
		
		JPanel panel_13 = new JPanel();
		Nums.add(panel_13, BorderLayout.EAST);
		
		JButton btnUseless = new JButton("Useless Button");
		panel_13.add(btnUseless);

	}

}
