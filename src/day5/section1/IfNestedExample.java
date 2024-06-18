package day5.section1;

public class IfNestedExample {
	public static void main(String[] args) {
		int score = (int)(Math.random()*20) + 81;//81~100

//		System.out.println("점수: " + score);
//
//		String grade;
//
//		if(score>=90) {
//			if(score>=95) {
//				grade = "A+"; //'A'는 char타입으로 String 클래스 타입인 "A"와는 완전히 다른 값이다.
//			} else {
//				grade = "A";
//			}
//		} else {
//			if(score>=85) {
//				grade = "B+";
//			} else {
//				grade = "B";
//			}
//		}
//
//		System.out.println("학점: " + grade);


		/*입력된 score 점수를 확인하여 95~100 A+, 90~94 A, 85~90 B+, 80~89 B, 75~79 C+, 70~74 C, 그 외는 Ffh cjflgkrh,
		* 최종 "당신의 학점은 0입니다." 출력  */
		String grade = "";
		if (score > 70) {

			if (score >= 90) {
				if (score >= 95) {
					grade = "A+";
				} else {grade = "A";}

			} else if (score >= 80) {
				if (score >= 85) {
					grade = "B+";
				} else {
					grade = "B";
				}

			} else if (score >= 70) {
				if (score >= 75) {
					grade = "C+";
				} else {
					grade = "C";

				}
			}
			System.out.println("당신의 점수는 "+score+"이고, 학점은 "+ grade +"입니다."); //grade변수에 값을 넣어놔야 함. 선언만 하면 안됨
		} else {
			grade = "F";
			System.out.println("재수강 하세요!");
		}


	}
}