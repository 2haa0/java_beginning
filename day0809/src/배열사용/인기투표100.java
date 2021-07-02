package 배열사용;

import java.util.Scanner;

public class 인기투표100 {

	public static void main(String[] args) {
		String[] name = {"아이유","유재석","BTS"};
		int[] tv = new int[100]; 
		/* 참조형변수(aka파생변수) tv에는 주소(8바이트)가 들어가 있다.
		   기본형 데이터가 들어가는 변수를 제외하면 다~~~~ 주소가 들어가는 참조형변수임 */
		
		Scanner sc = new Scanner(System.in);
			
		while (true) {
			System.out.println("인기투표 0)아이유 1)유재석 2)BTS 3)종료");
			System.out.print("선택번호>> ");
			int vote = sc.nextInt();
			if (vote == 3) { // 종료되는 코드를 가장 먼저.
				System.out.println("시스템을 종료합니다.");
				for(int i = 0; i < 100; i++) {
					System.out.println(name[i] + ":" + tv[i] + "표");
				}
				System.exit(0);
			} 
			tv[vote]++; // 해당 인덱스에 있는 배열의 값을 1증가
			System.out.println(name[vote] + "에 한 표~");
				
		} 
	}
}
