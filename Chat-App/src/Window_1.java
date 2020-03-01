import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Window_1 extends JFrame {
	
	static String username1;

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_1 frame = new Window_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Window_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 656);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 display1 = new JTextArea();
		display1.setFont(new Font("Raleway", Font.PLAIN, 21));
		display1.setBounds(25, 52, 524, 392);
		contentPane.add(display1);
		
		 text1 = new JTextArea();
		text1.setFont(new Font("Raleway", Font.PLAIN, 20));
		text1.setBounds(25, 472, 386, 76);
		contentPane.add(text1);
		
		 send1 = new JButton("SEND");
		send1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = text1.getText();
				if(equals("")) {
					return;
				}
				
				display1.append(username1 + ":" + " " + s + "\n");
				Window_2.sendText();
				text1.setText("");
			}
		});
		send1.setFont(new Font("Raleway", Font.PLAIN, 24));
		send1.setBounds(425, 472, 123, 76);
		contentPane.add(send1);
		
		 label1 = new JLabel("Chat window for: " + username1);
		 label1.setForeground(Color.GREEN);
		label1.setFont(new Font("Raleway", Font.PLAIN, 23));
		label1.setBounds(25, 14, 378, 33);
		contentPane.add(label1);
		
		JButton clear = new JButton("CLEAR");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display1.setText("");
			}
		});
		clear.setFont(new Font("Raleway", Font.PLAIN, 20));
		clear.setBounds(405, 15, 143, 33);
		contentPane.add(clear);
	}

	public static void sendText() {
		String s = Window_2.text2.getText();
		if(s.equals("")) {
			return;
		}
		
		display1.append(Window_2.username2 + ":" + " " + s + "\n" );
	}
	
	private javax.swing.JLabel label1;
	private static javax.swing.JTextArea display1;
	private javax.swing.JButton send1;
	public static javax.swing.JTextArea text1;
}
