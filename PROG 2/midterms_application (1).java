package Prog;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import javax.swing.JRadioButton;

public class midterms_application {

	private JFrame frmMidtermsActivity;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JTextField txtNewUsername;
	private JPasswordField txtNewPassword;
	private JPasswordField txtConfirmPassword;
	private JTextField textField;
	private JTextField txtFrom;
	private JTextField txtDestination;
	private JTextField txtPrice;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					midterms_application window = new midterms_application();
					window.frmMidtermsActivity.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public midterms_application() {
		initialize();
	}

	private void initialize() {
		
		methods_midterms mid = new methods_midterms();
		
		frmMidtermsActivity = new JFrame();
		frmMidtermsActivity.setTitle("Login Form");
		frmMidtermsActivity.setBounds(100, 100, 900, 500);
		frmMidtermsActivity.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMidtermsActivity.getContentPane().setLayout(null);
		
		JPanel pnlLogin = new JPanel();
		pnlLogin.setBounds(0, 0, 876, 463);
		frmMidtermsActivity.getContentPane().add(pnlLogin);
		pnlLogin.setLayout(null);
		
		JPanel pnlChange = new JPanel();
		pnlChange.setBounds(710, 10, 166, 443);
		pnlLogin.add(pnlChange);
		pnlChange.setLayout(null);	
		
		JLabel lblNewLabel_1 = new JLabel("Change Login Credentials");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(258, 10, 299, 55);
		pnlChange.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New Username:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(155, 115, 205, 37);
		pnlChange.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("New Password:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(155, 162, 205, 37);
		pnlChange.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Confirm Password:");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1_1_1.setBounds(155, 209, 205, 37);
		pnlChange.add(lblNewLabel_1_1_1_1);
		
		txtNewUsername = new JTextField();
		txtNewUsername.setBounds(370, 121, 187, 30);
		pnlChange.add(txtNewUsername);
		txtNewUsername.setColumns(10);
		
		txtNewPassword = new JPasswordField();
		txtNewPassword.setBounds(370, 170, 187, 26);
		pnlChange.add(txtNewPassword);
		
		txtConfirmPassword = new JPasswordField();
		txtConfirmPassword.setBounds(370, 217, 187, 26);
		pnlChange.add(txtConfirmPassword);
		
		JButton btnUpdate = new JButton("Update Credentials");
		btnUpdate.setForeground(new Color(255, 255, 255));
		btnUpdate.setBackground(new Color(0, 0, 255));
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnUpdate.setBounds(210, 269, 347, 37);
		pnlChange.add(btnUpdate);
		
		JButton btnBack = new JButton("Cancel");
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBack.setBackground(new Color(220, 20, 60));
		btnBack.setBounds(210, 317, 347, 37);
		pnlChange.add(btnBack);
		pnlChange.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("Login Module");
		lblNewLabel.setBounds(293, 36, 295, 36);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		pnlLogin.add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(153, 114, 180, 36);
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 16));
		pnlLogin.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(153, 166, 180, 36);
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		pnlLogin.add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(354, 120, 192, 30);
		pnlLogin.add(txtUsername);
		txtUsername.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(242, 225, 329, 43);
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(34, 139, 34));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		pnlLogin.add(btnLogin);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(354, 172, 192, 30);
		pnlLogin.add(txtPassword);
		
		JButton btnChange = new JButton("Change Login Credentials");
		btnChange.setBounds(242, 278, 329, 43);
		btnChange.setForeground(Color.WHITE);
		btnChange.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnChange.setBackground(new Color(0, 0, 205));
		pnlLogin.add(btnChange);
		
		JLabel lblHello = new JLabel("Transit Fare Matrix System");
		lblHello.setForeground(SystemColor.desktop);
		lblHello.setEnabled(false);
		lblHello.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHello.setBounds(34, 10, 288, 43);
		frmMidtermsActivity.getContentPane().add(lblHello);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.setBackground(new Color(220, 20, 60));
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLogout.setBounds(629, 410, 247, 43);
		btnLogout.setVisible(false);
		frmMidtermsActivity.getContentPane().add(btnLogout);
		
		JLabel lblFrom = new JLabel("New label");
		lblFrom.setBounds(10, 113, 45, 13);
		frmMidtermsActivity.getContentPane().add(lblFrom);
		
		
		JLabel lblDestination = new JLabel("New label");
		lblDestination.setBounds(10, 195, 45, 13);
		frmMidtermsActivity.getContentPane().add(lblDestination);
		
		JLabel lblPrice = new JLabel("New label");
		lblPrice.setBounds(10, 272, 45, 13);
		frmMidtermsActivity.getContentPane().add(lblPrice);
		
		txtFrom = new JTextField();
		txtFrom.setBounds(10, 126, 96, 19);
		frmMidtermsActivity.getContentPane().add(txtFrom);
		txtFrom.setColumns(10);
		txtFrom.setVisible(false);
		
		
		txtDestination = new JTextField();
		txtDestination.setBounds(10, 212, 96, 19);
		frmMidtermsActivity.getContentPane().add(txtDestination);
		txtDestination.setColumns(10);
		txtDestination.setVisible(false);
		
		txtPrice = new JTextField();
		txtPrice.setBounds(10, 295, 96, 19);
		frmMidtermsActivity.getContentPane().add(txtPrice);
		txtPrice.setColumns(10);
		txtPrice.setVisible(false);
		
		JRadioButton rdbtnStudent = new JRadioButton("New radio button");
		rdbtnStudent.setBounds(144, 125, 103, 21);
		frmMidtermsActivity.getContentPane().add(rdbtnStudent);
		rdbtnStudent.setVisible(false);
		
		JRadioButton rdbtnSenior = new JRadioButton("New radio button");
		rdbtnSenior.setBounds(144, 211, 103, 21);
		frmMidtermsActivity.getContentPane().add(rdbtnSenior);
		rdbtnSenior.setVisible(false);
		
		JPanel pnlFare = new JPanel();
		pnlFare.setBounds(10, 10, 312, 402);
		frmMidtermsActivity.getContentPane().add(pnlFare);
		pnlFare.setLayout(null);
		
		

		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mid.getUsername().equals(txtUsername.getText()) && mid.getPassword().equals(txtPassword.getText())) {
					pnlLogin.setVisible(false);
					pnlFare.setVisible(true);
					txtFrom.setVisible(true);
					txtDestination.setVisible(true);
					txtPrice.setVisible(true);
					rdbtnStudent.setVisible(true);
					rdbtnSenior.setVisible(true);
					btnLogout.setVisible(true);
					lblHello.setText("Hello," + mid.getUsername());				
					txtUsername.setText("");
					txtPassword.setText("");
				}else {
					JOptionPane.showMessageDialog(null, "Invalid Username/Password, please try again!!");
					txtUsername.setText("");
					txtPassword.setText("");
					
			
					
				}
			}
		});
		
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlLogin.setVisible(true);
				btnLogout.setVisible(false);
			}
		});
		
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(mid.getUsername().equals(txtUsername.getText()) && mid.getPassword().equals(txtPassword.getText())) {
					pnlChange.setVisible(true);
					btnLogin.setVisible(true);
					btnChange.setVisible(false);
					txtUsername.setVisible(false);
					txtPassword.setVisible(false);
					txtUsername.setText("");
					txtPassword.setText("");
				}else {
					JOptionPane.showMessageDialog(null, "Invalid Username/Password, please try again!!");
					txtUsername.setText("");
					txtPassword.setText("");
				}
			}
		});
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlChange.setVisible(false);
				btnLogin.setVisible(true);
				btnChange.setVisible(true);
				txtUsername.setVisible(true);
				txtPassword.setVisible(true);
				txtUsername.setText("");
				txtPassword.setText("");
			}
		});
		
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtNewPassword.getText().equals(txtConfirmPassword.getText())) {
					mid.setUsername(txtNewUsername.getText());
					mid.setPassword(txtNewPassword.getText());
					JOptionPane.showMessageDialog(null, "Login credentials are successfully updated!!");
					txtNewUsername.setText("");
					txtNewPassword.setText("");
					txtConfirmPassword.setText("");
					
					pnlChange.setVisible(false);
					btnLogin.setVisible(true);
					btnChange.setVisible(true);
					txtUsername.setVisible(true);
					txtPassword.setVisible(true);
					txtUsername.setText("");
					txtPassword.setText("");
				}else{
					JOptionPane.showMessageDialog(null, "Password do not match, please try again!!");
					txtNewUsername.setText("");
					txtNewPassword.setText("");
					txtConfirmPassword.setText("");
				}
			}
		});
	}
}


