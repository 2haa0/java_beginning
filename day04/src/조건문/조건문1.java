package 조건문;

public class 조건문1 {

	public static void main(String[] args) {
		// 1. 입력
		int jumsu = 77;
		
		// 2. 처리: 학점부여
		String result = null;
		/* 선 유형 선언시 초기값을 부여한다. 
		 * 정수의 경우 0, 실수의 경우 0.0, 
		 * 문자열(기본형X)의 경우 null */
		if (jumsu >= 90) {
			result = "A학점";			
		}else if (jumsu >= 80) {
			result = "B학점";
		}else if (jumsu >= 70) {
			result = "C학점";
		}else {
			result = "D학점";
		}
		
		
		// 3. 출력
		System.out.println(result);

	}

}
