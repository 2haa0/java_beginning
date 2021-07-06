package 배열응용;

import java.util.Date;
import java.util.Scanner;

public class 스트링을배열로 {

	public static void main(String[] args) {
		String s = "감자,고구마,양파";
		String[] s2 = s.split(","); //{"감자", "고구마", "양파"}
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		System.out.println(s2[2]);
		System.out.println(s2.length);
		
		System.out.println(s2[0].equals(s2[1]));
		
		
		//일,월,화 날씨를 순서대로 입력해보세요.
		//흐림이 몇 개인지, 맑음이 몇 개인지 세어보세요.
		//1. sc.next()로 받아서
		//2. 스트링을 배열로 변환해서 넣으세요
		//3. count해보세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("일,월,화날씨를 순서대로 입력해보세요. --");
		String wth = sc.next(); //"흐림,맑음,흐림"
		
		String[] wth2 = wth.split(",");
		int count1 = 0, count2 = 0;
		for (int i = 0; i < wth2.length; i++) {
			if (wth2[i].equals("흐림") {
				count++;
				
			} else {
			}
		}
		
		
		
		
		

	}

}
