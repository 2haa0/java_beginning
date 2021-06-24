package 복습;
// 문제1 오늘을 나타내는 정보를 기본데이터를 이용해서 저장하고 출력해보세요.
//      오늘 온도를 하나 넣어주세요. 26.2
//      어제 온도와 오늘 온도가 동일한지 프린트 (어제 온도 27.5)
//      어제 온도보다 오늘 온도가 높은지도 프린드

public class 복습1 {

	public static void main(String[] args) {
		
		int classNo = 8; //4바이트
		double temTd = 26.2; //8바이트
		char day = '목'; //2바이트
		boolean food = false; //1바이트
		String lunch = "1층 가서 생각해보자."; //22바이트+ 주소는 4배수이므로 String 쓰면 대용량
		
		System.out.println("오늘 온도: " + temTd + "도");
		System.out.println("오늘 수업 수: " + classNo);
		System.out.println("오늘 요일: " + day);
		System.out.println("오늘 아침 식사 유무: " + food);
		System.out.println("점심 어떻게 하지? " + lunch);
		
		double temYstd = 27.5;
		
		System.out.println( temTd == temYstd );
		System.out.println( temTd > temYstd );
		
		// 오늘 온도 29.2로 변경하여, 어제의 온도보다 낮은지 비교
		
		temTd = 29.2;
		
		System.out.println( temTd < temYstd);
		
		
		
	}

}
 