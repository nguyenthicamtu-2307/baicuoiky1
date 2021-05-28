package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Home frame = new Home();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setTitle("Trang ch\u1EE7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Nh\u00E2n vi\u00EAn");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.nv.setVisible(true);
				Login.home.dispose();
			}
		});
		
		JButton btnNewButton_2 = new JButton("\u0110\u0103ng xu\u1EA5t");
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.home.dispose();
				Login.frame.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(246, 274, 121, 51);
		contentPane.add(btnNewButton_2);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1.setBounds(351, 150, 131, 51);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Kh\u00E1ch h\u00E0ng");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Login.kh.setVisible(true);
				Login.home.dispose();
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(126, 148, 141, 48);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\mo-phong-tap-gym-can-chuan-bi-nhung-gi-1479657301939.jpg"));
		lblNewLabel.setBounds(0, 0, 658, 379);
		contentPane.add(lblNewLabel);
	}

}
