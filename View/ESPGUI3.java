package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import Controller.ESPGUI3_Listener;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class ESPGUI3 extends JFrame {

	private JPanel contentPane;
	public JTextArea jta;
	JScrollPane jsp;
	private JTextField txtEnterTheDate;
	public JTextField textField;
	public JButton btnNewButton;
	
	ESPGUI3_Listener l;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ESPGUI3 frame = new ESPGUI3();
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
	public ESPGUI3() {
		l = new ESPGUI3_Listener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jta = new JTextArea(10,20);
		jta.setVisible(true);
		jsp = new JScrollPane(jta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		jta.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jsp.setBounds(100, 308, 1700, 550);
		
		jsp.setVisible(true);
		contentPane.add(jsp);
		
		/*txtEnterTheDate = new JTextField();
		txtEnterTheDate.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterTheDate.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		txtEnterTheDate.setEditable(false);
		txtEnterTheDate.setText("ENTER THE Sr No");
		txtEnterTheDate.setBounds(89, 62, 376, 36);
		contentPane.add(txtEnterTheDate);
		txtEnterTheDate.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(515, 62, 220, 36);
		textField.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		contentPane.add(textField);
		textField.setColumns(10);*/
		
		btnNewButton = new JButton("SHOW");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnNewButton.setBounds(856, 62, 122, 36);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(l);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel.setIcon(new ImageIcon("C:\\FINALIMG2.png"));
		lblNewLabel.setBounds(-108, 0, 2050, 1080);
		contentPane.add(lblNewLabel);
	}
}