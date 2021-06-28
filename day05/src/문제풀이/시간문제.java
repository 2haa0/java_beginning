package 문제풀이;
/* Q1) 시간을 구해보세요.
 * 10시전이면 굿모닝, 15시 전이면 굿애프터눈, 20시 전이면 굿이브닝, 나머지는 굿나잇 */

import java.util.Date;

/* Q2) 요일이 토/일이면 쉬어요. 
 * 이외의 요일이면 달려요. */

/* Q3) 월이 3-5이면 봄, 6-8이면 여름, 9-11이면 가을, 이외에는 겨울 */

public class 시간문제 {

	public static void main(String[] args) {

		Date date = new Date();

		// Q1
		int hour = date.getHours();

		if (hour < 10) {
			System.out.println("굿모닝");
		} else if (hour < 15) {
			System.out.println("굿애프터눈");
		} else if (hour < 20) {
			System.out.println("굿이브닝");
		} else {
			System.out.println("굿나잇");
		}

		// Q2
		int day = date.getDay();

		if (day == 0 || day == 6) {
			System.out.println("쉬어요.");
		} else {
			System.out.println("달려요.");
		}

		// Q3
		int month = date.getMonth() + 1;

		if (month >= 3 && month <= 5) {
			System.out.println("봄");

		} else if (month >= 6 && month <= 8) {
			System.out.println("여름");

		} else if (month >= 9 && month <= 11) {
			System.out.println("가을");

		} else {
			System.out.println("겨울");
		}

	}

}
