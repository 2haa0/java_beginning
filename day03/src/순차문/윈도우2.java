package 순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 윈도우2 {
	private static JTextField textField;
	private static JTextField textField_1;

	public static void main(String[] args) {
		//swing은 앞에 S가 다 붙음.
		
		JFrame f = new JFrame(); // 벽돌 만드는 문법
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("버튼1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // 디자인에서 버튼 더블클릭하면 자동생성 되는 코드
				System.out.println("저를 누르셨군요");
				JOptionPane.showMessageDialog(f,"저를 누르셨군요."); // 출력되는 창에 입력값 받지 않는 메세지창.
				// 위치(null을 입력했을 때 화면 가운데에 뜸, f 입력시 f창  가운데에 뜸.)와 메세지가 입력되어야함
			}
		});
		btnNewButton.setFont(new Font("한컴 윤고딕 230", Font.BOLD, 16));
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setBounds(170, 37, 149, 41);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("버튼2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("저도 누르셨군요");
			}
		});
		btnNewButton_1.setFont(new Font("한컴 윤고딕 230", Font.BOLD, 17));
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setBounds(170, 113, 149, 41);
		f.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setFont(new Font("한컴 윤고딕 230", Font.PLAIN, 16));
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(188, 185, 116, 47);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("아이디 :");
		lblNewLabel.setFont(new Font("한컴 쿨재즈 M", Font.BOLD, 36));
		lblNewLabel.setBounds(70, 192, 106, 39);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드:");
		lblNewLabel_1.setFont(new Font("한컴 쿨재즈 L", Font.BOLD, 36));
		lblNewLabel_1.setBounds(61, 285, 125, 64);
		f.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(188, 285, 116, 50);
		f.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		// 윈도우의 좌표값 부여해서 실행시 위치 지정. 좌측위가 (0,0)/ 우측아래가 (x,y) 
		
		
		
		f.setVisible(true); // 이 위로의 코드가 창에 보임 

	}
}
