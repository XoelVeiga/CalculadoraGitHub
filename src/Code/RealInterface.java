package Code;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class RealInterface {

	private JFrame frame;
	float resul = 0;
	float num1N, num2N;// To set data
	String num1, num2, oper;// This will be setted by operation
	String operation = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					RealInterface window = new RealInterface();
					window.frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RealInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// TODO Set all event handler and the things it have to do with var
		// declarated on class
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel Results = new JPanel();
		frame.getContentPane().add(Results, BorderLayout.SOUTH);
		Results.setLayout(new BorderLayout(0, 0));
		
		JPanel panelOper = new JPanel();
		Results.add(panelOper, BorderLayout.NORTH);
				panelOper.setLayout(new BorderLayout(0, 0));
				
				JLabel lblOperTxt = new JLabel("Operations");
				panelOper.add(lblOperTxt, BorderLayout.WEST);
		
				JLabel lblOper = new JLabel();// Operation
				panelOper.add(lblOper);
				lblOper.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JPanel panelResul = new JPanel();
		Results.add(panelResul, BorderLayout.SOUTH);
				panelResul.setLayout(new BorderLayout(0, 0));
				
				JLabel lblResultTxt = new JLabel("Result");
				lblResultTxt.setHorizontalAlignment(SwingConstants.LEFT);
				panelResul.add(lblResultTxt, BorderLayout.WEST);
		
				JLabel lblResul = new JLabel();// Result
				panelResul.add(lblResul);
				lblResul.setHorizontalAlignment(SwingConstants.RIGHT);

		JPanel numOper = new JPanel();
		frame.getContentPane().add(numOper, BorderLayout.CENTER);
		numOper.setLayout(new BorderLayout(0, 0));

		JPanel operations = new JPanel();
		numOper.add(operations, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("  Basic operations  ");
		operations.add(lblNewLabel);

		JButton btnDiv = new JButton("/");
		btnDiv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				operation = operation + "/";
				lblOper.setText(operation);

			}
		});
		operations.add(btnDiv);

		JButton btnMul = new JButton("*");
		btnMul.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				operation = operation + "*";
				lblOper.setText(operation);

			}
		});
		operations.add(btnMul);

		JButton btnSubstraction = new JButton("-");
		btnSubstraction.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				operation = operation + "-";
				lblOper.setText(operation);
			}
		});
		operations.add(btnSubstraction);

		JButton btnAdd = new JButton("+");
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				operation = operation + "+";
				lblOper.setText(operation);
			}
		});
		operations.add(btnAdd);

		JButton btnResult = new JButton("=");
		btnResult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblResul.setText(getResul());
				lblOper.setText(operation);
				operation="";
			}
		});
		operations.add(btnResult);

		JPanel nums = new JPanel();
		numOper.add(nums, BorderLayout.CENTER);
		GridBagLayout gbl_nums = new GridBagLayout();
		gbl_nums.columnWidths = new int[] { 25, 114, 114, 114, 24, 0 };
		gbl_nums.rowHeights = new int[] { 0, 30, 29, 30, 30, 0, 0 };
		gbl_nums.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_nums.rowWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		nums.setLayout(gbl_nums);

		JButton btn7 = new JButton("7");
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				operation = operation + "7";
				lblOper.setText(operation);
			}
		});
		GridBagConstraints gbc_btn7 = new GridBagConstraints();
		gbc_btn7.fill = GridBagConstraints.BOTH;
		gbc_btn7.insets = new Insets(0, 0, 5, 5);
		gbc_btn7.gridx = 1;
		gbc_btn7.gridy = 1;
		nums.add(btn7, gbc_btn7);

		JButton btn8 = new JButton("8");
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				operation = operation + "8";
				lblOper.setText(operation);
			}
		});
		GridBagConstraints gbc_btn8 = new GridBagConstraints();
		gbc_btn8.fill = GridBagConstraints.BOTH;
		gbc_btn8.insets = new Insets(0, 0, 5, 5);
		gbc_btn8.gridx = 2;
		gbc_btn8.gridy = 1;
		nums.add(btn8, gbc_btn8);

		JButton btn9 = new JButton("9");
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				operation = operation + "9";
				lblOper.setText(operation);
			}
		});
		GridBagConstraints gbc_btn9 = new GridBagConstraints();
		gbc_btn9.fill = GridBagConstraints.BOTH;
		gbc_btn9.insets = new Insets(0, 0, 5, 5);
		gbc_btn9.gridx = 3;
		gbc_btn9.gridy = 1;
		nums.add(btn9, gbc_btn9);

		JButton btn4 = new JButton("4");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				operation = operation + "4";
				lblOper.setText(operation);
			}
		});
		GridBagConstraints gbc_btn4 = new GridBagConstraints();
		gbc_btn4.fill = GridBagConstraints.BOTH;
		gbc_btn4.insets = new Insets(0, 0, 5, 5);
		gbc_btn4.gridx = 1;
		gbc_btn4.gridy = 2;
		nums.add(btn4, gbc_btn4);

		JButton btn5 = new JButton("5");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				operation = operation + "5";
				lblOper.setText(operation);
			}
		});
		GridBagConstraints gbc_btn5 = new GridBagConstraints();
		gbc_btn5.fill = GridBagConstraints.BOTH;
		gbc_btn5.insets = new Insets(0, 0, 5, 5);
		gbc_btn5.gridx = 2;
		gbc_btn5.gridy = 2;
		nums.add(btn5, gbc_btn5);

		JButton btn6 = new JButton("6");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				operation = operation + "6";
				lblOper.setText(operation);
			}
		});
		GridBagConstraints gbc_btn6 = new GridBagConstraints();
		gbc_btn6.fill = GridBagConstraints.BOTH;
		gbc_btn6.insets = new Insets(0, 0, 5, 5);
		gbc_btn6.gridx = 3;
		gbc_btn6.gridy = 2;
		nums.add(btn6, gbc_btn6);

		JButton btn1 = new JButton("1");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				operation = operation + "1";
				lblOper.setText(operation);
			}
		});
		GridBagConstraints gbc_btn1 = new GridBagConstraints();
		gbc_btn1.fill = GridBagConstraints.BOTH;
		gbc_btn1.insets = new Insets(0, 0, 5, 5);
		gbc_btn1.gridx = 1;
		gbc_btn1.gridy = 3;
		nums.add(btn1, gbc_btn1);

		JButton btn2 = new JButton("2");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				operation = operation + "2";
				lblOper.setText(operation);
			}
		});
		GridBagConstraints gbc_btn2 = new GridBagConstraints();
		gbc_btn2.fill = GridBagConstraints.BOTH;
		gbc_btn2.insets = new Insets(0, 0, 5, 5);
		gbc_btn2.gridx = 2;
		gbc_btn2.gridy = 3;
		nums.add(btn2, gbc_btn2);

		JButton btn3 = new JButton("3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				operation = operation + "3";
				lblOper.setText(operation);
			}
		});
		GridBagConstraints gbc_btn3 = new GridBagConstraints();
		gbc_btn3.insets = new Insets(0, 0, 5, 5);
		gbc_btn3.fill = GridBagConstraints.BOTH;
		gbc_btn3.gridx = 3;
		gbc_btn3.gridy = 3;
		nums.add(btn3, gbc_btn3);

		JButton btn0 = new JButton("0");
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				operation = operation + "0";
				lblOper.setText(operation);
			}
		});
		GridBagConstraints gbc_btn0 = new GridBagConstraints();
		gbc_btn0.fill = GridBagConstraints.BOTH;
		gbc_btn0.insets = new Insets(0, 0, 5, 5);
		gbc_btn0.gridx = 1;
		gbc_btn0.gridy = 4;
		nums.add(btn0, gbc_btn0);

		JButton btn00 = new JButton("00");
		btn00.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				operation = operation + "00";
				lblOper.setText(operation);
			}
		});
		GridBagConstraints gbc_btn00 = new GridBagConstraints();
		gbc_btn00.fill = GridBagConstraints.BOTH;
		gbc_btn00.insets = new Insets(0, 0, 5, 5);
		gbc_btn00.gridx = 2;
		gbc_btn00.gridy = 4;
		nums.add(btn00, gbc_btn00);

		JButton btnPoint = new JButton(".");
		btnPoint.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				operation = operation + ".";
				lblOper.setText(operation);
			}
		});
		GridBagConstraints gbc_btnPoint = new GridBagConstraints();
		gbc_btnPoint.insets = new Insets(0, 0, 5, 5);
		gbc_btnPoint.fill = GridBagConstraints.BOTH;
		gbc_btnPoint.gridx = 3;
		gbc_btnPoint.gridy = 4;
		nums.add(btnPoint, gbc_btnPoint);
	}

	public String getResul() {
		return String.valueOf(doResul(operation));

	}

	public float doResul(String operation) {
		String[] a = new String[2];
		a = operation.split("[*]");
		if (a.length == 2) {
			num1N = Float.parseFloat(a[0]);
			num2N = Float.parseFloat(a[1]);
			resul = num1N * num2N;
		}
		a = operation.split("[/]");
		if (a.length == 2) {
			num1N = Float.parseFloat(a[0]);
			num2N = Float.parseFloat(a[1]);
			resul = num1N / num2N;
		}

		a = operation.split("[-]");
		if (a.length == 2) {
			num1N = Float.parseFloat(a[0]);
			num2N = Float.parseFloat(a[1]);
			resul = num1N - num2N;
		}
		a = operation.split("[+]");
		if (a.length == 2) {
			num1N = Float.parseFloat(a[0]);
			num2N = Float.parseFloat(a[1]);
			resul = num1N + num2N;
		}
		return resul;
	}

}
