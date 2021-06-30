package 누적연습;

import javax.swing.JOptionPane;

public class 인기투표1 {

	public static void main(String[] args) {
		int yes = 0, no = 0; // yes와 no 모두 정수이기 때문에 함께 묶어서 유형선언을 할 수 있다.
		
		for (int i = 0; i < 10; i++) {
			String ayh = JOptionPane.showInputDialog("배고파요? (배고프면 1, 배고프지 않으면 2");
			
			switch (ayh) {
			case "1":
				yes++;
				break;

			case "2":
				no++;
				break;
				
			default: //"1"이 아니라 "1번"이 오는 경우도 있기 때문에 추출을 통해서 비슷한 case도 인정, 혹은 case를 아예 벗어난 경우
				JOptionPane.showMessageDialog(null, "1이나 2만 하랬잖아요.");
				i--; //10개의 값이 필요하므로 무효표는 셈이 되지 않도록 횟수를 복구한다.
				break; // 다시 11번줄로 올라간다.
			}
			
		}
		System.out.println("배고픈 사람은 " + yes + "명 배고프지 않은 사람은 " + no + "명");

	}

}
