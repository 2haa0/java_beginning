package 누적연습;

import java.util.Scanner;
//import java.util.*; : util 파일의 모든 class 가져오지만 util의 하위 패키지는 쓸 수 없다. 
//import java.util.a.*; : 위에서 *하면 이처럼 쓸 수 없고 java.util.a.Test처럼 하위 패키지 -질문하기  


public class 콘손입력스캐너 {
	//scanner는 입력 / 입력은 인터넷에서 크롤링, 콘솔에서 키보드, 파일로 등등 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // System.in: 키보드로 입력받음
		System.out.print("당신의 이름을 입력하시오 ☞ ");
		String name = sc.next(); //String으로 입력받아 저장, 입력된 공백 뒤로는 버림.
		System.out.println("당신의 이름은 " + name);
		
		
		System.out.print("당신의 소속을 입력하시오 ☞ ");
		String a = sc.next(); //공백을 포함한 문장을 저장하려면(컴퓨터에서 문장은 엔터로 구분한다.) nestline
		System.out.println("당신의 소속은 " + a);

	}

}
