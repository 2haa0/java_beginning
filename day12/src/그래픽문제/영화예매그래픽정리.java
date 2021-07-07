package 그래픽문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

// 손코드로 정리 할 것
// 지역변수와 전역변수

public class 영화예매그래픽정리 {

	public static void main(String[] args) { 
		JFrame f = new JFrame(); //윈도우 생성
		f.setSize(560, 750); //윈도우 사이즈 설정 가로 560, 세로 750
		int[] seat = new int[200]; // 좌석은 정수배열 200개 
		FlowLayout flow = new FlowLayout(); //윈도우에 버튼 띄우기 위해
		f.setLayout(flow); //윈도우에 띄우기 실행
		
		for (int i = 0; i < 200; i++) {
			JButton b1 = new JButton(i + "");
			b1.addActionListener(new ActionListener() { // b1을 클릭했을 때 액션 발생
				@Override
				public void actionPerformed(ActionEvent e) { // 액션 수행 버튼 값이 e에 저장
					String evt1 = e.getActionCommand(); // 수행 버튼의 값을 문자열로 저장
					int seatIndex = Integer.parseInt(evt1); // 문자열로 저장된 버튼값을 정수로 저장
					seat[seatIndex] = 1; // 버튼이 선택되면 같은 값의 인덱스를 가진 배열의 값을 0->1로 변경 
					
					JOptionPane.showMessageDialog(f, seatIndex + "번이 예약되었습니다.");
					
					b1.setEnabled(false); // 버튼에 액션이 수행되면 비활성화 시킨다.
					b1.setBackground(Color.red); // 버튼에 액션이 수행되면 해당 버튼의 배경색을 빨간색으로 바꿔준다. 
				}
			});
			f.add(b1); // 반복문으로 만들어진 200개의 버튼을 윈도우에 띄움
		}
		
		
		JButton b2 = new JButton(" 결제 "); //결제하기 버튼 생성
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			int count = 0; //지역변수 
			String seat2 = "";
			final int MONEY = 10000; //부동 변수는 대문자로 표기
			for (int i = 0; i < seat.length; i++) {
				if (seat[i] == 1) {
					count++; // 비활성 버튼의 개수만큼 누적된다.
					seat2 = seat2 + String.valueOf(i) + "번 "; // 선택 좌석 누적
				}
			}
			int payment = count * MONEY; // 총 좌석개수 * 만원
			
			JOptionPane.showMessageDialog(f, "예매된 좌석은 " + seat2 + "입니다. ");
			JOptionPane.showMessageDialog(f, "당신이 결제할 금액은 " + payment + "원 입니다.");
			}
		});
		
		b2.setBackground(Color.yellow); //결제하기 버튼의 배경은 노란색
		f.add(b2);
		
		f.setVisible(true); 
	}
}
