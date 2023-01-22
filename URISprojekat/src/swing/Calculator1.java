package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;

public class Calculator1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	double firstnumber;
	double secondnubber;
	double result;
	private String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator1 frame = new Calculator1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator1() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 66, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btnCusstom = new JButton("Cusstom expression");
		btnCusstom.setHorizontalAlignment(SwingConstants.LEFT);
		btnCusstom.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnCusstom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 5;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		GridBagConstraints gbc_btnCusstom = new GridBagConstraints();
		gbc_btnCusstom.gridwidth = 7;
		gbc_btnCusstom.fill = GridBagConstraints.BOTH;
		gbc_btnCusstom.insets = new Insets(0, 0, 5, 5);
		gbc_btnCusstom.gridx = 1;
		gbc_btnCusstom.gridy = 2;
		contentPane.add(btnCusstom, gbc_btnCusstom);
		
		JButton btnFaktoriel = new JButton("x!");
		btnFaktoriel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnFaktoriel = new GridBagConstraints();
		gbc_btnFaktoriel.fill = GridBagConstraints.VERTICAL;
		gbc_btnFaktoriel.insets = new Insets(0, 0, 5, 5);
		gbc_btnFaktoriel.gridx = 1;
		gbc_btnFaktoriel.gridy = 3;
		contentPane.add(btnFaktoriel, gbc_btnFaktoriel);
		
		JButton btnSquare = new JButton("√");
		btnSquare.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnSquare = new GridBagConstraints();
		gbc_btnSquare.insets = new Insets(0, 0, 5, 5);
		gbc_btnSquare.gridx = 3;
		gbc_btnSquare.gridy = 3;
		contentPane.add(btnSquare, gbc_btnSquare);
		
		JButton btnStepen = new JButton("x^2");
		btnStepen.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnStepen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnStepen = new GridBagConstraints();
		gbc_btnStepen.insets = new Insets(0, 0, 5, 5);
		gbc_btnStepen.gridx = 5;
		gbc_btnStepen.gridy = 3;
		contentPane.add(btnStepen, gbc_btnStepen);
		
		JButton btnLogaritam = new JButton("ln");
		btnLogaritam.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnLogaritam = new GridBagConstraints();
		gbc_btnLogaritam.insets = new Insets(0, 0, 5, 5);
		gbc_btnLogaritam.gridx = 7;
		gbc_btnLogaritam.gridy = 3;
		contentPane.add(btnLogaritam, gbc_btnLogaritam);
		
		JButton btnLeft = new JButton("(");
		
		btnLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+ "(");
			}
		});
		btnLeft.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnLeft = new GridBagConstraints();
		gbc_btnLeft.insets = new Insets(0, 0, 5, 5);
		gbc_btnLeft.gridx = 1;
		gbc_btnLeft.gridy = 4;
		contentPane.add(btnLeft, gbc_btnLeft);
		
		JButton btnRight = new JButton(")");
		
		btnRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+ ")");
			}
		});
		btnRight.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnRight = new GridBagConstraints();
		gbc_btnRight.insets = new Insets(0, 0, 5, 5);
		gbc_btnRight.gridx = 3;
		gbc_btnRight.gridy = 4;
		contentPane.add(btnRight, gbc_btnRight);
		
		JButton btnPercentage = new JButton("%");
		btnPercentage.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnPercentage = new GridBagConstraints();
		gbc_btnPercentage.insets = new Insets(0, 0, 5, 5);
		gbc_btnPercentage.gridx = 5;
		gbc_btnPercentage.gridy = 4;
		contentPane.add(btnPercentage, gbc_btnPercentage);
		
		JButton btnAC = new JButton("AC");
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
			}
		});
		btnAC.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		GridBagConstraints gbc_btnAC = new GridBagConstraints();
		gbc_btnAC.insets = new Insets(0, 0, 5, 5);
		gbc_btnAC.gridx = 7;
		gbc_btnAC.gridy = 4;
		contentPane.add(btnAC, gbc_btnAC);
		
		JButton btnSeven = new JButton("7");
		
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+ "7");
			}
		});
		btnSeven.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnSeven = new GridBagConstraints();
		gbc_btnSeven.insets = new Insets(0, 0, 5, 5);
		gbc_btnSeven.gridx = 1;
		gbc_btnSeven.gridy = 5;
		contentPane.add(btnSeven, gbc_btnSeven);
		
		JButton btnEight = new JButton("8");
		
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+ "8");
			}
		});
		btnEight.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnEight = new GridBagConstraints();
		gbc_btnEight.insets = new Insets(0, 0, 5, 5);
		gbc_btnEight.gridx = 3;
		gbc_btnEight.gridy = 5;
		contentPane.add(btnEight, gbc_btnEight);
		
		JButton btnNine = new JButton("9");
		
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+ "9");
			}
		});
		btnNine.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnNine = new GridBagConstraints();
		gbc_btnNine.insets = new Insets(0, 0, 5, 5);
		gbc_btnNine.gridx = 5;
		gbc_btnNine.gridy = 5;
		contentPane.add(btnNine, gbc_btnNine);
		
		JButton btnSingular = new JButton("/");
		btnSingular.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnSingular = new GridBagConstraints();
		gbc_btnSingular.insets = new Insets(0, 0, 5, 5);
		gbc_btnSingular.gridx = 7;
		gbc_btnSingular.gridy = 5;
		contentPane.add(btnSingular, gbc_btnSingular);
		
		JButton btnFour = new JButton("4");
		
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+ "4");
			}
		});
		btnFour.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnFour = new GridBagConstraints();
		gbc_btnFour.insets = new Insets(0, 0, 5, 5);
		gbc_btnFour.gridx = 1;
		gbc_btnFour.gridy = 6;
		contentPane.add(btnFour, gbc_btnFour);
		
		JButton btnFive = new JButton("5");
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+ "5");
			}
		});
	
		btnFive.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnFive = new GridBagConstraints();
		gbc_btnFive.insets = new Insets(0, 0, 5, 5);
		gbc_btnFive.gridx = 3;
		gbc_btnFive.gridy = 6;
		contentPane.add(btnFive, gbc_btnFive);
		
		JButton btnSix = new JButton("6");
		
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+ "6");
			}
		});
		btnSix.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnSix = new GridBagConstraints();
		gbc_btnSix.insets = new Insets(0, 0, 5, 5);
		gbc_btnSix.gridx = 5;
		gbc_btnSix.gridy = 6;
		contentPane.add(btnSix, gbc_btnSix);
		
		JButton btnplural = new JButton("*");
		btnplural.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnplural = new GridBagConstraints();
		gbc_btnplural.insets = new Insets(0, 0, 5, 5);
		gbc_btnplural.gridx = 7;
		gbc_btnplural.gridy = 6;
		contentPane.add(btnplural, gbc_btnplural);
		
		JButton btnOne = new JButton("1");
		
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+ "1");
			}
		});
		btnOne.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnOne = new GridBagConstraints();
		gbc_btnOne.insets = new Insets(0, 0, 5, 5);
		gbc_btnOne.gridx = 1;
		gbc_btnOne.gridy = 7;
		contentPane.add(btnOne, gbc_btnOne);
		
		JButton btnTwo = new JButton("2");
		
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+ "2");
			}
		});
		btnTwo.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnTwo = new GridBagConstraints();
		gbc_btnTwo.insets = new Insets(0, 0, 5, 5);
		gbc_btnTwo.gridx = 3;
		gbc_btnTwo.gridy = 7;
		contentPane.add(btnTwo, gbc_btnTwo);
		
		JButton btnThree = new JButton("3");
		
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+ "3");
			}
		});
		btnThree.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnThree = new GridBagConstraints();
		gbc_btnThree.insets = new Insets(0, 0, 5, 5);
		gbc_btnThree.gridx = 5;
		gbc_btnThree.gridy = 7;
		contentPane.add(btnThree, gbc_btnThree);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnMinus = new GridBagConstraints();
		gbc_btnMinus.insets = new Insets(0, 0, 5, 5);
		gbc_btnMinus.gridx = 7;
		gbc_btnMinus.gridy = 7;
		contentPane.add(btnMinus, gbc_btnMinus);
		
		JButton btnZero = new JButton("0");
		
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+ "0");
			}
		});
		btnZero.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnZero = new GridBagConstraints();
		gbc_btnZero.insets = new Insets(0, 0, 5, 5);
		gbc_btnZero.gridx = 1;
		gbc_btnZero.gridy = 8;
		contentPane.add(btnZero, gbc_btnZero);
		
		JButton btnPoint = new JButton(".");
		btnPoint.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnPoint = new GridBagConstraints();
		gbc_btnPoint.insets = new Insets(0, 0, 5, 5);
		gbc_btnPoint.gridx = 3;
		gbc_btnPoint.gridy = 8;
		contentPane.add(btnPoint, gbc_btnPoint);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEqual.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnEqual = new GridBagConstraints();
		gbc_btnEqual.insets = new Insets(0, 0, 5, 5);
		gbc_btnEqual.gridx = 5;
		gbc_btnEqual.gridy = 8;
		contentPane.add(btnEqual, gbc_btnEqual);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPlus.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnPlus = new GridBagConstraints();
		gbc_btnPlus.insets = new Insets(0, 0, 5, 5);
		gbc_btnPlus.gridx = 7;
		gbc_btnPlus.gridy = 8;
		contentPane.add(btnPlus, gbc_btnPlus);
	}

}
