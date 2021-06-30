package 문제풀이;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 문제5 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(51, 102, 0));
		f.setSize(500, 600);
		f.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("아이디:");
		l1.setFont(new Font("궁서", Font.BOLD, 30));
		l1.setBounds(34, 75, 140, 41);
		f.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("패스워드:");
		l2.setFont(new Font("궁서", Font.BOLD, 30));
		l2.setBounds(34, 157, 140, 41);
		f.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("");
		l3.setFont(new Font("궁서", Font.BOLD, 30));
		l3.setBounds(34, 455, 271, 41);
		f.getContentPane().add(l3);
		
		t1 = new JTextField();
		t1.setForeground(new Color(255, 105, 180));
		t1.setFont(new Font("궁서", Font.BOLD, 30));
		t1.setBackground(new Color(255, 255, 153));
		t1.setBounds(209, 75, 225, 41);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setForeground(new Color(255, 105, 180));
		t2.setFont(new Font("궁서", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBackground(new Color(255, 255, 153));
		t2.setBounds(209, 157, 225, 41);
		f.getContentPane().add(t2);
		
		JButton b1 = new JButton("로그인 확인");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String t1s = t1.getText();
				String t2s = t2.getText();
				
				if (t1s.equals("root") && t2s.equals("1111")) {
					l3.setText("로그인 성공");
				} else {
					l3.setText("로그인 실패");
				}
			}
		});
		b1.setBackground(new Color(219, 112, 147));
		b1.setFont(new Font("궁서", Font.BOLD, 30));
		b1.setBounds(34, 301, 225, 98);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("지우기");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
				l3.setText("");
			}
		});
		b2.setFont(new Font("궁서", Font.BOLD, 30));
		b2.setBackground(new Color(219, 112, 147));
		b2.setBounds(271, 301, 181, 98);
		f.getContentPane().add(b2);
		
		
		f.setVisible(true);

	}
}
