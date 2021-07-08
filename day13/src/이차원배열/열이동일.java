package 이차원배열;

public class 열이동일 {

	public static void main(String[] args) {
		int[][] n2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } }; //3*4인 2차원 배열
		for (int i = 0; i < n2.length; i++) {
			System.out.print((i + 1) + "행 : ");
			for (int j = 0; j < n2[i].length; j++) {
				System.out.print(n2[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] n1 = new int[3][4]; // 12개의 data,초기화된 상태
		System.out.println("2차원 배열의 행의 개수 : " + n1.length);
		System.out.println("0행의 배열의 열의 개수 : " + n1[0].length);
		System.out.println("1행의 배열의 열의 개수 : " + n1[1].length);
		System.out.println("2행의 배열의 열의 개수 : " + n1[2].length);
		for (int i = 0; i < n1.length; i++) { // n1.length는 n1의 행 길이를 나타냄
			for (int j = 0; j < n1[i].length; j++) {
				System.out.print(n1[i][j] + " ");
			}
			System.out.println();

		}

	}

}
