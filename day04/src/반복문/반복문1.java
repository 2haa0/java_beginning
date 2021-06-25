package 반복문;

import javax.swing.JOptionPane;

// 반복은 1.무한(while의 condition이 true 일 때)   2.유한(for문)
public class 반복문1 {

	public static void main(String[] args) {
		while (true) { //무한루프
			System.out.println("나는 계속 돌아요.!!");
			String q = JOptionPane.showInputDialog("중단하실래요? no or yes");
			if (q.equals("yes")) {
				break;//반복문을 종료
				// System.exit(0); : 컴퓨터를 종료, break와 동시에 사용 불가
			}
			
		}

	}

}
