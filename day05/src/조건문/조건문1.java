package 조건문;

public class 조건문1 {

	public static void main(String[] args) {
		//1. 입력
		int jumsu = 66;
		
		//2. 처리
		String result = null; 
		/* 선언: type + name _ 램에 4바이트의 공간이 할당되며 쓰레기값을 비우는 초기화시켜준다.(initialise)
		 * 쓰레기값은 프린트도 안되고 연산도 불가능하다. */
		if (jumsu >= 90) {
			result = "A학점";
			
		}else if (jumsu >= 80) {
			result = "B학점";
			
		}else if (jumsu >= 70) { 
			result = "C학점";
		}else {
			result = "F학점";
		}
		
		//3. 출력
		System.out.println("당신의 학점은 " + result);
		

	}

}
