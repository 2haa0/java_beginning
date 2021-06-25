package 문제풀이;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 그래픽문제 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame(); 
		f.getContentPane().setBackground(new Color(46, 139, 87));
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("새굴림", Font.BOLD, 18));
		lblNewLabel.setBounds(32, 53, 151, 34);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 18));
		t1.setBackground(new Color(255, 215, 0));
		t1.setBounds(228, 53, 208, 34);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("당신의 나이는");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("새굴림", Font.BOLD, 18));
		lblNewLabel_1.setBounds(32, 179, 151, 34);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 18));
		t2.setColumns(10);
		t2.setBackground(new Color(255, 192, 203));
		t2.setBounds(228, 179, 208, 34);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_2 = new JLabel("국어점수");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("새굴림", Font.BOLD, 18));
		lblNewLabel_2.setBounds(32, 321, 151, 34);
		f.getContentPane().add(lblNewLabel_2);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.BOLD, 18));
		t3.setColumns(10);
		t3.setBackground(new Color(100, 149, 237));
		t3.setBounds(228, 321, 208, 34);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel_3 = new JLabel("수학점수");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("새굴림", Font.BOLD, 18));
		lblNewLabel_3.setBounds(32, 380, 151, 34);
		f.getContentPane().add(lblNewLabel_3);
		
		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.BOLD, 18));
		t4.setColumns(10);
		t4.setBackground(new Color(100, 149, 237));
		t4.setBounds(228, 380, 208, 34);
		f.getContentPane().add(t4);
		
		JButton btnNewButton = new JButton("어디로 갈까?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/* 버튼을 클릭했을 때 자동으로 이 함수가 실행
				 * 버튼을 클릭했을 때 처리내용을 넣으면 됨
				 */
				String s1 = t1.getText(); // Jtextfield에 입력된 text 가져오기
				if ( s1.equals("아메리카노") || s1.equals("홍차") || s1.equals("프라푸치노")) {
					//equals 써서 비교 할 것. ==와 같은 비교연산자는 기본데이터에만 쓰기로 한다.
					JOptionPane.showMessageDialog(f, "카페로 가세요.");
				} else {
					JOptionPane.showMessageDialog(f, "애슐리로 가세요.");
				}
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 18));
		btnNewButton.setBounds(38, 108, 398, 34);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("나의 내년 나이는?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s2 = t2.getText();
				JOptionPane.showMessageDialog(f, Integer.parseInt(s2) + 1 );
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 18));
		btnNewButton_1.setBounds(38, 233, 398, 34);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("두 과목 점수의 평균은?");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s3 = t3.getText();
				String s4 = t4.getText();
				JOptionPane.showMessageDialog(f, (Double.parseDouble(s3) + Double.parseDouble(s4))/2);
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 18));
		btnNewButton_2.setBounds(38, 434, 398, 34);
		f.getContentPane().add(btnNewButton_2);
		f.setSize(500, 800);
		
		f.setVisible(true);
	}

}
