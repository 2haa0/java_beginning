package 문제풀이;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 그래픽문제2 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame(); 
		f.setSize(400, 400);	
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setForeground(new Color(51, 51, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 26));
		lblNewLabel.setBounds(12, 94, 140, 47);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(51, 51, 255));
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 26));
		lblNewLabel_1.setBounds(12, 166, 140, 47);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 28));
		t1.setBackground(new Color(255, 255, 153));
		t1.setBounds(164, 94, 172, 47);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 28));
		t2.setColumns(10);
		t2.setBackground(new Color(255, 255, 153));
		t2.setBounds(164, 166, 172, 47);
		f.getContentPane().add(t2);

		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//더하기
				String s1 = t1.getText();
				String s2 = t2.getText();
				JOptionPane.showMessageDialog(f, Integer.parseInt(s1) + Integer.parseInt(s2));
				
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 28));
		btnNewButton.setBounds(37, 245, 148, 70);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("빼기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//빼기
				String s1 = t1.getText();
				String s2 = t2.getText();
				JOptionPane.showMessageDialog(f, Integer.parseInt(s1) - Integer.parseInt(s2));
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 28));
		btnNewButton_1.setBounds(203, 245, 148, 70);
		f.getContentPane().add(btnNewButton_1);
		
		
		f.setVisible(true);  

	}
}
