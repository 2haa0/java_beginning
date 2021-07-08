package 이차원배열;

import java.util.Random;

/* 랜덤한 값 1~100
 * 4*5인 2차원 배열에 넣으세요.
 * 전체를 프린트. */
public class 정리문제 {

	public static void main(String[] args) {
		int[][] n = new int[4][5]; // 4*5인 2차원 배열 선언
		Random r = new Random(); // 무작위 변수 r 선언 
		for (int i = 0; i < n.length; i++) { // 2차원 배열 n의 행 길이만큼
			System.out.print((i + 1) + "행은 :"); // 인덱스는 0부터 시작하기 때문에 +1값을 더해주고
			for (int j = 0; j < n[i].length; j++) { // i행의 열 길이까지 for문 실행
				int num = r.nextInt(100) + 1; // 무작위 값을 정수로 받아 변수 num에 할당
				// 0~99까지이기 때문에 1을 더해줌.
				n[i][j] = num; // 배열에 num값 할당
				System.out.print(n[i][j] + " "); // 배열 출력
			}
			System.out.println(); // 행을 구분
		}

	}

}
