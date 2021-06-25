package 문제풀이;
/* 내가 먹고 싶음 음식은? 팥빙수
 * 친구가 먹고 싶은 음식은? 팥빙수
 * 아하! 나랑 친구랑 같아요!
 * 크~! 나랑 친구랑 달라요.
 */

import javax.swing.JOptionPane;
/* String, System 등은 왜 import가 붙지 않을까?
 * A) 기본적이고 빈번히 쓰이므로 import java.lang.*; 는 함께 실행되어 보이기 생략된다. 
 *    또한 java.lang과 같은 동명의 패키지를 내 임의로 생성시 프로그램이 내 임의의 파일을 우선적으로 실행하므로
 *    import 코드입력 없이는 String이나 System이 실행되지 않는다. */

public class 순차문5 {

	public static void main(String[] args) {
		String myFood = JOptionPane.showInputDialog("내가 먹고 싶은 음식은?");
		String frdFood = JOptionPane.showInputDialog("친구가 먹고 싶은 음식은?");
		
		
		if (myFood.equals(frdFood)) {
			System.out.println("아하! 나랑 친구랑 같아요!");
			System.out.println("우리는 " + myFood + "가 먹고 싶어요.");
		} else {
			System.out.println("크~! 나랑 친구랑 달라요!");
			System.out.println("나는 " + myFood + ", 친구는 " + frdFood + "가 먹고 싶어요.");

		}
		

	}

}
