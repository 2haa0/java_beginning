package 반복문;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class 아무거나 {

	public static void main(String[] args) {
		
		Random r = new Random(); //벽돌 만들기
		//Random의 괄호 안에 수를 넣으면 값이 고정됨. 괄호 안에 들어가는 값을 씨앗값(seed)이라고 한다.
		/* new + 내가 만들고 싶은 함수 -> 오른쪽에 대입연산자 -> 오른쪽에 만든 class와 변수선언
		 * JFrame f = new JFrame();
		 * JButton b1 = new JButton();
		 * JTextField t1 = new JTextField(); */
		
		int num = r.nextInt(100); //정수의 범위가 크므로 바운더리 설정_ 100:0-99
		System.out.println(num); 
		
		//Q1) 50보다 작은 임의의 수 생성하기
		//Q2) 100보다는 크고 1000보다 작은 임의의 수 생성하기
		
		int q1 = r.nextInt(45) + 5;
		System.out.println(q1);
		
		int q2 = r.nextInt(900) + 100; // nextInt 뒤에 값을 더하면 최소값이 된다. -값도 마찬가지 		
		System.out.println(q2);
		
	}

}
