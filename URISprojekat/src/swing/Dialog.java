package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;

public class Dialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Dialog dialog = new Dialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Dialog() {
		setResizable(false);
		setTitle("Custom expression");
		setBounds(100, 100, 450, 233);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 394, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			textField = new JTextField();
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.insets = new Insets(0, 0, 5, 5);
			gbc_textField.gridx = 1;
			gbc_textField.gridy = 1;
			contentPanel.add(textField, gbc_textField);
			textField.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			GridBagConstraints gbc_buttonPane = new GridBagConstraints();
			gbc_buttonPane.insets = new Insets(0, 0, 5, 5);
			gbc_buttonPane.anchor = GridBagConstraints.WEST;
			gbc_buttonPane.gridx = 1;
			gbc_buttonPane.gridy = 2;
			contentPanel.add(buttonPane, gbc_buttonPane);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			{
				JButton okButton = new JButton("Result");
				okButton.setBackground(new Color(255, 239, 213));
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
						String pf = "";
						pf = textField.getText();
						Stack<Integer> st = new Stack<>(); 
				          
				        for(int i=0; i < pf.length(); i++){
				        	
				            char ch = pf.charAt(i); 
				             
				            if(Character.isDigit(ch)) 
				            st.push(ch - '0'); 
				            
				           
				            else {
				            	
				                int broj1 = st.pop(); 
				                int broj2 = st.pop(); 
				                  
				                switch(ch) 
				                { 
				                    case '+': 
				                    st.push(broj2 + broj1); 
				                    break; 
				                      
				                    case '-': 
				                    st.push(broj2 - broj1); 
				                    break; 
				                        
				                    case '*': 
				                    st.push(broj2*broj1); 
				                    break; 
				                    case '/': 
				                    st.push(broj2/broj1); 
				                    break; 
				              } 
				            } 
				        } 
				        
				        textField.setText(textField.getText() + " = " + st.pop());
				        } catch (Exception e4){
				        	JOptionPane.showMessageDialog(null, "Unesite ili broj ili operaciju", 
									"Greška", JOptionPane.ERROR_MESSAGE);
				        }
					}
				});
				{
					JButton btnAC = new JButton("AC");
					btnAC.setBackground(new Color(255, 239, 213));
					buttonPane.add(btnAC);
					btnAC.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							textField.setText("");
						}
					});
				}
				okButton.setActionCommand("Result");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setBackground(new Color(255, 239, 213));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
