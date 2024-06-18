package day5.section1;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if(score < 90) {
			System.out.println("점수가 90보다 작습니다.");
		}else {
			System.out.println("등급은 B입니다.");
		}
		//블럭{}을 치는걸 원칙으로 하나, 업데이트 하면서 안 해줘도 됨 , 블럭 표시 해주기!
	}
}