package 데이터;

public class 기본데이터 {

	public static void main(String[] args) {
		// 컴퓨터에서 다루는 기본데이터 종류
		
		// 문자(한 글자)
		char gender; 
		// 선언 ( 자바는 선언할 때 데이터의 유형이 결정된다. 파이썬은 노상관) : 저장공간에 들어갈 데이터의 유형 + 저장공간의 이름
		
		// 숫자(정수)
		int age;
		
		// 숫자(실수)
		double temp;
		
		// = : 대입, 할당 ( 저장공간에 값을 대입 )
		gender = '남';
		age = 100;
		temp = 25.5;
		
		// 출력
		System.out.println("성별: " + gender);
		System.out.println("나이: " + age);
		System.out.println("온도: " + temp);
		// + : 결합연산자
		
	}

}
