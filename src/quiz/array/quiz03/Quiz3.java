package quiz.array.quiz03;

import java.util.Arrays;

public class Quiz3 {
    public static void main(String[] args) {
        int[] array = {3, 17, 12, 43, 3, 17, 3, 8, 21, 8};
        System.out.println("<< 중복되지 않은 숫자 >>");
        printUniqueNumber(array);

    }




    private static void printUniqueNumber(int[] array) {
        // 중복되지 않은 숫자를 저장할 배열 (최대 크기는 원래 배열과 같음)
        int[] temp = new int[array.length];
        int uniqueCount = 0;

        for (int i = 0; i < array.length; i++) {

            boolean isDuplicate = false;

            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {//{3, 17, 12, 43, 3, 17, 3, 8, 21, 8};
                    isDuplicate = true;//인덱스 0부터 비교했을 때 같은 수가 없으면 isDuplicate=false=>if문 실행=uniqueNum저장
                    break;
                }
            }
            if (!isDuplicate) {
                temp[uniqueCount] = array[i];
                uniqueCount++;
            }
        }

        for (int i = 0; i < temp.length; i++) {
            if(temp[i] != 0 ){
                System.out.print(temp[i]+", ");
            }
        }
    }
}

