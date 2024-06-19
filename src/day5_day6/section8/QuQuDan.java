package day5_day6.section8;

import java.util.Scanner;

public class QuQuDan {
    public static void main(String[] args) {
        int dan = 2;
        int result = 0;

//        System.out.printf("%d x %d = %d", dan, 1, dan*1);
//        System.out.printf("%d x %d = %d", dan, 1, dan*1);
//        System.out.printf("%d x %d = %d", dan, 1, dan*1);
//        System.out.printf("%d x %d = %d", dan, 1, dan*1);
//        System.out.printf("%d x %d = %d", dan, 1, dan*1);
//        System.out.printf("%d x %d = %d", dan, 1, dan*1);
//        System.out.printf("%d x %d = %d", dan, 1, dan*1);
//        System.out.printf("%d x %d = %d", dan, 1, dan*1);
//        System.out.printf("%d x %d = %d", dan, 1, dan*1);
//        System.out.printf("%d x %d = %d", dan, 1, dan*1);

//        for(int i =2; i<6; i++){
//            System.out.println("구구단"+i+"단");
//            for(int j=1; j<=9; j++){
//                System.out.printf("%d x %d = %d\n", i, j, i*j);
//            }
//        }//for end


        /*사용자에게 원하는 단을 하나 입력 받아 해당 단만 출력*/
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i=1; i<10; i++){
            System.out.printf("%d x %d = %d\n", a, i, a*i);
        }


        System.out.println(" ");

        /*사용자에게 3단~7단 해당 범위의 단만 출력*/
        int b = sc.nextInt();
        int d = sc.nextInt();
        for(int i =b; i<=d; i++){
            System.out.println("구구단"+i+"단");
            for(int j=1; j<=9; j++){
                System.out.printf("%d x %d = %d\n", i, j, i*j);
            }
        }//for end
    }
}
