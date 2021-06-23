package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		//산술연산자: 사칙연산자(+,-,*(아스테르크),/,%(나머지))
		
		int x = 100;
		int y = 200;
		
		System.out.println("두 수의 합은: " + (x + y));
		// "두 수의 합은: "이 이미 string이 되어 괄호 처리 해야함.
		System.out.println("두 수의 차는: " + (x - y));
		System.out.println("두 수의 곱은: " + (x * y));
		// 
		System.out.println("두 수의 나눗셈은: " + (x / y));
		System.out.println("두 수의 나머지는: " + (x % y));
		
	}

}
