package 배열생성;

/* 문제1> int크기 5인 배열을 생성해보세요
 * 문제2> 배열의 크기를 프린트해보세요
 * 문제3> 배열의 첫번째 위치에 100을 넣어서 프린트
 * 문제4> 배열의 마지막 위치에 500을 넣어서 프린트
 * 문제5> 배열의 3번재 위치에 200을 넣어서 프린트
 * 문제6> 배열의 전체 데이터를 프린트 
 * 문제7> 배열의 전체 데이터를 인덱스와 함게 프린트
 * 문제8> 이것을 그림으로 그려보세요. */

/* 변수의 종류
 * -변수에 저장되는 것
 * 1. 기본형변수(값):정수, 실수, 문자1, 논리_ primitive
 * 2. 참조형 변수 (주소): 나머지 다, 배열, 클래스_ reference
 * 
 */

public class 문제1 {

	public static void main(String[] args) {
		
		//문제1
		int[] a1 = new int[5];
		
		//문제2
			System.out.println("배열의 크기: " + a1.length);	
		
		
		//문제3
		a1[0] = 100;
		System.out.println("문제3: " + a1[0]);
		
		//문제4
		a1[4] = 500; // = al[a1.length-1]이라고 치면 마지막 배열이된다.
		System.out.println("문제4: " + a1[4]);

		//문제5
		a1[2] = 200;
		System.out.println("문제4: " + a1[2]);
		
		//문제6
		for (int i = 0; i < a1.length; i++) { //for문 생성시 바로 위에 있는 배열을 자동으로 찾는다.
			System.out.print(a1[i] + " ");
		}
		
		//문제7
		for (int i = 0; i < a1.length; i++) {
			System.out.print(i + ":" + a1[i] + " ");
		}
		
		//지역 변수는 반드시 초기화 시켜준다 / 전역 변수는 아직 안 배움
	
		
	}

}
