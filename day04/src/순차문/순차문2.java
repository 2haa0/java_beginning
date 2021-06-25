package 순차문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		
		String today = JOptionPane.showInputDialog("오늘은 무슨 요일인가요");
		String temp = JOptionPane.showInputDialog("오늘은 몇 도일까요?");
	
		// 2.처리, 27을 입력
		int yes = 28; //어제 온도
		int temp2 = Integer.parseInt(temp);
		/* 유형과 변수 선언
		 * Integer: 유형을 int를 변경해주는 부품
		 * parseInt: 소괄호안의 내용을 분석하여 int로 변경 
		 *          _만약에 temp의 값에 문자가 포함될 경우 판단결과 False로 int로 변환 할 수 없다.*/
		double temp3 = Double.parseDouble(temp);
		
		int result = yes - temp2;
		double result2 = yes - temp3;

		
		// 3.출력, syso + ctrl + spacebar
		System.out.println(result + "도 차이가 나요.");
		System.out.println(result2 + "도 차이가 나요.");
		
	} //main
} //class
