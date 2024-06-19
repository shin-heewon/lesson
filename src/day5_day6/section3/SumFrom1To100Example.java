package day5_day6.section3;

import java.util.Scanner;

public class SumFrom1To100Example {
	public static void main(String[] args) {
		//키보드로부터 입력받은 5개의 숫자의 합을 출력하는 프로그램을 작성하세요.
		Scanner sc = new Scanner(System.in);

		int sum  =0;

		for (int i=0; i<5; i++){

			int num = sc.nextInt();
			sum +=num;

		}

		System.out.println(sum);


		int a = 1;
		int total = 0;
		while (a<=5){
			int num = sc.nextInt();
			total += num;
			a++;
		}

	}
 }