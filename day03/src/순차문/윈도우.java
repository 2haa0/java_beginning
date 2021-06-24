package 순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 윈도우 {

	public static void main(String[] args) {
		//swing은 앞에 S가 다 붙음.
		
		JFrame f = new JFrame(); // 벽돌 만드는 문법
		f.setSize(1000, 800);
		
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		b1.setText("나는 첫번째 버튼");
		b2.setText("나는 두번째 버튼");
		f.add(b1);
		f.add(b2);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow); //22번 줄에서 제작한 걸 함.
		
		
		f.setVisible(true); // 이 위로의 코드가 창에 보임 

	}

}
