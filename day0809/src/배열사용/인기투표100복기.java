package 배열사용;

import java.util.Scanner;

public class 인기투표100복기 {

	public static void main(String[] args) {
		String[] name = { "아이유", "유재석", "BTS" };
		int[] tv = new int[3]; // {0,0,0}
		for (int i : tv) {
		}
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("인기투표 1)아이유 2)유재석 3)BTS 4)종료");
			System.out.print("선택번호>> ");

			int num = sc.nextInt();

			if (num == 4) {
				for(int i = 0; i < tv.length; i++) {
					System.out.println(name[i] + "님 " + tv[i] + "표 받았습니다.");
				}
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
			}
			tv[num-1]++;
			System.out.println(name[num-1] + "님 득 표");

		}
	}
}
