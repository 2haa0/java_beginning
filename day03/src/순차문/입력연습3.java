package 순차문;

import javax.swing.JOptionPane;

public class 입력연습3 {

	public static void main(String[] args) {
		String day = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String wth = JOptionPane.showInputDialog("오늘의 날씨는 어떤가요?");
		JOptionPane.showMessageDialog(null, day + "은 " + wth);
	
	}

}
