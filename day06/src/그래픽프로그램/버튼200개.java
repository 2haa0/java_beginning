package 그래픽프로그램;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼200개 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(800, 800);
		
		FlowLayout flow = new FlowLayout(); // 자동으로 연속 버튼 생성
		f.setLayout(flow);
		
		for (int j = 0; j <= 199; j++) {
			JButton b1 = new JButton((j + 1) + "번");
			f.add(b1);
		}
				
		f.setVisible(true); //항상 맨 아래에 위치한다.
	}

}
