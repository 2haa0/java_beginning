package 누적연습;

import java.util.Scanner;

public class 콘솔입력스캐너3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("과목을 입력(자바, c++, python>> ");
		String data = sc.next();

		if (data.equals("자바")) { // data의 값이 "자바"와 같다면
			System.out.println("JSP점프@@");
			//jsp는 인터넷 사이트 만들 때 사용하는 java library
			
		} else if(data.equals("c++")){
			System.out.println("ASP@@");
			//ASP(C#)

		} else {
			System.out.println("python으로 점프@@");
			
		}
		
		switch (data) {
		case "자바":
			System.out.println("JSP점프@@");
			break;
		case "c++":
			System.out.println("ASP점프@@");
			break;

		default:
			System.out.println("python으로 점프@@");
			break;
		}
		
		

	}

}
