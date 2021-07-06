package 문제풀이;
/* 과목명 = {"국어", "영어", "수학", "컴퓨터", "회화"}
 * 1학기 성적 = { 44, 66, 22, 99, 100}
 * 배열의 깊은 복사 이용할 것.
 * 2학기 성적 = {22,66,88,99,100}
 * 
 * 0) 전체 1학기, 2학기 성적 프린트
 * 1) 1학기, 2학기 성적 중 동일한 성적과목수 
 * 2) 1학기, 2학기 성적 중 오른 과목수
 * 3) 1학기, 2학기 성적 중 오른 과목명
 */

public class 성적문제풀이 {

	public static void main(String[] args) {
		
		String[] sub = {"국어", "영어", "수학", "컴퓨터", "회화"};
		int[] score1 = { 44, 66, 22, 99, 100};
		int[] score2 = score1.clone();
		int count1= 0;
		int count2= 0;
		String upsub = null;
		
		score2[0] = 22;
		score2[2] = 88;
		System.out.print("전체 1학기 성적: ");
		for (int i = 0; i < score1.length; i++) {
			System.out.print(sub[i] + "는 " + score1[i] + "점 /");
		}
		System.out.print("\n전체 2학기 성적: ");
		for (int i = 0; i < score2.length; i++) {
			System.out.print(sub[i] + "는 " + score2[i] + "점 /");
		}
		
		for (int i = 0; i < score1.length; i++) {
			if(score1[i] == score2[i]) {
				count1++;
			}
			if(score1[i] < score2[i]) {
				count2++;
				upsub = sub[i];
			}
			
		}
		System.out.println("\n성적이 동일한 과목 수는 " + count1);
		System.out.println("성적이 오른 과목 수는 " + count2);
		System.out.println("성적이 오른 과목은 " + upsub);
		
	}

}
