package 배열응용;

import java.util.Random;

public class 토익문제 {

	public static void main(String[] args) {
		//답안 999개 공간
		//내답 999개 공간
		
		int[] 답안 = new int[999];
		int[] 내답 = new int[999];
		int count = 0;
		int ex1 = 0;
		
		Random r = new Random(42);
		for (int i = 0; i < 내답.length; i++) {
			답안[i] = r.nextInt(4) + 1; // 0~3(1~4)
			내답[i] = r.nextInt(4) + 1;
		}
		System.out.println("번호 :  답안       내답");
		for (int i = 0; i < 내답.length; i++) {
			System.out.print(i + "  :   " + 답안[i] + "   <->   " + 내답[i]);
			if(답안[i] == 내답[i]) {
				System.out.println("    딩동댕");
				count++;
			} else {
				 System.out.println("   틀렸어요");
			}
			
			if(답안[i] < 내답[i]) {
				ex1++;
			}
			
			
		}
		System.out.println("총 점수는 " + count +"점");
		System.out.println(ex1);
		

	}

}
