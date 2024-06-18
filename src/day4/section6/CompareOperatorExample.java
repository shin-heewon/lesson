package day4.section6;

public class CompareOperatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;

		if(num1 == num2){
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}


		char ch = 'A';
		int chInt = 65;
		if(ch == chInt){
			System.out.println("같음");
		}else {
			System.out.println("다르다");
		}

		System.out.println(ch == chInt);

		/*예외*/
		//0.1f == 0.1 0.1f는 float 타입이고 0.1은 double 타입 = > false
		System.out.println(0.1f == 0.1);
		System.out.println(0.1f == (float) 0.1); //true
		System.out.println(0.1f); //0.1로 출력되나 실제로는 0.11111111? 이다.

		//문자열을 비교시, equals() !equls()
		String str1 = "안녕";
		String str2 = "안 녕";

		boolean result = str1.equals(str2);
		System.out.println(result);
		System.out.println(! str1.equals(str2));
		/*System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);*/
			

		//System.out.println("result4: " + result4);
			

		//System.out.println("result5: " + result5);


		/*System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);*/


		/*boolean result8 = (str1.equals(str2));
		boolean result9 = (! str1.equals(str2));
		System.out.println("result8: " + result8);
		System.out.println("result9: " + result9);*/
	}
}