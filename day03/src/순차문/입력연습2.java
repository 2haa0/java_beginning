package 순차문;

import javax.swing.JOptionPane;

public class 입력연습2 {

	public static void main(String[] args) {
		String room = JOptionPane.showInputDialog("당신이 있는 강의실 호수는?");
		System.out.println("당신은 " + room + "호에 있습니다.");
		
		String lunch = JOptionPane.showInputDialog("당신의 점심 메뉴는?");
		System.out.println("당신은 " + lunch + "을(를) 먹는군요.");
	}

}
