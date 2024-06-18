package day4.section4;

public class AccuracyExample2 {
	public static void main(String[] args) {
		int apple = 1;
		int totalPieces = apple * 10;
		int number = 7;

		int result = totalPieces - number; //double로 작업하지 말고 정수로 만들어서 작업해야 원하는 결과가 잘 나옴.

		

		System.out.println("10조각에서 남은 조각: " + result);
		System.out.println("사과 1개에서 남은 양: " + result/10.0);

	}
}