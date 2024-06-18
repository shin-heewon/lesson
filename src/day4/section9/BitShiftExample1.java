package day4.section9;

public class BitShiftExample1 {
	public static void main(String[] args) {
		int num1 = 1;

		int result1 = num1 << 3;//1*2의 3승 ==> 8
		int result2 = num1 * (int) Math.pow(2,3); //pow 함수 : return 값이 double 값임

		System.out.println(result1 + " "+ result2);

		int num2 = -8;
		int result3 = num2 >> 3;
		int result4 = num2 / (int) Math.pow(2,3);

		System.out.println(result3 + " "+result4);

	}
}	