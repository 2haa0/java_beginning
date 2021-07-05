package 문제풀이;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 극장예약시스템 {

	public static void main(String[] args) {
		int[] s = {1,2,3,4,5,6,7,8,9,10};
		// 프린트할 좌석번호를 용이하게 미리 배열선언
		int[] s2 = new int[10];
		// 예약확인할 좌석 번호
		Scanner sc = new Scanner(System.in);
		//배열이나 new는 반복문 밖으로 빼준다.
		int count = 0;
		// 예매된 총 좌석의 수 
		final int MONEY = 10000; //final은 변경 불가능, 대문자로 표기하고 상수를 나타냄.
		// 예매 비용을 계산하기 위한 상수값.
		while(true) {
		System.out.println("---------------------");
		for (int j = 0; j < s.length; j++) {
			// 좌석번호 출력
		System.out.print(s[j] + " ");
		}
		System.out.println();
		System.out.println("---------------------");
		
		for (int i = 0; i < s.length; i++) {
			System.out.print(s2[i] + " ");
		}
		System.out.println();
		System.out.print("원하시는 좌석번호를 입력하세요(종료는 -1)>> ");
		int sn = sc.nextInt();
		// 콘솔에 입력 받은 값을 정수로 sn에 저장한다.
		
		if(sn == -1) {
			System.out.println("예약 시스템을 종료합니다.");
			int total = (count * MONEY);
			// 전체 예매좌석수와 비용을 곱해 총 계산값을 도출
			break;
			// 콘솔 입력값이 -1일 경우 while문 종료
			
		}
		
		if(s2[sn-1] == 0) { 
		s2[sn-1] = 1; 
		// 초기화된 s2를 1로 변경
		System.out.println(sn + "번 예약 완료");
		count++;
		// 예매 완료되면 전체 예매좌석수에 1을 증가한다.
		
		} else {
			// 좌석이 중복 선택된 경우 재선택
			System.out.println();
			System.out.println("이미 예약된 자리입니다. ");
			System.out.println("다른 자리를 예매해주세요. ");
		}
		
		
		}//무한반복 종료
		
		
		System.out.println("10개 좌석 중 " + count + "개의 좌석이 예약 완료되었습니다.");
		sc.close();
		// scanner를 닫는다.
		
		int count2 = 0;
		String sum = "";
		for (int i = 0; i < s2.length; i++) {
			if(s2[i] == 1) {
				sum = sum + (i+1) + "번 ";
				/*          =        +1번
				 * 1번      =        +4번
				 * 1번 4번   =        +8번 
				 */
				count2++;
			}
		}
		System.out.println(sum + "자리예매");
		System.out.println("총 " + count2 + "개의 좌석");
	
		
	}
}
