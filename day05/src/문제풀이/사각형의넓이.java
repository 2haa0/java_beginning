package 문제풀이;

import javax.swing.JOptionPane;

/*사각형의 넓이를 구하자
 * 가로크기 33.3
 * 세로크기 22.2
 * 사각형의 넓이는 ****입니다. */
public class 사각형의넓이 {

	public static void main(String[] args) {
		String w = JOptionPane.showInputDialog("사각형의 가로 크기:");
		String h = JOptionPane.showInputDialog("사각형의 세로 크기:");
		
		double wd = Double.parseDouble(w);
		double hd = Double.parseDouble(h);
		
		System.out.println("가로크기: " + w);
		System.out.println("세로크기: " + h);
		System.out.println("사각형의 넓이는 " + (wd * hd) + "입니다.");
		

	}

}
