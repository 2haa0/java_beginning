package 문제풀이;

public class 정리문제 {

	public static void main(String[] args) {
		String food = "떡볶이";
		
		switch (food) {
		case "떡볶이":
			System.out.println("분식점으로~~~~");
			break;
		
		case "우동":	
			System.out.println("일식집으로~~~~");
			break;
			
		case "자장면":	
			System.out.println("중국집으로~~~~");
			break;	

		default:
			System.out.println("집에서 먹을랭");
			break;
		}
		
		String sn = "980201-1037514"; 
		// 144처럼 백사십사로 읽는건 자리수가 있는 수. 주민등록번호는 자릿수가 없는 수는 문자열처리
		char gender = sn.charAt(7);  // 설정값은 index로 _ 7번째 자리에 있는 1을 가져온다.
		// r을 뺀 모든 언어는 0부터 시작하므로 성별을 나타내는 숫자는 7번에 위치한다.
		
		switch (gender) {
		case '1': //char니까 따옴표 꼭
		case '3':
			System.out.println("남자");
			break;
			
		case '2': //char니까 따옴표 꼭
		case '4':
			System.out.println("여자");
			break;

		default:
			System.out.println("외계인");
			break;
		}
		
		
		if (gender == '1' || gender == '3') {
			System.out.println("남자");
			
		}else if(gender == '2' || gender == '4') {
			System.out.println("여자");
 
		}else {
			System.out.println("외계인");

		}
			
	}
	
}
