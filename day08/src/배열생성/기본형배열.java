package 배열생성;

import javax.swing.JOptionPane;

public class 기본형배열 {

	public static void main(String[] args) { //ststic이 붙어있는 함수에는 뭐 많이 집어넣지 말기~~
		int[] s1 = new int[10]; //[]는 배열을 나타낸다.
		double[] s2 =  new double[5]; // double로 만들어진 배열을 가르키는 주소가 변수명에 들어간다.
		boolean[] s3 = new boolean[100];
		String[] s4 = new String[100];
		
		System.out.println(s1); //s1의 주소
		System.out.println(s2); //s2의 주소
		System.out.println(s3); //s3의 주소
		System.out.println(s4); //s4의 주소
		
		System.out.println(s1[0]); //s1의 첫번째 인덱스값
		System.out.println(s3[0]); //s3의 첫번째 인덱스값
		
		/* 배열은 자동으로 초기화를 시켜준다.
		 * int 0, String null 등 */
	
		double a = 3.141562;
		int b = (int)
		System.out.println(b);
	}

}
