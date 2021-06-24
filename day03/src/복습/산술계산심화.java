package 복습;

public class 산술계산심화 {

	public static void main(String[] args) {
		int x = 111;
		int y = 222;
		
		System.out.println("두 수의 합은:" + (x + y));
		System.out.println("두 수의 나누기는:" + (x / y)); // 몫만 출력됨.

		// int sum = 333;
		int sum = x + y;
		int avg1 = sum/2;
		
		System.out.println("평균은: " + avg1); //시 결과는 166이 나온다.
		
		double avg2 = sum / 2.0;
		System.out.println("평균은: " + avg2); //시 결과는 166.5이 나온다.
		
		int count =2;
		avg2 = sum / (double)count; 
		// at CPU. 이때 RAM에 저장하지 않고 CPU에서만 count를 임시로 실수로 변경해서 계산. 
		//    : '캐스팅(강제형변환)'_ CPU가 원래 데이터의 타입을 다른 타입으로 강제 변환.
		// 계산하는 변수 중 하나만 실수여도 결과값이 실수.
		
		
	}

}
