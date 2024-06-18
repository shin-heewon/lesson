package day5.section2;

public class SwitchCharExample {
	public static void main(String[] args) {
		/*입력된 score 점수를 확인하여 95~100 A+, 90~94 A, 85~90 B+, 80~89 B, 75~79 C+, 70~74 C, 그 외는 F,
		 * 최종 "당신의 학점은 0입니다." 혹은 F는 재수강 하세요 출력  */
		char grade = 'B';
		
		switch (grade){// Character.toUpperCase(grade)
			case 'A':
			case 'a':
				System.out.println("우수 회원");
				break;
			case 'B':
			case 'b':
				System.out.println("일반 회원");
				break;
			default:
				System.out.println("손님");
		}
		

	}
}