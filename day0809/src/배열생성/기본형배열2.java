package 배열생성;

public class 기본형배열2 {

	public static void main(String[] args) {
		int[] s = new int[10];
		/* int[] : 주소가 가르키는 타입이 정수
		 * s : heap 영역에 할당된 배열의 목록 배열 저장공간의 주소
		 * = : heap 영역에 만들어진 배열에 주소를 할당
		 * new : 배열을 생성한다.
		 * int[10] : 정수타입의 변수를 연속으로 10개 설정 */
		// 1 -> 3 -> 2 순서로 CPU 열일
		
		System.out.println(s.length); //s의 int영역
		for (int i = 0; i < s.length; i++) { //index의 역할
			System.out.print(i + ":" + s[i] + " "); //변수가 자동초기화 되어있다.
		}
		System.out.println();
		for (int i = 0; i < s.length; i++) {
			s[i] = i ;
		}
		for (int i = 0; i < s.length; i++) { //index의 역할
			System.out.print(i + ":" + (s[i] + 1) + " "); //변수가 자동초기화 되어있다.
		}
		
	}

}
