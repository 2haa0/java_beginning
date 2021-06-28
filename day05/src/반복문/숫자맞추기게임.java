package 반복문;
/* 1. 입력을 받아라.
 * 2. 숫자로 변환처리해라.
 * 3. 정답인지 확인.
 * 4. 정답이면, 프로그램 종료
 *    정답이 아니면, 1로 가라! */

import java.util.Random;

import javax.swing.JOptionPane;

public class 숫자맞추기게임 {

	public static void main(String[] args) {
		Random r = new Random(4); // 4: 씨앗값
		int target = r.nextInt(100);
		int i = 0;
		
		while (i <= 0) {

			
			String in = JOptionPane.showInputDialog("어떤 숫자게요ㅎㅎ");
			int inI = Integer.parseInt(in);
			
			if ( inI == target ) {
				System.out.println("맞췄어요!");
				i++;
				/* while의 조건에 'true'라고 기입하고 
				 * break;_while문 깨기 혹은 System.exit(0);_프로그램 나오기로 반복문을 중지 할 수 있다. */
			} else {
				if (inI > target) {
					JOptionPane.showMessageDialog(null, "바보ㅋ 큰대요?");					
					
				} else {
					JOptionPane.showMessageDialog(null, "바보ㅎ 작은대요?");					

				}
				
			}

		}
		System.out.println("게임이 모두 종료되었습니다.");
		
	}

}
