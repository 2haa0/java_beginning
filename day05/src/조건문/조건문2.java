package 조건문;

import javax.swing.JOptionPane;

public class 조건문2 {

	public static void main(String[] args) {
		//1. 입력
		//데이터를 입력받아서 처리해보세요!
		String js = JOptionPane.showInputDialog("점수를 입력해보세요.");
		double jumsu = Double.parseDouble(js);
		
				
		//2. 처리
		String result = null; 
		/* 선언: type + name _ 램에 4바이트의 공간이 할당되며 쓰레기값을 비우는 초기화시켜준다.(initialise)
		 * 쓰레기값은 프린트도 안되고 연산도 불가능하다. */
		if (jumsu >= 90) {
			result = "A학점";
			
		}else if (jumsu >= 80) {
			result = "B학점";
			
		}else if (jumsu >= 70) { 
			result = "C학점";
		}else {
			result = "F학점";
		}
		
		//3. 출력
		System.out.println("당신의 학점은 " + result);
		

	}

}
