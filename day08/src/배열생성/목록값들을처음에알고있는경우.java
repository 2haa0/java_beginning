package 배열생성;

public class 목록값들을처음에알고있는경우 {

	public static void main(String[] args) {
		//배열을 만들때는 처음부터 값들을 알고 있는 경우와 모르고 있는 경우를 다르게 해야한다.
		//아까는 몰라서 일단 선언하고 자리부터 만들었음.
		
		//아는 경우
		String[] names = {"홍길동", "송길동", "장길동", "박길동","정길동"}; //string이니까 ""꼭
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		
		System.out.println();
		for (String s : names) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		int[] ages = {100, 88, 55, 10, 4};
		for (int i = 0; i < ages.length; i++) {
			System.out.print(ages[i] + " ");
		}
		System.out.println();
		
		/* for each : 처음부터 끝까지 출력용으로 꺼낼때 쓰임
		 *            각값을 대입하는건 불가능 */
		
		for (int x : ages) { // : 오른쪽엔 배열, int x가 먼저 선언되고 ages의 ages[0]을 int x에 대입
			System.out.print(x + " "); // for each에서 x는 인덱스가 아니라 가져와서 대입될 변수
		}
		
		System.out.println();
		Double[] eyes = {2.0, 1.5, 1.2, 0.8, 1.0};
		for (int i = 0; i < eyes.length; i++) {
			System.out.print(eyes[i] + " ");
		}
		System.out.println();
		for (Double double1 : eyes) {
			System.out.print(double1 + " ");
		}
		
		System.out.println();
		char[] genders = {'남', '여', '남', '여', '남', '외'};
		for (int i = 0; i < genders.length; i++) {
			System.out.print(genders[i] + " ");
		}
		System.out.println();
		for (char c : genders) {
			System.out.print(c + " ");
		}
		
		System.out.println();
		Boolean[] food = {true, false, true, true, false};
		for (int i = 0; i < food.length; i++) {
			System.out.print(food[i] + " ");
		}
		System.out.println();
		for (Boolean boolean1 : food) {
			System.out.print(boolean1 + " ");
		}
		
		

	}

}
