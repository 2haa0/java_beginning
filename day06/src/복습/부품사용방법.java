package 복습;

import java.lang.invoke.SwitchPoint;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 부품사용방법 {

	public static void main(String[] args) {
		/* class의 사용방법은 20여 가지가 넘는 방법이있다.
		 * 지금까지 배운 방법은 두가지로 
		 * 첫번째는 스테틱. 예) Integer,Double,System,JOptionPane
		 *              _이미 RAM에 만들어져 있으며 그냥 가져다 쓰면 됨
		 * 두번째는 프로토. 예) new
		 *              _CPU에서 만들고 RAM에 저장하고 필요할 때 가져다 씀
		 * class를 선택하게 되는 기준은 기능하는 함수를 포함하고 있느냐. 
		 * class는 무조건 RAM에 있어야 사용할 수 있음. */
		
		Date date = new Date(); 
		/* : Date date;_ Date 타입의 변수를 RAM에 선언하고 (선언: RAM에 저장공간을 만듦)
		 *   date = new Date();_ 함수를 RAM에 할당함.
		 * 때문에 타입과 함수가 일치해야한다. */
		
		//CPU는 모든 부품을 RAM에 가져다 놓고 조립한다.
		
		//Random r = new Random();
		//Scanner sc = new Scanner(System.in); //scanner는 입력값을 반드시 필요로 한다.
		
		int hour = date.getHours();
		System.out.println("벌써 " + hour + "시"); // 결합연산자 선 수행 후 out_ out했으므로 이 코드는 변수에 저장 할 수 없다.
		System.out.println(date.getMinutes()); // 실행가능. 함수 안에 들어가는 함수는 세미클론 안 해도 됨.
		// System.out.println(System.out.println()); _ 실행불가능
		
		/* 반환값이 있는 함수와 없는 함수가 있다.
		 * 반환을 return이라고 부른다.
		 * 반환이 있는 함수만 print가 가능하다.
		 * 반황이 없는 함수엔 void라는 단어가 사용된다. */
		
		int month = date.getMonth() + 1;
		String result = "해당계절이 없습니다.";
		if (3<= month && month <= 5) {
			result = "봄";
		}else if (month == 6 || month == 7 || month == 8) {
			result = "여름";
		}else if (month == 9 || month == 10 || month == 11) {
			result = "가을";
		}else {
			result = "겨울";
		}
		
		System.out.println("지금은 " + result + "이에요.");
		
		System.out.println("---------------------------------");
		
		int day = date.getDay(); //요일 0:일요일 1:월요일 ~ 6:토요일
		if (day == 0 || day == 6) {
			System.out.println("주말에는 놀아요.");
			
		} else {
			System.out.println("주중에는 달려요.");
			
		}
		
		while (true) {
			System.out.println("우와하하앙");
			break;
		}
		
		switch (month) { //key에 간단한 연산이나 변수등을 입력한다.
		// switch는 정수중에서도 int까지(long은 안 됨), char는 되지만 실수는 지원하지 않음.
		case 6: 
		case 7: 
		case 8:
			System.out.println("여름");
			break; //if는 자동으로 명령이 종료되지만 switch는 必

		case 9: 
		case 10: 
		case 11:
			System.out.println("가을");
			break; 
		
		case 12: 
		case 1: 
		case 2:
			System.out.println("겨울");
			break; 

		default: //else
			System.out.println("봄");
			break;
		}
		
		switch (month) {
		case 2:
			System.out.println(month + "월은 28일까지");
			break;
			
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "월은 31일까지");

		default:
			System.out.println(month + "월은 30일까지");
			break;
		}
		
	}

}
