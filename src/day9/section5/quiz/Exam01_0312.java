package day9.section5.quiz;

import java.util.Scanner;

public class Exam01_0312 {


  public static void main(String[] args) {
    int[] arr = new int[5];
    int sum = 0;//주어진 정수들의 합
    double rate = 0.0;

    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
      sum += arr[i];

    }

    for (int i = 0; i < arr.length; i++) {
      rate = ((double) arr[i] / (double) sum) * 100.0;
      for (int j = 1; j < rate / 1; j++) {
        System.out.print("*");
      }
      System.out.println("(" + rate + "%)");
    }


  }//end of main


}
