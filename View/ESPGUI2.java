package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import Controller.ESPGUI2_Listener;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ESPGUI2 extends JFrame {

	ESPGUI2_Listener l;
	private JPanel contentPane;
	public JTextArea jta;
	JScrollPane jsp;
	private JTextField txtTimetable;
	public JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ESPGUI2 frame = new ESPGUI2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public ESPGUI2() {
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
		
		txtTimetable = new JTextField();
		txtTimetable.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		txtTimetable.setEditable(false);
		txtTimetable.setText("TIME-TABLE");
		txtTimetable.setHorizontalAlignment(SwingConstants.CENTER);
		txtTimetable.setBounds(100, 66, 800, 113);
		contentPane.add(txtTimetable);
		txtTimetable.setColumns(10);
		
		l = new ESPGUI2_Listener(this);
		
		btnNewButton = new JButton("SAVE TIMETABLE");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnNewButton.setBounds(1199, 917, 270, 47);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(l);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel.setIcon(new ImageIcon("C:\\FINALIMG2.png"));
		lblNewLabel.setBounds(-156, -28, 2050, 1080);
		contentPane.add(lblNewLabel);
	}
}