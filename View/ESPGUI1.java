package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import Controller.ESPGUI1_Listener;
import Controller.ESPGUI_Listener;

public class ESPGUI1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtField;
	private JTextField textField_1;
	private JTextField txtAnyNameOf;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	ESPGUI1_Listener l;
	



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ESPGUI1 frame = new ESPGUI1();
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
	public ESPGUI1() {
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtField = new JTextField();
		txtField.setFont(new Font("Comic Sans MS", Font.BOLD, 27));
		txtField.setText("ENTER NUMBER OF SUBJECTS");
		txtField.setEditable(false);
		txtField.setHorizontalAlignment(SwingConstants.CENTER);
		txtField.setBounds(227, 135, 559, 55);
		contentPane.add(txtField);
		txtField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Comic Sans MS", Font.BOLD, 27));
		textField_1.setBounds(1122, 135, 86, 55);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		txtAnyNameOf = new JTextField();
		txtAnyNameOf.setHorizontalAlignment(SwingConstants.CENTER);
		txtAnyNameOf.setText("CONNECT SUBJECTS WHOSE EXAM CANNOT BE CONDUCTED SIMULTANEOUSLY");
		txtAnyNameOf.setEditable(false);
		txtAnyNameOf.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		txtAnyNameOf.setBounds(227, 485, 867, 44);
		contentPane.add(txtAnyNameOf);
		txtAnyNameOf.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setBounds(563, 684, 198, 38);
		contentPane.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setToolTipText("");
		comboBox_1.setBounds(1027, 684, 198, 38);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnNewButton.setBounds(1593, 140, 122, 50);
		contentPane.add(btnNewButton);
		l = new ESPGUI1_Listener(this);
		btnNewButton.addActionListener(l);
		
		JButton btnNewButton_2 = new JButton("GENERATE TIME-TABLE");
		btnNewButton_2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnNewButton_2.setBounds(1334, 927, 381, 44);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(l);
		
		JButton btnNewButton_3 = new JButton("ADD CONNECTION");
		btnNewButton_3.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnNewButton_3.setBounds(1334, 638, 381, 44);
		contentPane.add(btnNewButton_3);
		btnNewButton_3.addActionListener(l);
		
		JButton btnNewButton_1 = new JButton("ADD SUBJECT");
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnNewButton_1.setBounds(1334, 854, 381, 44);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(l);
		
		JButton btnNewButton_4 = new JButton("DELETE CONNECTION");
		btnNewButton_4.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnNewButton_4.setBounds(1334, 725, 381, 44);
		contentPane.add(btnNewButton_4);
		btnNewButton_4.addActionListener(l);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel.setIcon(new ImageIcon("C:\\FINALIMG2.png"));
		lblNewLabel.setBounds(-108, 0, 2050, 1080);
		contentPane.add(lblNewLabel);
	}
	
	public String getTextField_1() 
	{
		return textField_1.getText();
	}

	public void setTextField_1(String t) 
	{
		textField_1.setText(t);
	}
	
	public Object gettype()
	{
		
		return comboBox.getSelectedItem();
	}
	
	public Object gettype1()
	{
		return comboBox_1.getSelectedItem();
	}
	
	public void combo(int i)
	{
		comboBox.addItem(i);
		comboBox_1.addItem(i);
	}
	

}