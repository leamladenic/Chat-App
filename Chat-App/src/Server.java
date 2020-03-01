import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Server extends JFrame {

	private JPanel contentPane;
	private JTextField server_name1;
	private JTextField server_name2;

	
 	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Server frame = new Server();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Server() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 511);
		contentPane = new JPanel();
		contentPane.setForeground(Color.MAGENTA);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Connect");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
			}
		});
		btnNewButton.setFont(new Font("Raleway", Font.PLAIN, 24));
		btnNewButton.setBounds(267, 350, 186, 57);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("USER 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNewLabel.setBounds(298, 45, 115, 33);
		contentPane.add(lblNewLabel);
		
		server_name1 = new JTextField();
		server_name1.setFont(new Font("Raleway", Font.PLAIN, 25));
		server_name1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
			}
		});
		server_name1.setBounds(104, 87, 483, 48);
		contentPane.add(server_name1);
		server_name1.setColumns(10);
		
		server_name2 = new JTextField();
		server_name2.setFont(new Font("Raleway", Font.PLAIN, 25));
		server_name2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
			}
		});
		server_name2.setBounds(104, 228, 483, 48);
		contentPane.add(server_name2);
		server_name2.setColumns(10);
		
		JLabel lblUser = new JLabel("USER 2");
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblUser.setBounds(298, 186, 115, 33);
		contentPane.add(lblUser);
	}

	private void createRoom() {
		String p1, p2;
		
		p1 = server_name1.getText();
		p2 = server_name2.getText();
		
		if(p1.equals("") || p2.equals("")) {
			JOptionPane.showMessageDialog(null, "Please enter a valid username!");
			return;
		}
		
		Window_1.username1 = server_name1.getText();
		Window_2.username2 = server_name2.getText();
		ChatRoom.createRoom();
	}
}
