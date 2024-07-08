package quiz.array.quiz03;

public class Quiz5 {
    public static int getValue(int[] values, boolean isMax) {
        // int 타입 배열의 최대값(true) 또는 최소값(false)을 리턴한다.
        int temp = 0;
        for (int i = 0; i < values.length-1; i++) {
            int maxNum=values[0];
            for (int j = 1; j < values.length; j++) {
                if (maxNum>values[j]) {
                    temp=values[j];
                    values[j]=maxNum;
                    values[j-1]=temp;
                }else if(maxNum<values[j]){
                    maxNum=values[j];
                }
            }
        }

        if (isMax) return values[values.length-1];
        else return values[0];

    }

    public static void main(String[] args) {
        int[] values = {57, 3, 43, 5, 39, 23, 55, 2};

        int maxValue = getValue(values, true);
        int minValue = getValue(values, false);

        System.out.println("최대값 = " + maxValue);
        System.out.println("최소값 = " + minValue);

    }
}
