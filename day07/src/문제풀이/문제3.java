package 문제풀이;

import java.util.Scanner;

/* 나이 입력>> 100      _nextInt();
 * 내년나이는 101세
 * 키를 입력>> 88.8     _nextDouble();
 * 내년 키는 98.8
 * 저녁을 먹었는지 입력(true/false) >> true    _nextBoolean();
 * 배가 부르시겠군요!
 * 올해의 목표는 >> 열심히 살자    _nextLine();
 * 올해의 폭표는 열심히 살자!!! */

public class 문제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이입력>> ");
		int age = sc.nextInt();
		System.out.println("내년 나이는 " + (age + 1) + "세");
		
		System.out.print("키를 입력>> ");
		double stt = sc.nextDouble();
		System.out.println("내년 키는 " + (stt + 10) + "cm");
		
		System.out.print("저녁을 먹었는지 입력(true/false)>> ");
		Boolean dn = sc.nextBoolean();
		if( dn == true) { //dn == true라고 쓸 필요없다. 
			/* if의 괄호 안에는 값이 참만 올 수 있으므로 이미 true의 값을 가진
			 * dn을 굳이 string 값인 true(2바이트*4 + 문자열 만들어주는 주소 4바이트)를 입력해서 CPU를 소비할 필요없다.
			 * if(dn){ } 이면 충분. */
			
			//java의 메모리 최소 할당 값은 1바이트(8비트)지만 boolean은 1비트만 사용됨.
			//메모리의 최소 할당값은 프로그램마다 다름!
			
			System.out.println("배가 부르시겠군요!");
		} else {
			System.out.println("배가 고프시겠군요!");
		}
		
		sc.nextLine(); // 36~39번 줄 코드의 엔터 탱커. 기입하지 않으면 엔터가 아래의 코드에 적용되어 입력할 수 없다.
		
		System.out.print("올해의 목표는>> ");
		String tg = sc.nextLine();
		System.out.println("올해의 목표는 " + tg + "!!!");
		
	}

}
