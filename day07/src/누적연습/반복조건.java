package 누적연습;

public class 반복조건 {

	public static void main(String[] args) {
		int sum1 = 0;
		for (int i = 1; i <= 10 ; i++) {
			//이 안에서 3의 배수만 더하기_나머지 연산자 사용
			if (i % 3 == 0) { //==: 비교연산자
				sum1 = sum1 + i;
			} 
		}
		System.out.println("1부터 10까지 중 3의 배수인 수만 더하면 " + sum1);
		System.out.println("-----");
		
		
		int sum2 = 0;
		for (int i = 1; i <= 10 ; i++) {
			//이 안에서 3의 배수만 더하기_나머지 연산자 사용
			if (i % 3 == 0) { //==: 비교연산자
			} else {
				sum2 = sum2 + i;
			}
			/* = if (i % 3 == 0) { 
				 	continue;    
				 	//continue: 반복문을 계속 하라는 의미. 조건에 맞는 경우 if문 밖의 코드진행. 제외의 의미 
				 } 
				 sum2 = sum2 + i;
				 */
			if (sum2 > 20) {
				System.out.println("");
				break;
			}
			
		}
		System.out.println("1부터 10까지 중 3의 배수인 수만 빼고 더하면 " + sum2);

	}

}
