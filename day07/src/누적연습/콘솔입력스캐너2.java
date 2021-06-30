package 누적연습;

import java.util.Scanner;

public class 콘솔입력스캐너2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1 입력>> ");
		int num1I = sc.nextInt();
		System.out.print("숫자2 입력>> ");
		int num2I = sc.nextInt();
		
		if (num1I > num2I) {
			System.out.println("앞 숫자가 크다.");
			System.out.println("n1: " + num1I);
			System.out.println("n2: " + num2I);
			
		} else if(num1I < num2I){
			System.out.println("뒤 숫자가 크다.");
			System.out.println("n1: " + num1I);
			System.out.println("n2: " + num2I);

		} else {
			System.out.println("두 숫자가 같다.");
			System.out.println("n1: " + num1I);
			System.out.println("n2: " + num2I);
			
		}
		
		

	}

}
