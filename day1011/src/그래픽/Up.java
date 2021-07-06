package 그래픽;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Up { // main 없이
	public void up() { //명령어 만들기
		JFrame f = new JFrame("업프레임");
		f.setSize(100,100);
		JButton b = new JButton("방구");
		f.add(b);
		f.setVisible(true);
	}

}

public class Upw { 
	public void upw() {
		JFrame f = new JFrame("업프레임");
		f.setSize(100,100);
		JButton b = new JButton("된장");
		f.add(b);
		f.setVisible(true);
	}

}
