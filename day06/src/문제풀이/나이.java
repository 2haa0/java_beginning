package 문제풀이;

import java.util.Date;

import javax.swing.JOptionPane;

public class 나이 {

	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("몇 살이에요?");
		int ageI = Integer.parseInt(age);
		Date date = new Date();
		int year = date.getYear() + 1901 - ageI ;
		
		System.out.println(year);
		
		String time = JOptionPane.showInputDialog("몇 시에 태어났어요?");
		int timeI = Integer.parseInt(time);
		
		if (timeI >=0 && timeI <= 12) {
			System.out.print("오전");
			
			if (timeI <= 6 ) {
				System.out.println("중에서도 새벽에 태어났네요.");
				
			} else {
				System.out.println("에 태어났네요.");
			}
			
		} else {
			System.out.print("오후");
			if (timeI >= 21 ) {
				System.out.println("중에서도 밤에 태어났네요.");
				
			} else {
				System.out.println("에 태어났네요.");
			}

		}

	}

}
