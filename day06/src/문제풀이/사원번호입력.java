package 문제풀이;
/* 사원번호 입력: 기103
 * 사원번호 중 첫글자가 '기'인 경우 '기획부이군요', 
 * '인'인 경우 '인사부이군요', 
 * '개'인 경우 '개발부이군요.' */

import javax.swing.JOptionPane;

public class 사원번호입력 {

	public static void main(String[] args) {

		String num = JOptionPane.showInputDialog("사원번호를 입력해주세요.");
		char d = num.charAt(0);
		char l = num.charAt(1); // 위치값 :1

		if (d == '기') {
			System.out.println("기획부이군요.");
		} else if (d == '인') {
			System.out.println("인사부이군요.");
		} else {
			System.out.println("개발부이군요");
		}

		if (l == '1' || l == '2') {
			System.out.println("임원이시네요.");
		} else if (l == '3') {
			System.out.println("부장이시네요.");
		} else if (l == '4' || l == '5') {
			System.out.println("평사원이시네요.");
		} else {
			System.out.println("해당 직급이 없음.");
		}

	}

}
