package 순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 윈도우3 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;

	public static void main(String[] args) {
		//swing은 앞에 S가 다 붙음.
		
		JFrame f = new JFrame(); // ★
		f.getContentPane().setBackground(new Color(51, 153, 102));
		f.setSize(500, 500); //★
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("일기저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("문체부 돋음체", Font.BOLD, 15));
		btnNewButton.setBounds(106, 367, 97, 30);
		f.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(106, 129, 347, 21);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(106, 160, 347, 21);
		f.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(106, 191, 347, 21);
		f.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(255, 153, 153));
		textField_3.setColumns(10);
		textField_3.setBounds(106, 222, 347, 135);
		f.getContentPane().add(textField_3);
		
		JLabel lblNewLabel = new JLabel("번호");
		lblNewLabel.setFont(new Font("문체부 돋음체", Font.BOLD, 15));
		lblNewLabel.setBounds(62, 132, 32, 15);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("날짜");
		lblNewLabel_1.setFont(new Font("문체부 돋음체", Font.BOLD, 15));
		lblNewLabel_1.setBounds(62, 163, 32, 15);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("제목");
		lblNewLabel_2.setFont(new Font("문체부 돋음체", Font.BOLD, 15));
		lblNewLabel_2.setBounds(62, 194, 32, 15);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("내용");
		lblNewLabel_3.setFont(new Font("문체부 돋음체", Font.BOLD, 15));
		lblNewLabel_3.setBounds(62, 222, 32, 15);
		f.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("일기저장");
		btnNewButton_1.setFont(new Font("문체부 돋음체", Font.BOLD, 15));
		btnNewButton_1.setBounds(227, 367, 97, 30);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("일기저장");
		btnNewButton_2.setFont(new Font("문체부 돋음체", Font.BOLD, 15));
		btnNewButton_2.setBounds(356, 367, 97, 30);
		f.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_4 = new JLabel("오늘의 일기작성을 시작합니다");
		lblNewLabel_4.setFont(new Font("문체부 돋음체", Font.BOLD, 15));
		lblNewLabel_4.setBounds(129, 104, 225, 15);
		f.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel(">>>>>>>>>>>>>");
		lblNewLabel_5.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_5.setBounds(356, 105, 128, 15);
		f.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel(">>>>>>>>>>>>>");
		lblNewLabel_5_1.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_5_1.setBounds(0, 106, 128, 15);
		f.getContentPane().add(lblNewLabel_5_1);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(204, 153, 153));
		textField_4.setFont(new Font("문체부 돋음체", Font.BOLD, 37));
		textField_4.setText("나의 일기장");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setBounds(12, 10, 460, 84);
		f.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
	
		
		f.setVisible(true); // ★ 

	}
}
