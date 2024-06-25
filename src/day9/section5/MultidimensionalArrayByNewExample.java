package day9.section5;

import java.sql.Struct;
import java.util.Scanner;

public class MultidimensionalArrayByNewExample {

  public static void main(String[] args) {
    // 각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
    int[][] engScores = new int[2][3];

    // 배열 항목 초기값 출력(for문 이용)
   /* for (int i = 0; i < engScores.length; i++) {
      for (int j = 0; j < engScores[i].length; j++) {
        System.out.println("engScores[" + i + "][" + j + "] => " + engScores[i][j]);

      }
    }*/

    System.out.println();
    // engScores 배열의 점수를 입력받아 항목 값 변경 후 출력
    int total = 0;
    double avg = 00;
    int studentNum = 0;
    System.out.println("영어 과목 점수 입력");

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < engScores.length; i++) {
      studentNum += engScores[i].length;//반의 학생 수 합산
      for (int j = 0; j < engScores[i].length; j++) {
        System.out.println("한 명의 영어 점수 입력");
        engScores[i][j] = sc.nextInt();
        total += engScores[i][j];
        System.out.println("engScores[" + i + "][" + j + "] => " + engScores[i][j]);
      }
    }

    // 전체 학생의 수학 평균 구하기
    avg = (double) total / studentNum;
    System.out.println("전체 학생의 영어 평균 점수 => " + avg);

    // 각 반의 학생 수가 다를 경우 점수 저장을 위한 2차원 배열 생성
    //전체 반은 3개의 반이다.
    int[][] mathScores = new int[3][];

    int stuNum = 0;//각 반의 학생 수
    int mathTotal = 0;
    double mathAvg = 0.0;

    //1반은 학생 수 5명, 2반은 3명, 3반은 10명이다. 각 반의 학생 수를 세팅해서(입력받아서) 초기값을 출력하세요.
    mathScores[0] = new int[5];
    mathScores[1] = new int[3];
    mathScores[2] = new int[10];
    for (int i = 0; i < mathScores.length; i++) {
      stuNum += mathScores[i].length;
      for (int j = 0; j < mathScores[i].length; j++) {
        mathScores[i][j] = sc.nextInt();
        mathTotal += mathScores[i][j];

      }
    }

    mathAvg = (double) mathTotal / stuNum;

    System.out.println();
    // 배열 항목 값 변경

    // 전체 학생의 영어 평균 구하기

  }
}
