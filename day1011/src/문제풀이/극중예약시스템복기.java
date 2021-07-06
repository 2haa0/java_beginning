package 문제풀이;

import java.util.Scanner;

public class 극중예약시스템복기 {

	public static void main(String[] args) {
		int[] seat = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------------------");
		
		for (int i = 0; i < seat.length; i++) {
			seat[i] = (i+1);
			System.out.print(seat[i] + " ");
		}
		System.out.println();
		System.out.println("---------------------");

	}

}
