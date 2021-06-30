package 문제풀이;

import java.util.Scanner;

public class 문제4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("안정성 점수(30%): ");
		Double s = (sc.nextDouble() * 0.3);
		
		System.out.print("속도 점수(50%): ");
		Double sp = (sc.nextDouble() * 0.5);
		
		System.out.print("연비 점수(20%): ");
		Double o = (sc.nextDouble() * 0.2);
		
		Double sum = s + sp + o;
		
		if ( sum >= 90) {
			System.out.println( sum + "점 최우수 입니다.");
			
		} else if ( sum >= 80) {
			System.out.println( sum + "점 우수 입니다.");
			
		} else if ( sum >= 70) {
			System.out.println( sum + "점 보통 입니다.");
			
		} else {
			System.out.println(sum + "점 미달입니다.");
		}
		
	}

}
