package 문제풀이;

public class 기본데이터2 {

	public static void main(String[] args) {
		
		//1.선언
		char color; 
		int room; //대소비교나 계산유무에 따라서 char 혹은 int로 유형선언
		double avgAge;
		// class, char 등의 예약어는 저장공간의 이름으로 사용 불가
		
		//2.대입
		color = 'r'; // 2바이트
		room = 709;
		avgAge = 27.5; // 카멜표기법(낙타 혹같음), avg_age처럼 언더바쓰는 방식은 스네이크표기법으로 파이썬에서 주로쓰임
		// 변수(variable, 값이 변한다.): 램에 저장공간에 들어갈 값은 변할 수 있다.
		// 램에 만들어지는 저장공간을 변수라고 부른다.
		// 변수 하나에는 하나만 저장되므로 값이 대입되면 이전 변수는 삭제됨.
		
		//3.출력
		System.out.println("색: " + color);
		System.out.println("호실: " + room + "호");
		System.out.println("평균나이: " + avgAge);
        // 단축키: 한 줄 복사: ctrl + alt + 아래화살표
		// 단축키: 한 줄 이동: alt + 아래화살표
		// 단축키: 한 줄 삭제: ctrl + d
		
	}

}
