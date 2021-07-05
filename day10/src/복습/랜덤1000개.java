package 복습;

import java.util.Random;

public class 랜덤1000개 {

	public static void main(String[] args) {
		int[] jumsu = new int[1000];
		/* 변수개수: 1002개
		 * 램의크기: 4012바이트
		 */
		System.out.println(jumsu.length + "개");
		System.out.println(jumsu);
		/* 기본형 변수(값)의 개수: 1001개
		 * 참조형 변수(주소)의 개수: 1개(변수 jumsu)
		 */
		
		Random r = new Random();
		/* System.out.println(r.nextInt(100));
		 * next는 실수, 정수등에도 쓰이지만 int에만 100처럼 바운더리를 정할 수 있다.
		 * 반환값이 있기때문에 프린트가 가능 */
		
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i]);
		}
		for (int i : jumsu) {
			System.out.println(jumsu[i]);
		}
		

	}

}
