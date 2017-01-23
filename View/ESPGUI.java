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
import javax.swing.JRadioButton;
import javax.swing.JButton;

import Controller.ESPGUI_Listener;

public class ESPGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcomeToExam;
	ESPGUI_Listener l;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ESPGUI frame = new ESPGUI();
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
	public ESPGUI() {
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtWelcomeToExam = new JTextField();
		txtWelcomeToExam.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		txtWelcomeToExam.setText("WELCOME TO EXAM TIMETABLE SCHEDULING");
		txtWelcomeToExam.setEditable(false);
		txtWelcomeToExam.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcomeToExam.setBounds(365, 65, 1230, 167);
		contentPane.add(txtWelcomeToExam);
		txtWelcomeToExam.setColumns(10);
		
		JButton btnNewButton = new JButton("CREATE A NEW TIMETABLE");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 27));
		btnNewButton.setBounds(680, 465, 523, 77);
		contentPane.add(btnNewButton);
		l = new ESPGUI_Listener(this);
		btnNewButton.addActionListener(l);
		
		JButton btnNewButton_1 = new JButton("RETRIEVE AN OLD TIMETABLE");
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.BOLD, 27));
		btnNewButton_1.setBounds(680, 613, 523, 77);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(l);

		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel.setIcon(new ImageIcon("C:\\FINALIMG2.png"));
		lblNewLabel.setBounds(-80, 11, 2050, 1080);
		contentPane.add(lblNewLabel);
	}
}