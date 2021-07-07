package 그래픽문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화예매그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame("영화예매그래픽 버전");
		f.setSize(560, 750);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		int[] seat = new int[200]; //{0,0,0,...,0}

		for (int i = 0; i < 200; i++) {
			JButton b = new JButton(i + ""); 
			// JButton 안에는 문자열만 들어가야하므로 숫자 0은 입력 할 수 있다.
			// int를 string로 바꾸려면 String.valueOf(0);
			b.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					/* 버튼을 클릭했을 때 도대체 누구 때문에 버튼이 실행되는지에 대한 정보가
					 * e에 저장된다.
					 */
					System.out.println(e.getActionCommand()); //겟액션코맨드로 확인
					String s = e.getActionCommand();
					int index = Integer.parseInt(s); //배열의 index자리에는 정수만 올 수 있으므로
					seat[index] = 1; 
					
					JOptionPane.showMessageDialog(f, index + "번 예약됨.");
					//버튼을 비활성화
					b.setEnabled(false);
					b.setBackground(Color.red);
					
				}
			});
			f.add(b);
		}
		
		/* 과제) 결제하기 버튼을 누르면
		 * 1)배열안에 1이 몇개인지 세서 _ int count 필요
		 * 2)금액 10000원씩 계산 후에
		 * 3)총 결제 금액 알려주세요.
		 * 4)몇 번 좌석을 예매했는지 출력
		 */

		JButton b2 = new JButton("<<<<<< 결제하기 >>>>>>");
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			int count = 0; 
			/* count는 액션퍼폼드 밖의 메서드에서는 활용 할 수 없다.
			 * 스태틱 변수만 가능
			 */
			String seat2 = "";
			final int MONEY = 10000; //부동 변수는 대문자로 표기
			for (int i = 0; i < seat.length; i++) {
				if (seat[i] == 1) {
					count++;
					seat2 = seat2 + String.valueOf(i) + "번 ";
				}
			}
			int payment = count * MONEY;
			JOptionPane.showMessageDialog(f, "당신이 결제할 금액은 " + payment + "원 입니다.");
			JOptionPane.showMessageDialog(f, "예매된 좌석은 " + seat2 + "입니다. ");
			}
		});
		b2.setBackground(Color.yellow);
		f.add(b2);
		

		f.setVisible(true);
	}

}
