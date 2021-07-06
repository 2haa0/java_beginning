package 문제풀이;
/* 문제1>> 정수 5개 크기의 배열을 만들어서 10,20,30,40,50을 순서대로 넣는다.
 * 첫번째값과 세번째값을 더해서 프린트
 * 
 * 문제2>> 스트링 3개 크기의 배열을 만들어서 자바, 스프링, JPS를 순서대로 넣는다.
 * =>"자바 보다는 스프링"로 출력
 */

import javax.swing.JOptionPane;

public class 문제1 {

	public static void main(String[] args) {
		//문제1>>
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			String numS = JOptionPane.showInputDialog("정수를 입력해 주세요.");
			num[i] = Integer.parseInt(numS);
		}
		System.out.println("첫번째 값과 세번째 값을 더하면 " + (num[0] + num[2]));
		
		/* Scanner로 입력값 받았을 땐 마지막에 sc.clse();로 닫아주면 된다.
		 * 메모리 누수 현상 막아줌. 스트림(연결통로)를 닫아줌.
		 */
		
		
		//문제2>>
		String[] str = {"자바", "스프링", "JPS"};
		System.out.println(str[0] + " 보다는 " + str[1]);
			
		
		

	}

}
