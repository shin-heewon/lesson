package day5_day6.section3;

public class PrintFrom1To10Example {
	public static void main(String[] args) {

		int sum = 0;


		for (int i=0;i<11;i++){
			sum += i;
			System.out.printf("sum : %d, i = %d\n", sum,i);
		}

	}
}