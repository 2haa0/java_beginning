package 알고리즘;

public class 최소값구하기 {

	public static void main(String[] args) {
		// 많은 양의 데이터를 정령 혹은 검색하는 경우 배열에 집어넣어라.
		int[] s = { 90, 80, 20, 60, 70 };

		// 전체를 n번 순차적으로 '순회'하면서 해당 index까지의 최소값을 변수 하나에
		// 넣어두는 알고리즘.

		int min = s[0]; // 0으로 초기화하면 변수가 0이 나오므로 0을 제외한 목록에 있는 값으로 정의한다. -> 보통 배열의 첫번째 값
		
		for (int i = 1; i < s.length; i++) { // s[0]으로 초기화 했으므로 s[1]부터 순회하면 됨.
			if(s[i] < min) { // 해당 index에 들어있는 값이 min에 넣어둔 값보다 작으면 
				// 작은 값을 min에 넣는다.
				min = s[i];
			}
			
		}
		System.out.println("최소값은 " + min);
	}

}
