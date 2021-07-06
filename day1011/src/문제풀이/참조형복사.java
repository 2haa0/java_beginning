package 문제풀이;

public class 참조형복사 {

	public static void main(String[] args) {
		// 변수에 들어있는 주소를 복사
		int[] x = {1,2,3};
		//int[] y = x; //참조형 복사(얕은 복사: 주소만 복사한다.)
		int[] y = x.clone(); //참조형 복사(깊은 복사: 주소가 가르키는 값들의 목록을 복사)
		
		System.out.print("x: ");
		for (int i : y) {
			System.out.print(i + " ");
		}
		
		System.out.print("\ny: ");
		for (int i : y) {
			System.out.print(i + " ");
		}
		
	
		System.out.print("\n==원본 x값 수정후==");
		
		x[0] = 9;
		
		
		System.out.print("\nx: ");
		for (int i : y) {
			System.out.print(i + " ");
		}
		
		System.out.print("\ny: ");
		for (int i : y) {
			System.out.print(i + " ");
		}
		

	}

}
