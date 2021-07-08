package 알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 최소값찾기문제 {

	public static void main(String[] args) {
		/* 1~1000까지의 값을 랜덤하게 10000개 만들어서
		 * 1.최소값을 찾기
		 * 2.개수를 세어보기
		 * 3.위치값을 찾아보기 */

		Random r = new Random();
		int[] s = new int[10000]; // 1차원배열 10000개
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(1000) + 1; 
			//0~999인 값에 1 더해서 변수에 저장
		}
		
		int min = s[0]; // 최소값 변수 선언, 첫번배 배열 값 할당
		for (int i = 1; i < s.length; i++) {
			if(s[i] < min) { // 첫번째 값과 배열을 차례대로 비교
				min = s[i]; 
			}
		}
		System.out.println("최소값은 " + min);
		
		int count = 0; // 최소값의 개수
		String at = ""; 
		for (int i = 0; i < s.length; i++) {
			if(s[i] == min) {
				count++;
				at = at + i + " ";
			}
		}
		System.out.println("최소값의 개수는 " + count);
		System.out.print("최소값들의 인덱스는 " + at);
		
		// 파괴 함수를 이용해서 정렬 후 최소값과 최대값을 찾기
		Arrays.sort(s);
		System.out.println();
		System.out.println(s[0]);
		System.out.println(s[s.length-1]);
		
	}

}
