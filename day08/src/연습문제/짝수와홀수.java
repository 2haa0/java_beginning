package 연습문제;

public class 짝수와홀수 {

	public static void main(String[] args) {
		
		int evenSum = 0;
		int oddSum = 0;
		
		//for문을 이용하여 반복합계 연산
		
		for (int i = 1; i <=100; i++) {
			if ((i % 2)  == 1) {
				oddSum = oddSum + i;
				
			} else {
				evenSum = evenSum + i;
			}
			
		}
		
		System.out.println("짝수의 합계는 " + evenSum);
		System.out.println("홀수의 합계는 " + oddSum);

	}

}
