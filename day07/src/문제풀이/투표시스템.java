package 문제풀이;

import javax.swing.JOptionPane;

public class 투표시스템 {

	public static void main(String[] args) {

		int pkc = 0, pt = 0, eshs = 0;
		for (int i = 0; i < 5; i++) {
			String vote = JOptionPane.showInputDialog("피카츄: 1, 팬텀: 2, 이상해씨: 3");
			switch (vote) {
			case "1":
				pkc++;
				break;

			case "2":
				pt++;
				break;
			
			case "3":
				eshs++;
				break;	
				
			default: 
				JOptionPane.showMessageDialog(null, "1, 2, 3만 하랬잖아요.");
				i--; 
				break;
			}
			
		}
		if (pkc > pt && pkc > eshs) {
			JOptionPane.showMessageDialog(null, "피카츄 " + pkc + "표/ 팬텀 " + pt + "표/ 이상해씨 " + eshs + "표");
			JOptionPane.showMessageDialog(null, "피카츄랑 여행하기");
		} else if(pt > pkc && pt > eshs) {
			JOptionPane.showMessageDialog(null, "피카츄 " + pkc + "표/ 팬텀 " + pt + "표/ 이상해씨 " + eshs + "표");
			JOptionPane.showMessageDialog(null, "팬텀과 여행하기");
		}else if(eshs > pkc && eshs > pt) {
			JOptionPane.showMessageDialog(null, "피카츄 " + pkc + "표/ 팬텀 " + pt + "표/ 이상해씨 " + eshs + "표");
			JOptionPane.showMessageDialog(null, "이상해씨와 여행하기");
		} else {
			JOptionPane.showMessageDialog(null, "피카츄 " + pkc + "표/ 팬텀 " + pt + "표/ 이상해씨 " + eshs + "표");
			JOptionPane.showMessageDialog(null, "두 마리 이상과는 여행할 수 없어요. 다시!");

		}

	}

}
