package 문제풀이;

public class 성적확인문제 {

	public static void main(String[] args) {
		String[] subject = { "컴퓨터", "국어", "수학", "영어", "체육" };
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };
		int up = 0;
		int eq = 0;

		/*
		 * 1.성적이 2학기 향상된 과목의 수를 카운트해보세요. 2.석정이 1,2학기 동일한 과목의 수를 카운트해보세요. 3.성적이 1,2학기
		 * 동아리한 과목명을 프린트해보세요.
		 */

		System.out.print("성적이 향상된 과목은 ");
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				up++;
				System.out.print(subject[i] + " ");
			}
		}
		System.out.println("입니다. 총" + up + "개");
		System.out.print("성적이 동일한 과목은 ");
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				eq++;
				System.out.print(subject[i] + " ");
			}

		}
		System.out.println("입니다. 총" + eq + "개");

	}

}
