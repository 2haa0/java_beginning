package 알고리즘;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class 가변적인다양한타입 {

	public static void main(String[] args) {
		// set: 집합 _ 중복값 불허
		HashSet set = new HashSet();
		// 배열과 유사하며, set값에는 주소가 할당된다.
		set.add(100);
		set.add(200);
		set.add(100);
		System.out.println(set.size());
		System.out.println(set + "\n"); // 대괄호까지 예쁘게 찍힌다.
		
		ArrayList list = new ArrayList();
		//많은 양의 데이터를 다룰 떄, 가변, 다양한 데이터인 경우 사용.
		
		list.add(100);
		list.add(100.33);
		list.add(true);
		list.add('a');
		list.add("감자"); //참조형도 추가 가능		
		Random r = new Random();
		list.add(r);
		//기본형을 넣은 것 같지만 내부적으로는 모두 참조형으로 변환되어 추가됨
		//object는 기본형, 참조형 모두 넣어도 되는 것
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5) + "\n");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		System.out.println();
		list.remove(5); //index 5번을 지워라!
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
	}

}
