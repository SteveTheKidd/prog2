package Sample_Package;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class sample_gui {

	private JFrame frmSampleGui;
	protected Object lblName;
	private JTextField tfText1;
	private JTextField tfText2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sample_gui window = new sample_gui();
					window.frmSampleGui.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public sample_gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		method_sample_gui sample = new method_sample_gui();
		
		frmSampleGui = new JFrame();
		frmSampleGui.setTitle("Sample GUI");
		frmSampleGui.setBounds(100, 100, 600, 400);
		frmSampleGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSampleGui.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(181, 245, 218, 38);
		frmSampleGui.getContentPane().add(lblName);
		
		JButton btnClickMe = new JButton("Click me!");
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				sample.setfirstname(tfText1.getText());
				sample.setlastname(tfText2.getText());
				
				lblName.setText(sample.combine(sample.getfirstname(), sample.getlastname()));
							
			}
		});
		btnClickMe.setFont(new Font("Trajan Pro 3", Font.BOLD, 15));
		btnClickMe.setBounds(181, 315, 218, 38);
		frmSampleGui.getContentPane().add(btnClickMe);
		
		tfText1 = new JTextField();
		tfText1.setFont(new Font("Tahoma", Font.BOLD, 15));
		tfText1.setHorizontalAlignment(SwingConstants.CENTER);
		tfText1.setBounds(181, 58, 218, 38);
		frmSampleGui.getContentPane().add(tfText1);
		tfText1.setColumns(10);
		
		tfText2 = new JTextField();
		tfText2.setHorizontalAlignment(SwingConstants.CENTER);
		tfText2.setFont(new Font("Tahoma", Font.BOLD, 15));
		tfText2.setColumns(10);
		tfText2.setBounds(181, 116, 218, 38);
		frmSampleGui.getContentPane().add(tfText2);
		
		
	}
}
