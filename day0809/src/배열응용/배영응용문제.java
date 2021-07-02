package 배열응용;

import java.util.Scanner;

//사용자로부터 5명의 성적을 입력받아서 평균을 구하는 프로그램을 배열을 이용하여 작성하여 보자.

public class 배영응용문제 {

	public static void main(String[] args) {
		int[] jumsu = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print("성적 입력>>> ");
			jumsu[i] = sc.nextInt() ;
			System.out.println();
		}
		
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i]);
		}
		

	}

}
