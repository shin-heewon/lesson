package day4.section7;

import java.util.Scanner;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode1 = 'A';
		int charCode2 = 'a'; //97
		int charCode3 = '5';

		Scanner sc = new Scanner(System.in);
		//java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Q1. 알파벳 숫자 한 자를 입력하세요.");
		//int result = Integer.parseInt(sc.next().charAt(0));
		int result = sc.next().charAt(0);




		//Q1. 입력받은 문자가 대문자인지 소문자인지 구분하여 대문자이면 "대문자 입력값", 소문자이면 "소문자 입력값" 출력
		if(result>=65 && result <=90){
			System.out.println("대문자 입력값\n");
		} else if (result >=97 && result <=122) {
			System.out.println("소문자 입력값\n");
			
		}



		/*Q2. 입력받은 문자가 숫자인지, 알파벳 대분자 또는 소문자인지 구분하여 숫자, 대문자, 소문자 출력하기*/
		System.out.println("Q2. 문자(알파벳, 숫자 0-9) 하나를 입력하세요!");

		int result2 = sc.next().charAt(0);

		if(result2>=65 && result2 <=90){
			System.out.println("대문자 입력값\n");

		}else if (result2 >=48 && result2 <=57) {
			System.out.println("숫자 입력값\n");

		} else if (result2 >=97 && result2 <=122) {
			System.out.println("소문자 입력값\n");

		}


		//Q3. // 입력받은 숫자가 2의 배수 또는 3의 배수인지 검사하여 2의 배수 또는 3의 배수이면 "Ok" 아니면 "Oops.."
		System.out.print("숫자 하나를 입력하세요: ");
		int num = Integer.parseInt(sc.next());
		if(num % 2 == 0 || num % 3 == 0) {
		    System.out.println("Ok");
		} else {
		    System.out.println("Oops..");
		}


		//----------------------------------------------------------

		int value = 6;


	}
}