package 순차문;
/* 숫자1입력:333
 * 숫자2입력:222
 * 
 * 두 숫자를 정수로 변환해서
 * 
 * 더하기의 결과 출력
 * 빼기의 결과출력
 */

import javax.swing.JOptionPane;

public class 순차문4 {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");
		//DB연결해주는 부품 필요: mySQL, 오라클등
		
		String id2 = "root"; // 회원가입시 가입한 id
		String pw2 = "pass"; // 회원가입시 가입한 pw
		// id2와 pw2가 DB라고 치고
		System.out.println(id.equals(id2));
		System.out.println(pw.equals(pw2));
		 /* 기본형 데이터가 아니면 연산자로 비교할 수 없다.
		  * 때문에 문자열을 비교해야할 땐 String 변수 뒤에 .을 찍어서 부품을 찾아 연산자 대신 사용. 
		  * 또한 비교코드는 결과가 True 혹은 False. */
		
		System.out.println(id.equals(id2) && pw.equals(pw2));
		// and 조건 부여
		
 		 /* and 연산자인 경우, 주요 확인 변수를 처음에 삽입.
		 첫 비교의 결과가 False이면 이후 비교연산은 실행되지 않는다. */
		if (id.equals(id2) && pw.equals(pw2)) {
			JOptionPane.showMessageDialog(null, "로그인 성공");
			//조건이 true일때
		} else {
			JOptionPane.showMessageDialog(null, "로그인 실패");
			//조건이 false일때

		}

	}

}
