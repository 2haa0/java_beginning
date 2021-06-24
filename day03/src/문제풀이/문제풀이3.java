package 문제풀이;
//3.생수값 1000, 생수개수 2/ 마스크값 2000, 마스크개수3
//생수 총 금액은? 마스크 총 금액은? 총 지불금액은?

import javax.swing.JOptionPane;

public class 문제풀이3 {

	public static void main(String[] args) {
		int wt = 1000;
		int wtP = 2;
		int msk = 2000;
		int mskP = 3;

		System.out.println("1)생수값 금액은 얼마?" + (wt * wtP) + "원");
		System.out.println("2)마스크값 금액은 얼마?" + (msk * mskP) + "원");
		System.out.println("3)총 지불금액은 얼마?" + ((wt * wtP) + (msk * mskP)) + "원");
		
	}

}
