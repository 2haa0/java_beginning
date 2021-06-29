package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 버튼5개 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 버튼 5개"); // 실행값 넣어도 됨. 
		// JFrame(컨테이너)에서 F도 대문자인이유: 이전에 있던 Frame에 기능을 향상시킨 버전이 JFrame이므로.
		
		f.setSize(500, 500);
		f.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("서쪽");
		btnNewButton.setBackground(new Color(169, 169, 169));
		btnNewButton.setFont(new Font("돋움체", Font.BOLD, 30));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("가운데");
		btnNewButton_1.setBackground(new Color(255, 255, 153));
		btnNewButton_1.setFont(new Font("돋움체", Font.BOLD, 30));
		f.getContentPane().add(btnNewButton_1, BorderLayout.CENTER);
		
		JButton btnNewButton_2 = new JButton("북쪽");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "북쪽입니다.");
				
			}
		});
		btnNewButton_2.setBackground(new Color(153, 153, 204));
		btnNewButton_2.setFont(new Font("돋움체", Font.BOLD, 30));
		f.getContentPane().add(btnNewButton_2, BorderLayout.NORTH);
		
		JButton btnNewButton_3 = new JButton("동쪽");
		btnNewButton_3.setBackground(new Color(169, 169, 169));
		btnNewButton_3.setFont(new Font("돋움체", Font.BOLD, 30));
		f.getContentPane().add(btnNewButton_3, BorderLayout.EAST);
		
		JButton btnNewButton_4 = new JButton("남쪽");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "남쪽입니다.");
				
			}
		});
		btnNewButton_4.setBackground(new Color(153, 153, 204));
		btnNewButton_4.setFont(new Font("돋움체", Font.BOLD, 30));
		f.getContentPane().add(btnNewButton_4, BorderLayout.SOUTH);
		f.setVisible(true);
		
	}
}
