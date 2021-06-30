package 누적연습;

public class 누적10까지 {

	public static void main(String[] args) {
		
		
		int sum = 0; // 초기값에 0이 오면 안 될 때_ 음수와 0 중에서 최고값을 찾는 문제 
		for (int i = 1; i <= 10; i++) {
			// 1 +2 +3 +4...
			sum = sum + i; // 1 = 0 + 1
			              // 3 = 1 + 2
						  // 6 = 3 + 3
		}
		System.out.println(sum);
	}
}
