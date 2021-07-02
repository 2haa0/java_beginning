package 배열사용;

public class 배열복습 {

	public static void main(String[] args) {
		/*
		 * 배열을 선언 할 때 값을 처음부터 알고 있는 경우와 모르고 있는 경우가 있다.
		 */

		//1. 값을 알고 있는 경우
		int[] num1 = { 100, 200, 300 }; //총 변수가 5개 생성되며 배열:16 + 참조형:8 = 총 24바이트가 잡혀 있음.
		num1[1] = 500;
		System.out.print("num1을 출력: ");
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + " ");
		}
		System.out.println();
		for (int i : num1) { //여기서 i는 인덱스가 아니라 "num1을 int로 가져올거야."라는 말.
			System.out.print(i + " ");
			//for each는 출력용이며 값을 대입할 수 없다.
		}
		
		//2. 값을 나중에 넣은 경우
		System.out.println();
		System.out.println("num2를 출력: ");
		int[] num2 = new int[3]; // {0,0,0}으로 자동 초기화!
		num2[0] = 1000;
		num2[num2.length-1] = 1000;
		for (int i : num2) {
			System.out.print(i + " ");
		}
		
		
		

	}

}
