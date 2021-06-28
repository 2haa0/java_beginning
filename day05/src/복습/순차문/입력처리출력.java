package 복습.순차문;

import javax.swing.JOptionPane;

public class 입력처리출력 {

	
	//main + ctrl + spacebar
	public static void main(String[] args) {
		/* 1. 입력: 손으로 타이핑하는 것 뿐 아니라 인터넷에서 크롤링해서 가져오는 것도 입력이 되는 것.*/
		String hobby = JOptionPane.showInputDialog("당신의 취미는?");
		String when = JOptionPane.showInputDialog("언제하시나요??");
		String time = JOptionPane.showInputDialog("몇 시간이나 하시나요?");
		/*int는 방 4개짜리, boolean은 방 1개, char 는 방 2개짜리, double은 방 8개,
		 *String과 같이 기본형이 아닌 애들은 모두 방 4개
		 *여기서 문자열 hobby의 경우 RAM자체에 있는 메모리가 아니라 RAM에 있는 문자를 찿아가는 위치의 '주소'가 들어있는 메모리*/
		
		 
		/* 2. 처리: CPU는 이때 문자열 변수의 자리를 확보하고 변수들을 계산하고 결과를 할당하는 순서로 열일 중 ╰(*°▽°*)╯ */
		String result = when + "에" + hobby + "을 하시는군요!";
		int time2 = Integer.parseInt(time);
		/*String을 비교할 때는 int로 변환해주어야 한다. 기본형은 캐스팅 할 수 있지만 String은 캐스팅 할 수 없으므로 부품을 사용해줘야한다.
		 *이때 CPU에서 일한거니까 RAM에 변수로 저장해준다.*/
		if (time2 >= 3) { //비교연산자의 결과는 항상 boolean(논리데이터,true/false)
			//조건이 true일 때 실행되는 부분
			JOptionPane.showMessageDialog(null, "아주 많이 하셨군요.");
			
		} else { 
			//조건이 false일 때 실행되는 부분
			JOptionPane.showMessageDialog(null, "보통으로 하셨군요.");
		}
		
		
		
		/* 3. 출력: 파일로 내보낼 것인지, 모니터에 출력을 할 것인지 등등 */
		JOptionPane.showMessageDialog(null, result);
		/* 여기서 null도 입력값이라고 한다. 함수는 항상 소괄호가 존재한다.
		 * java는 , 가 하나로 디폴트되어 있으면 딱 두 개의 입력만 받는다.(분명한 언어ㅋㅋ)
		 * 어떤 명령어는 저장할 수도 있고 어떤 언어는 저장할 수 없다. (이때 판별 기준은 void_명령 실행 후 가져올 값이 없다.) 
		 */
		

	}

}
