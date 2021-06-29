package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 버튼3개 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 버튼 3개"); // 실행값 넣어도 됨. 
		f.getContentPane().setBackground(new Color(100, 149, 237));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null); // 레이아웃을 지정하지 않으면 내 임의의 위치에 버튼 삽입 가능
		
		JButton btnNewButton = new JButton("별10개");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
					
				}
			}
		});
		btnNewButton.setFont(new Font("바탕", Font.BOLD, 23));
		btnNewButton.setBackground(new Color(255, 255, 102));
		btnNewButton.setBounds(12, 10, 460, 55);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("커피*5");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("");
				for (int j = 0; j < 5; j++) {
					System.out.print("커피*");
					
				}
			}
		});
		btnNewButton_1.setFont(new Font("바탕", Font.BOLD, 23));
		btnNewButton_1.setBackground(new Color(255, 255, 102));
		btnNewButton_1.setBounds(12, 141, 460, 55);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("커피*우유3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("");
				for (int k = 0; k < 3; k++) {
					System.out.println("커피*우유");
				}
			}
		});
		btnNewButton_2.setFont(new Font("바탕", Font.BOLD, 23));
		btnNewButton_2.setBackground(new Color(255, 255, 102));
		btnNewButton_2.setBounds(12, 266, 460, 55);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("1:짱!");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int y = 0; y < 3; y++) {
					System.out.println((y + 1) + " : 짱!");
					
				}
			}
		});
		btnNewButton_2_1.setFont(new Font("바탕", Font.BOLD, 23));
		btnNewButton_2_1.setBackground(new Color(255, 255, 102));
		btnNewButton_2_1.setBounds(12, 396, 460, 55);
		f.getContentPane().add(btnNewButton_2_1);

		f.setVisible(true);
		
	}
}
