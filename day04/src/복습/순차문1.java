package 복습;

import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		// 순자문은 입력 -> 처리 ->출력의 순서
		/* 1.입력_ swing, Joptionpane 등
		 * Joptionpane 입력 후 3번줄에 import 안 뜨면_ 
		 * _클릭하고 f2(=코드 위에서 우클릭), 마지막 글자를 지우고 ctrl + spacebar */
		String today = JOptionPane.showInputDialog("오늘은 무슨 요일인가요");
		String temp = JOptionPane.showInputDialog("오늘은 몇 도일까요?");
		/* data가 수기작성 될 경우 값이 String으로만 입력된다.
		 * 때문에 수기작성된 입력 data의 계산이나 대소비교가 요구될 경우 유형을 변경해야 한다. 
		 * _이때 변환 처리 기능을 가진 부품이 이용된다. */
				
		// 2.처리, "금요일은 27.5도"
		String result = today + "은 " + temp + "도";
		/* String과 String 사이의 결합연산자는 문자열을 이어주는 기능을 수행한다.
		 * 저장공간, 대입, 결합
		 *_순서는 RAM에 result를 만들고 CPU가 today와 temp를 RAM에서 가져와 결합후 RAM에 할당 */
		
		// 3.출력, syso + ctrl + spacebar
		System.out.println(result);
		
		/* temp - 1의 경우 temp가 문자열이므로 연산 불가
		 * 
		 */
		
	} //main
} //class
