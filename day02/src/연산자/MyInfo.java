package 연산자;

public class MyInfo {

	public static void main(String[] args) {
		// 나에 대한 정보
		// 내이름, 내나이, 내키, 성별, 점심식사유무
		
		String name = "홍길동"; //String(문자열)은 char를 실처럼 엮어주는 부품이므로 대문자로 시작
		int age = 100;
		double weight = 99.9;
		char gender = 'c';
		boolean food = true; // true or false, 부울렌이라고 읽음.
		
		System.out.println(name);
		System.out.println(weight);
		System.out.println(age + 1);
		
		//현재 weight는 99.9
		
		weight = weight - 10;
		//현재 weight는 89.9
		
		
	}

}
