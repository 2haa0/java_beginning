package 조건문;
// 3번의 입력을 받아 한번에 출력

import javax.swing.JOptionPane;

public class 조건문3 {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			//++, --: 증감 연산자, RAM의 변수값을 1씩 감소/증가하는 처리
			//for( 시작값; 조건식; 증감식)

			// 1. 입력
			String js = JOptionPane.showInputDialog("점수를 입력해보세요.");
			int jumsu = Integer.parseInt(js);

			// 2. 처리
			String result = null;
			if (jumsu >= 90) {
				result = "A학점";

			} else if (jumsu >= 80) {
				result = "B학점";

			} else if (jumsu >= 70) {
				result = "C학점";
			} else {
				result = "F학점";
			}

			// 3. 출력
			System.out.println("당신의 학점은 " + result);
		} // for

	} // main

} // class
