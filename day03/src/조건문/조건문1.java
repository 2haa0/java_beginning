package 조건문;

import javax.swing.JOptionPane;

public class 조건문1 {

	public static void main(String[] args) {
		// 조건에 따라 T/F이므로 논리데이터
		
		int temp = 25;
		if(temp > 27) { // if(조건){}_조건은 T/F_ 단일 처리일 땐 중괄호 생략가능
			// {} 안에 조건이 true일 때 실행할 내용
			JOptionPane.showMessageDialog(null, "에어컨ON");
			
		}else {
			// {} 안에 조건이 false이면 실행할 내용
			JOptionPane.showMessageDialog(null, "에어컨OFF");
			
		}
		
	}
}
