package 문제풀이;
/* 숫자1입력:333
 * 숫자2입력:222
 * 
 * 두 숫자를 정수로 변환해서
 * 
 * 더하기의 결과 출력
 * 빼기의 결과출력
 */

import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {
		
		String fst = JOptionPane.showInputDialog("첫번째 숫자 입력하세요.");
		String snd = JOptionPane.showInputDialog("두번째 숫자 입력하세요.");
		
		int fstI = Integer.parseInt(fst);
		int sndI = Integer.parseInt(snd);
		
		System.out.println("첫번째 숫자와 두번째 숫자의 덧셈 결과: " + (fstI + sndI));
		System.out.println("첫번째 숫자와 두번째 숫자의 뺄셈 결과: " + (fstI - sndI));
		
	}

}
