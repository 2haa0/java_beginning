package 문제풀이;

import javax.swing.JOptionPane;

/* 게임을 계속하시겠습니까? (0:계속, 1:종료)
 * 무한루프 사용
 * 첫번째 사람 숫자를 입력: 20
 * 두번째 사람 숫자를 입력: 10
 * 첫번째 시람 승! // 더 큰 숫자를 낸사람이 승리! 
 * 종료면 게임을 stop! */
public class 무한루프문제 {

	public static void main(String[] args) {
		while (true) { // 무한루프
			String fst = JOptionPane.showInputDialog("첫번째 사람은 몇 번이에요?");
			String snd = JOptionPane.showInputDialog("두번째 사람은 몇 번이에요?");
			// 문자열을 두 번 입력 받는다. 
			
			int fstI = Integer.parseInt(fst);
			int sndI = Integer.parseInt(snd);
			// 15,16번 줄에서 입력받은 문자열을 정수로 변환하여 RAM에 저장한다. 
			
			if (fstI > sndI) {
				JOptionPane.showMessageDialog(null, "첫번째 사람 승!");
				// RAM에 저장된 변수 중 첫번째 입력값이 클 때 출력되는 메세지 팝업
			    
			} else if(sndI > fstI) {
				JOptionPane.showMessageDialog(null, "두번째 사람 승!");
				// RAM에 저장된 변수 중 두번째 입력값이 클 때 출력되는 메세지 팝업
				
			}
			else {
				JOptionPane.showMessageDialog(null, "무승부");
				// RAM에 저장된 변수가 같을 때 출력되는 메세지 팝업

			} // if문 종료
			
			// 대소비교 후 반복문의 계속 진행 여부
			String data = JOptionPane.showInputDialog("게임을 계속 하시겠습니까? 계속: 0 종료:1");
			int data2 = Integer.parseInt(data); // 39번 줄에서 입력받은 문자열이 정수인지 판단하고 변환  
			if (data2 == 1) { // RAM에 저장된 입력값이 1이라면
				JOptionPane.showMessageDialog(null, "게임을 중지하겠습니다."); // 모니터 중앙에 팝업
				break; // while 종료
			} else { // 입력값이 1이 아니라면
				JOptionPane.showMessageDialog(null, "게임을 계속하겠습니다.");
				// 메세지창 출력 후 if 문에서 빠져나와 반복문 재실행
			}
			
		}

	}

}
