package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class 버튼3개2 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 버튼 3개"); // 실행값 넣어도 됨. 
		f.getContentPane().setBackground(new Color(100, 149, 237));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JButton b = new JButton("");
		b.setBounds(12, 10, 460, 209); //절대위치 setlayout(null)했을때 좌표가 입력되는 setBounds생성됨.
		f.getContentPane().add(b);
		
		JLabel m = new JLabel("");
		m.setBounds(12, 236, 460, 215);
		f.getContentPane().add(m);
		
		//이미지 넣기, 이미지 하나당 이미지 아이콘 하나씩 생성해야함. 
		ImageIcon car1 = new ImageIcon("car1.png"); //ImageIcon에서는 이미지 크기 조정 불가
		ImageIcon car2 = new ImageIcon("car2.jpg");
		b.setIcon(car1);
		m.setIcon(car2);
		
		
		f.setVisible(true);
		
	}
}
