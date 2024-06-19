package day5_day6.section5;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {

		//do-while 문은 while문과 for문처럼 조건식에 의해 반복된다는 점은 비슷하다.
		//차이점은 조건식을 확인하기 전에 코드블럭의 코드가 한 번 실행된다.

		int i = 1;
		do {
			System.out.println("Hello Java!");
			i++;
		}while (i<6);

		//키보드로부터 10보다 큰 수부터 10까지의 합을 구하기 위한 do-while문을 작성
		Scanner sc = new Scanner(System.in);

		int sum = 0;


		System.out.println("10보다 큰 숫자를 하나 입력하세요.");
		int a = sc.nextInt();
		do{
			sum += a;
			a--;
		}while (a>=10);

		System.out.println("sum = "+sum);


	}
}