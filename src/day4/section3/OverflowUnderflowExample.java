package day4.section3;

public class OverflowUnderflowExample {
	public static void main(String[] args) {
		byte var1 = 125;

		for(int i=0;i<5;i++){
			var1++;
			System.out.println("var1 : " + var1);
		}

		System.out.println("-----------------------");

		byte var2 = -125;
		for(int i=0;i<5;i++){
			var2--;
			System.out.println("var2 : " + var2);
		}

		int xx = 10000000;
		//int yy = 10000000;
		long yy = 10000000;
		//int zz = xx * yy; //int 허용범위를 초과해서 오버플로우 됨 => 해결하기 위해서는 xx 혹은 yy 중 하나를 long으로 해주면 됨.
		long zz = xx*yy;

		System.out.println(zz);


		/*
		var1 : 126
var1 : 127
var1 : -128
var1 : -127
var1 : -126
-----------------------
var2 : -126
var2 : -127
var2 : -128
var2 : 127
var2 : 126

		 */
	}
}