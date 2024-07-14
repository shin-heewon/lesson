package quiz.array.quiz03;

import java.lang.reflect.Array;
import java.util.*;

public class Prob6 {

	public static void main(String[] args) {
		Prob6 median = new Prob6();

		int[] values1 = {10, 4, 53, 63, 17, 37, 52, 16, 33, 65};
		System.out.println("input : " + Arrays.toString(values1));
		System.out.println("median : " + median.findMedian(values1));
		System.out.println("=================================================");

		int[] values2 = {32, 53, 52, 76, 15, 98, 76, 65, 36, 10};
		System.out.println("input : " + Arrays.toString(values2));
		System.out.println("median : " + median.findMedian(values2));

	}

	public int findMedian(int[] values) {
		int sum = 0;
		for (int i : values) {
			sum += i;
		}
		int avg = Math.round(sum / values.length);

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < values.length; i++) {
			map.put(i, Math.abs(avg - values[i]));
		}
		List<Integer> keySet = new ArrayList<>(map.keySet());
		keySet.sort(new Comparator<Integer>() {//value 값으로 정렬
			@Override
			public int compare(Integer o1, Integer o2) {
				if(map.get(o1) - map.get(o2) == 0){//중간 값이 여러 개 일 경우, 작은 수가 앞쪽에 정렬
					return values[o1]-values[o2];
				}
				return map.get(o1) - map.get(o2);
			}
		});

		return values[keySet.get(0)];

	}

}
