package 문제풀이;

import java.util.Scanner;

public class 스트림3개입력 {
	//24바이트
	public static void main(String[] args) {
		String[] s = new String[3];
		//배열의 자동 초기화 {null, null, null}
		//총 40바이트
		/* String 변수는 원래 주소가 들어가 있지만,
		 * 내부적으로 그 주소가 가르키는 char들을 프린트 되도록 조정이 되어있는 상태임.
		 */
		
		Scanner sc = new Scanner(System.in);
			
		for (int i = 0; i < s.length; i++) {
			System.out.println("과목 입력>> ");
			s[i] = sc.next();
		}
		System.out.println(s[0] + "보다는 " + s[1]);
		
		
		sc.close();
	}

}
