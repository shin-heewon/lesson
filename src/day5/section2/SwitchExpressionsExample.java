package day5.section2;
/*자바 12 이상부터만 사용 가능함!*/
public class SwitchExpressionsExample {
	public static void main(String[] args) {
	
		char grade = 'A';
		
		switch (grade){
			
			case 'A', 'a' -> {
				System.out.println("우수회원");
			}
			case 'B', 'b' -> {
				System.out.println("일반회원");
			}
			default -> {
				System.out.println("손님");
			}
			
		} // 첫번째 switch



		switch (grade){
			case 'A', 'a' -> System.out.println("우수회원"); //코드가 한 줄일 결우에만 블럭 없이 한 줄로 표현하기!
			case 'B', 'b' -> System.out.println("일반회원");
			default -> System.out.println("손님");
		}
	}
}