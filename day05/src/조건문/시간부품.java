package 조건문;

import java.util.Date; // util 안에 있는 date 이용_날짜, 요일, 시, 분, 초

public class 시간부품 {

	public static void main(String[] args) {
		// Date_25년 된 class
		Date date = new Date();
		//입력값 받아 올 때만 문자열이고 다른 class는 알아서 기본데이터로 가져옴. 
		
		int hour = date.getHours(); // 취소선 무시
		int min = date.getMinutes();
		int sec = date.getSeconds();
		
		System.out.println(hour + "시 " + min + "분 " + sec + "초");
		
		int year = date.getYear() + 1900; // 오래된 코드이기 때문에 +1900해서
		int month = date.getMonth() + 1; // 음력기준이기 때문에 +1
		int today = date.getDate();
		
		System.out.println(year + "년 " + month + "월 " + today + "일" );
		
		int day = date.getDay(); // 일요일(주일)이 0
		System.out.println(day);
		if (day == 0) {
			System.out.println("일요일");
		}else if ( day ==1 ) {
			System.out.println("월요일");
		}else if ( day ==2 ) {
			System.out.println("화요일");
		}else if ( day ==3 ) {
			System.out.println("수요일");
		}else if ( day ==4 ) {
			System.out.println("목요일");
		}else if ( day ==5 ) {
			System.out.println("금요일");
		}else {
			System.out.println("토요일");
		}
	
	}

}
