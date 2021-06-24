package 문제풀이;
//1.변수에 저장: 커피개수 5잔, 커피값 5000원
//  총 커피 값을 계산하고 출력, 커피값이 20000원을 넘으면 할인해드릴게요. 프린트
//  넘지 않으면 "총 커피값을 내세요."

import javax.swing.JOptionPane;

public class 문제풀이1 {

	public static void main(String[] args) {
		int coffee = 5;
		int cfa = 5000;
		
			if ( (coffee * cfa) > 20000 ) {
				JOptionPane.showMessageDialog(null, "할인해드릴게요.");
			
			} else {
				JOptionPane.showMessageDialog(null, "총 커피값을 내세요.");			

			}	
			

	}

}
