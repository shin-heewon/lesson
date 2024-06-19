package day5_day6.section4;

import java.util.Scanner;

public class KeyControlExample {
	public static void main(String[] args) {

		//키보드로부터 입력받은 숫자가 짝수인지 홀수인지 판별하고, 계속 입력 진행할지 여부를 선택하기 위한 프로그램
		// 종료 조건 : 계속 입력하면 1, 끝내고 싶다면 0

		/*
		* 1. 종료조건 사용자 선택이 1이면 계속 진행.
		* 2. 숫자 입력 안내문 출력
		* 3. 사용자 입력한 숫자 입력기 이용해서 받은 후 저장
		* 4. 입력받은 숫자의 짝홀수 여부 확인
		* 5. 판단 내용을 출력
		* 6. go, stop 선택 받기
		* */
		Scanner sc = new Scanner(System.in);

		int choice = 1;

		while (choice==1){

			System.out.println("숫자를 하나 입력해주세요.");
			int a = sc.nextInt();

			if (a % 2 == 0) {
				System.out.println("짝수");
			} else if(a == 0){
				System.out.println("0");
			} else if (a % 2 != 0) {
				System.out.println("홀수");
			}else {
				System.out.println("판단할 수 있는 숫자가 아닙니다.");
			}


			System.out.println("계속 진행하고싶으면 1, 아니면 0을 입력해주세요.");

			choice = sc.nextInt();


		}

		System.out.println("짝홀수 처리 프로그램을 종료합니다.");

	}
}