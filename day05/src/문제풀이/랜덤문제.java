package 문제풀이;

import java.util.Random;

/* 랜덤문제
 * 랜덤한 숫자를 2개 발생시켜서 첫번째 랜덤한 숫자가 더 크면 첫번째가 더 커요!
 * 두번째 랜덤한 숫자가 더 크면 두번째가 더 커요! */

public class 랜덤문제 {

	public static void main(String[] args) {
		Random r1 = new Random(); // Random 값은 하나만 있어두 됨.

		int r1I = r1.nextInt(); // nextInt: CPU에서 Random으로 만든 값을 int로 RAM에 저장함.
		int r2I = r1.nextInt();

		System.out.println(r1I); // console에 Random으로 만들어져 RAM에 저장된 값을 출력. 
		System.out.println(r2I);

		if (r1I > r2I) { // 첫번째 생성값이 클 때
			System.out.println("첫번째 숫자가 더 커요!");

		} else if (r1I < r2I) { // 두번째 생성값이 클 때
			System.out.println("두번째 숫자가 더 커요!");

		} else { // 만들어진 두 값이 같을 때
			System.out.println("두 숫자가 같아요!");

		}

	}

}
