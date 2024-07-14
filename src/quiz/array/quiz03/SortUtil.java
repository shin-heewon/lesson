package quiz.array.quiz03;

import java.util.Arrays;


public class SortUtil {
	public static void main(String[] args){
		SortUtil sortUtil = new SortUtil();
		sortUtil.ascending(new int[]{7, 5, 2, 19, 34, 51, 32, 11, 67, 21});
	}
	public int[] ascending(int[] inputNumbers) {
		// implements ascending method.
		int[] sortedNumbers = Arrays.copyOf(inputNumbers, inputNumbers.length);
		// 배열을 오름차순으로 정렬합니다.
		Arrays.sort(sortedNumbers);

		return sortedNumbers;
	}
}
