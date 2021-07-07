package 그래픽문제;

public class 이차원배열2 {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		int[] arr2 = new int[5];
		int[] arr3 = new int[4];
		// 18개의 변수 생성
		
		int[][] arrList = new int[3][];
		//6,7,8줄(총 18개)를 여기에 끼워넣고 length를 저장해서 총 20개의 변수가 생성됨
		arrList[0] = arr1;
		arrList[1] = arr2;
		arrList[2] = arr3;
		//      0  1  2  3  4
		//----------------------
		//  0|  0  0  0  
		//  1|  0  0  0  0  0
		//  2|  0  0  0  0
		
		/* 1차원의 배열 하나당 for문이 필요로 하므로 2차원배열은 for문안에 for문을 명령하여
		 * '2중for문'이라고 함.
		 */
		
		
	

	}

}
