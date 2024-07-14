package quiz.array.quiz03;

import java.util.Scanner;

public class Prob8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[][] arr = new int[a][b];
        for (int i = 0; i < arr.length; i++) {
            int temp = a*(i+1);
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = temp;
                temp--;
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
