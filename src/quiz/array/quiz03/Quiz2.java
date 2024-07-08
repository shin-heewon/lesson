package quiz.array.quiz03;

import java.util.Arrays;

public class Quiz2 {
    static int[] arr = new int[10];
    public static void main(String[] args) {

        arr = generateRandom();
        System.out.println("<<생성된 난수>>");
        for (int i : arr){
            System.out.print(i+", ");
        }
        System.out.println("\n======================================");
        System.out.println("배열에서 가장 큰 숫자 : "+getMaxNum(arr));
    }

    public static int[] generateRandom(){

        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*30)+1;
        }

        return arr;
    }

    static int getMaxNum(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

}
