package quiz.array.quiz03;
public class ArrayUtil {
	public static void main(String[] args){
		char[] s = {'J', 'a', 'v', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm'};

		reverseString(s,0,3);
		System.out.println();
		reverseString(s,4,7);

	}
	public static char[] reverseString(char[] s, int start, int end) {
		int length = end - start +1;
		char[] result = new char[length];
		char[] array = s.clone();

		for(int i=0;i<length;i++){
			result[i] = array[end - i];
			//System.out.print(result[i]+"*"+s[start+i]+" ");
		}
		for(int i=0;i<length;i++){
			array[start+i] = result[i];

		}
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
		}
		return array;
	}
}
