package swing;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;

public class CalculatorFinish extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnFaktoriel;
	private JButton btnSquare;
	private JButton btnStepen;
	private JButton btnLogaritam;
	private JButton btnLeft;
	private JButton btnRight;
	private JButton btnSeven;
	private JButton btnFour;
	private JButton btnOne;
	private JButton btnZero;
	private JButton btnEight;
	private JButton btnFive;
	private JButton btnTwo;
	private JButton btnPoint;
	private JButton btnPercentage;
	private JButton btnNine;
	private JButton btnSix;
	private JButton btnThree;
	private JButton btnEqual;
	private JButton btnAC;
	private JButton btnSingular;
	private JButton btnMinus;
	private JButton btnPlus;
	private int brojac = 0;
	private double brojJedan, brojDva = 0;
	private String operation = "";
	private JButton CustomEx;
	private JButton btnMnozenje;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {// kreira se objekat i postavlja se visible na true
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorFinish frame = new CalculatorFinish();
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
	public CalculatorFinish() {
		setTitle("Calculator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 441, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{31, 53, 0, 0, 0, 0, 0, 56, 0, 0};
		gbl_contentPane.rowHeights = new int[]{62, 0, 38, 41, 0, 0, 0, 47, 42, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		
		// Traka za brojeve
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField.setEditable(false);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 7;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		textField.setText("");
		
		//Prvi red
		JButton btnCustomEx = new JButton("Custom Expression");
		btnCustomEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dialog dialog = new Dialog();
				dialog.setVisible(true);
			}
		});
		btnCustomEx.setBackground(new Color(255, 239, 213));
		btnCustomEx.setForeground(new Color(0, 0, 0));
		btnCustomEx.setHorizontalAlignment(SwingConstants.LEFT);
		btnCustomEx.setFont(new Font("Times New Roman", Font.BOLD, 17));
		GridBagConstraints gbc_btnCustomEx = new GridBagConstraints();
		gbc_btnCustomEx.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCustomEx.gridwidth = 7;
		gbc_btnCustomEx.insets = new Insets(0, 0, 5, 5);
		gbc_btnCustomEx.gridx = 1;
		gbc_btnCustomEx.gridy = 2;
		contentPane.add(btnCustomEx, gbc_btnCustomEx);
		
		
		//Drugi red
		btnFaktoriel = new JButton("x!");
		btnFaktoriel.setBackground(new Color(255, 239, 213));
		btnFaktoriel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				brojJedan = Double.parseDouble(textField.getText());
				
				if(brojJedan %1 !=0) {
					textField.setText("error");
					JOptionPane.showMessageDialog(null,"Nije moguce izracunati faktorjiel broja koji je decimalan", 
							"Greska",JOptionPane.ERROR_MESSAGE);
				}	else if (textField.getText().charAt(0) == '-') {
					textField.setText("error");
					JOptionPane.showMessageDialog(null, "Broj ne sme da bude negativan(mora biti prirodan broj)",
							"Greska",JOptionPane.ERROR_MESSAGE);
				}else {
					
				textField.setText("" + (faktoriel(brojJedan)));
				}
			}
		});
		
		
		btnFaktoriel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnFaktoriel = new GridBagConstraints();
		gbc_btnFaktoriel.insets = new Insets(0, 0, 5, 5);
		gbc_btnFaktoriel.gridx = 1;
		gbc_btnFaktoriel.gridy = 3;
		contentPane.add(btnFaktoriel, gbc_btnFaktoriel);
		
		btnSquare = new JButton("√");
		btnSquare.setBackground(new Color(255, 239, 213));
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				brojJedan = Double.parseDouble(textField.getText());
				
				if(textField.getText().charAt(0) == '-') {
					textField.setText("error");
					JOptionPane.showMessageDialog(null,"Nije moguce izvrsiti korenovanje negativanog broja", 
							"Greska",JOptionPane.ERROR_MESSAGE);
				}	else {
				
						textField.setText("" + (Math.sqrt(brojJedan)));
				}
				}
		});
		btnSquare.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnSquare = new GridBagConstraints();
		gbc_btnSquare.insets = new Insets(0, 0, 5, 5);
		gbc_btnSquare.gridx = 3;
		gbc_btnSquare.gridy = 3;
		contentPane.add(btnSquare, gbc_btnSquare);
		
		btnStepen = new JButton("x^2");
		btnStepen.setBackground(new Color(255, 239, 213));
		btnStepen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				brojJedan = Double.parseDouble(textField.getText());
				
				textField.setText("" + (brojJedan*brojJedan));
			}
		});
		btnStepen.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnStepen = new GridBagConstraints();
		gbc_btnStepen.insets = new Insets(0, 0, 5, 5);
		gbc_btnStepen.gridx = 5;
		gbc_btnStepen.gridy = 3;
		contentPane.add(btnStepen, gbc_btnStepen);
		
		btnLogaritam = new JButton("ln");
		btnLogaritam.setBackground(new Color(255, 239, 213));
		btnLogaritam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				brojJedan = Double.parseDouble(textField.getText());
				
				textField.setText("" + (Math.log(brojJedan)));
			}
		});
		btnLogaritam.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnLogaritam = new GridBagConstraints();
		gbc_btnLogaritam.insets = new Insets(0, 0, 5, 5);
		gbc_btnLogaritam.gridx = 7;
		gbc_btnLogaritam.gridy = 3;
		contentPane.add(btnLogaritam, gbc_btnLogaritam);
		
		//Treci red
		btnLeft = new JButton("(");
		btnLeft.setBackground(new Color(255, 239, 213));
		btnLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() +"(");
				
			}
		});
		btnLeft.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnLeft = new GridBagConstraints();
		gbc_btnLeft.insets = new Insets(0, 0, 5, 5);
		gbc_btnLeft.gridx = 1;
		gbc_btnLeft.gridy = 4;
		contentPane.add(btnLeft, gbc_btnLeft);
		
		btnRight = new JButton(")");
		btnRight.setBackground(new Color(255, 239, 213));
		btnRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() +")");
			}
		});
		btnRight.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnRight = new GridBagConstraints();
		gbc_btnRight.insets = new Insets(0, 0, 5, 5);
		gbc_btnRight.gridx = 3;
		gbc_btnRight.gridy = 4;
		contentPane.add(btnRight, gbc_btnRight);
		
		btnPercentage = new JButton("%");
		btnPercentage.setBackground(new Color(255, 239, 213));
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				brojJedan = Double.parseDouble(textField.getText());
				
				textField.setText("" + (brojJedan/100));
			}
		});
		btnPercentage.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnPercentage = new GridBagConstraints();
		gbc_btnPercentage.insets = new Insets(0, 0, 5, 5);
		gbc_btnPercentage.gridx = 5;
		gbc_btnPercentage.gridy = 4;
		contentPane.add(btnPercentage, gbc_btnPercentage);
		
		btnAC = new JButton("AC");
		btnAC.setBackground(new Color(255, 239, 213));
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
				
			}
		});
		btnAC.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnAC = new GridBagConstraints();
		gbc_btnAC.insets = new Insets(0, 0, 5, 5);
		gbc_btnAC.gridx = 7;
		gbc_btnAC.gridy = 4;
		contentPane.add(btnAC, gbc_btnAC);
		
		//Cetvrti red
		btnSeven = new JButton("7");
		btnSeven.setBackground(new Color(255, 239, 213));
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "7");
			}
		});
		btnSeven.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnSeven = new GridBagConstraints();
		gbc_btnSeven.insets = new Insets(0, 0, 5, 5);
		gbc_btnSeven.gridx = 1;
		gbc_btnSeven.gridy = 5;
		contentPane.add(btnSeven, gbc_btnSeven);
		
		btnEight = new JButton("8");
		btnEight.setBackground(new Color(255, 239, 213));
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "8");
			}
		});
		btnEight.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnEight = new GridBagConstraints();
		gbc_btnEight.insets = new Insets(0, 0, 5, 5);
		gbc_btnEight.gridx = 3;
		gbc_btnEight.gridy = 5;
		contentPane.add(btnEight, gbc_btnEight);
		
		btnNine = new JButton("9");
		btnNine.setBackground(new Color(255, 239, 213));
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "9");
			}
		});
		btnNine.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnNine = new GridBagConstraints();
		gbc_btnNine.insets = new Insets(0, 0, 5, 5);
		gbc_btnNine.gridx = 5;
		gbc_btnNine.gridy = 5;
		contentPane.add(btnNine, gbc_btnNine);
		
		btnSingular = new JButton("/");
		btnSingular.setBackground(new Color(255, 239, 213));
		btnSingular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				brojJedan = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
				btnMinus.setEnabled(false);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     btnMinus.setEnabled(false);
				btnPlus.setEnabled(false);
				btnMnozenje.setEnabled(false);                           
				                                                                                                                                                                                                                                                                                                                                                                                                                
				}                                        
		});
		btnSingular.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnSingular = new GridBagConstraints();
		gbc_btnSingular.insets = new Insets(0, 0, 5, 5);
		gbc_btnSingular.gridx = 7;
		gbc_btnSingular.gridy = 5;
		contentPane.add(btnSingular, gbc_btnSingular);
		
		//Peti red
		btnFour = new JButton("4");
		btnFour.setBackground(new Color(255, 239, 213));
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "4");
			}
		});
		btnFour.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnFour = new GridBagConstraints();
		gbc_btnFour.insets = new Insets(0, 0, 5, 5);
		gbc_btnFour.gridx = 1;
		gbc_btnFour.gridy = 6;
		contentPane.add(btnFour, gbc_btnFour);
		
		btnFive = new JButton("5");
		btnFive.setBackground(new Color(255, 239, 213));
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField.setText(textField.getText() + "5");
			}
		});
		btnFive.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnFive = new GridBagConstraints();
		gbc_btnFive.insets = new Insets(0, 0, 5, 5);
		gbc_btnFive.gridx = 3;
		gbc_btnFive.gridy = 6;
		contentPane.add(btnFive, gbc_btnFive);
		
		btnSix = new JButton("6");
		btnSix.setBackground(new Color(255, 239, 213));
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "6");
			}
		});
		btnSix.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnSix = new GridBagConstraints();
		gbc_btnSix.insets = new Insets(0, 0, 5, 5);
		gbc_btnSix.gridx = 5;
		gbc_btnSix.gridy = 6;
		contentPane.add(btnSix, gbc_btnSix);
		
		btnMnozenje = new JButton("*");
		btnMnozenje.setBackground(new Color(255, 239, 213));
		btnMnozenje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				brojJedan = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*" ;
				btnMinus.setEnabled(false);
				btnPlus.setEnabled(false);
				btnSingular.setEnabled(false);
			
			}
		});
		btnMnozenje.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnMnozenje = new GridBagConstraints();
		gbc_btnMnozenje.insets = new Insets(0, 0, 5, 5);
		gbc_btnMnozenje.gridx = 7;
		gbc_btnMnozenje.gridy = 6;
		contentPane.add(btnMnozenje, gbc_btnMnozenje);
		
		//Sesti red
		btnOne = new JButton("1");
		btnOne.setBackground(new Color(255, 239, 213));
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "1");
			}
		});
		btnOne.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnOne = new GridBagConstraints();
		gbc_btnOne.insets = new Insets(0, 0, 5, 5);
		gbc_btnOne.gridx = 1;
		gbc_btnOne.gridy = 7;
		contentPane.add(btnOne, gbc_btnOne);
		
		btnTwo = new JButton("2");
		btnTwo.setBackground(new Color(255, 239, 213));
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "2");
			}
		});
		btnTwo.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnTwo = new GridBagConstraints();
		gbc_btnTwo.insets = new Insets(0, 0, 5, 5);
		gbc_btnTwo.gridx = 3;
		gbc_btnTwo.gridy = 7;
		contentPane.add(btnTwo, gbc_btnTwo);
		
		btnThree = new JButton("3");
		btnThree.setBackground(new Color(255, 239, 213));
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "3");
			}
		});
		btnThree.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnThree = new GridBagConstraints();
		gbc_btnThree.insets = new Insets(0, 0, 5, 5);
		gbc_btnThree.gridx = 5;
		gbc_btnThree.gridy = 7;
		contentPane.add(btnThree, gbc_btnThree);
		
		btnMinus = new JButton("-");
		btnMinus.setBackground(new Color(255, 239, 213));
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				brojac++;
				operation = "-";
				btnMinus.setEnabled(false);
				btnPlus.setEnabled(false);
				btnMnozenje.setEnabled(false);
				
				try {
				
				if(textField.getText().charAt(0) == '(') {
						textField.setText(textField.getText() + " - ");
				}else {
				if(textField.getText().charAt(0) != '-') {
					brojac = 2;
				}
				if(brojac == 1) {
					textField.setText("-");	
				}else if(brojac >= 2) {
					brojJedan = Double.parseDouble(textField.getText());
					textField.setText("");
				}
				
				}}catch(Exception e1) {
					if(brojac == 1) {
						textField.setText("-");	
					}else if(brojac >= 2) {
						brojJedan = Double.parseDouble(textField.getText());
						textField.setText("");
					}
				}
				
				
			}
		});
		
		
		btnMinus.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnMinus = new GridBagConstraints();
		gbc_btnMinus.insets = new Insets(0, 0, 5, 5);
		gbc_btnMinus.gridx = 7;
		gbc_btnMinus.gridy = 7;
		contentPane.add(btnMinus, gbc_btnMinus);
		
		//Sedmi red
		btnZero = new JButton("0");
		btnZero.setBackground(new Color(255, 239, 213));
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField.setText(textField.getText() + "0");
			}
		});
		btnZero.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnZero = new GridBagConstraints();
		gbc_btnZero.insets = new Insets(0, 0, 5, 5);
		gbc_btnZero.gridx = 1;
		gbc_btnZero.gridy = 8;
		contentPane.add(btnZero, gbc_btnZero);
		
		btnPoint = new JButton(".");
		btnPoint.setBackground(new Color(255, 239, 213));
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText().concat("."));
			}
		});
		btnPoint.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnPoint = new GridBagConstraints();
		gbc_btnPoint.insets = new Insets(0, 0, 5, 5);
		gbc_btnPoint.gridx = 3;
		gbc_btnPoint.gridy = 8;
		contentPane.add(btnPoint, gbc_btnPoint);
		
		btnEqual = new JButton("=");
		btnEqual.setBackground(new Color(255, 239, 213));
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if(operation.equals("+")) {
						brojDva = Double.parseDouble(textField.getText());
						textField.setText("" + (brojJedan + brojDva));
					}
					
					else if(operation.equals("-")){
						brojDva = Double.parseDouble(textField.getText());
						textField.setText("" + (brojJedan - brojDva));
					}
					
					else if(operation.equals("*")){
						brojDva = Double.parseDouble(textField.getText());
						textField.setText("" + (brojJedan * brojDva));
					}
					
					else if(operation.equals("/")){
						brojDva = Double.parseDouble(textField.getText());
						
						if(brojDva == 0) {
							textField.setText("ERROR");
							JOptionPane.showMessageDialog(null, "Nije dozvoljeno deljenje sa 0", "Greska", JOptionPane.ERROR_MESSAGE);
						
						}else {
						textField.setText("" + (brojJedan / brojDva));
						
						}
						
					}
						
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Molim Vas unesite drugi broj!", 
							"Greska", JOptionPane.ERROR_MESSAGE);
					
				}
			}
		});
		btnEqual.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnEqual = new GridBagConstraints();
		gbc_btnEqual.insets = new Insets(0, 0, 5, 5);
		gbc_btnEqual.gridx = 5;
		gbc_btnEqual.gridy = 8;
		contentPane.add(btnEqual, gbc_btnEqual);
		
		btnPlus = new JButton("+");
		btnPlus.setBackground(new Color(255, 239, 213));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().charAt(0) == '(') {
					textField.setText(textField.getText() + " + ");
				
				}else {
				
				brojJedan = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
				btnMinus.setEnabled(false);
				btnSingular.setEnabled(false);
				btnMnozenje.setEnabled(false);
				}
			}
		});
		btnPlus.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_btnPlus = new GridBagConstraints();
		gbc_btnPlus.insets = new Insets(0, 0, 5, 5);
		gbc_btnPlus.gridx = 7;
		gbc_btnPlus.gridy = 8;
		contentPane.add(btnPlus, gbc_btnPlus);
	}
	public double faktoriel (double brojJedan) {
		double fakt = 1;
		for(int i=1;i<=brojJedan;i++) {
		fakt=fakt*i;
		}
		return fakt;
	}
	
}
