package 반복문;

public class 반복문2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {//Q1
			//이때 조건식은 i<6보다 결과값이 명시되는 i<=5가 좋다.
			//i++ : i = i + 1
			System.out.println(i);
		}
		for (int j = 1; j <= 10; j= j + 2) {//Q2
			System.out.println(j);
		}
		for (int k = 1; k <= 100; k = k + 5) {//Q3
			System.out.println(k);
		}
		for (int z = 100; z >= 1; z--) {//Q4
			System.out.println(z);
		}
		for (int y = 1000; y >= 0; y = y - 8) {//Q5
			System.out.println(y);
		}

	}

}
