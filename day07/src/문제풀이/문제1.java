package 문제풀이;
//문제1: 33~222 모두 더해주세요
//문제2: 55~4500까지 2씩 점프하면서 더해주세요
//문제3: 0~6000, 5씩 점프하면서 더해주세요.

public class 문제1 {

	public static void main(String[] args) {
		//문제1
		int a1 = 0;
		for (int i = 33; i <= 222; i++) { // i++ : i = i + 1
			a1 = a1 + i;
			
		}
		System.out.println("33부터 222까지의 합은 " + a1);
		
		//문제2
		
		a1 = 0;
		for (int i = 55; i <= 4500; i = i+2 ) {
			a1 = a1 + i;
			
		}
		System.out.println("55부터 4500까지 2씩 점프하며 더한 값은 " + a1);
		
		//문제3
		a1 = 0;
		for (int i = 0; i <= 6000; i = i+5) {
			a1 = a1 + i;
			
		}
		System.out.println("0부터 6000까지 5씩 점프하며 더한 값은 " + a1);
	}

}

//이렇게 a1 변수 하나를 계속 초기화해서 사용하면 이후 코드가 복잡해질 때 엉키므로 변수는 입력과 출력을 따로 쓰는게 좋다.