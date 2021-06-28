package 반복문;

import javax.swing.JOptionPane;

public class 반복문3 {

	public static void main(String[] args) {
		/* 시작값: 3
		 * 종료값: 10
		 * 3 ~10 프린트 */	
		
		String i = JOptionPane.showInputDialog("시작값");
		String j = JOptionPane.showInputDialog("종료값");
		
		int ii = Integer.parseInt(i);
		int ji = Integer.parseInt(j);
		
		/*for ( ; ii <= ji; ii++) {
			System.out.println(ii);
		}*/
		
		while (ii <= ji ) {
			System.out.println(ii);
			ii++;
		}

	}

}
