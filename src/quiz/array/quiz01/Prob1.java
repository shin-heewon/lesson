package quiz.array.quiz01;

public class Prob1 {

  public static void main(String[] args) {

    int[] ia = new int[]{3, 7, 1, 8, 10, 2, 15, 2, 10};
    int[] ib = new int[]{1, 2, 3, 4, 5};

    int iaOddNum = 0;//홀
    int iaEvenNum = 0;//짝

    int ibOddNum = 0;
    int ibEvenNum = 0;

    for (int i = 0; i < ia.length; i++) {
      if (ia[i] % 2 == 0) {
        iaEvenNum += ia[i];
      } else {
        iaOddNum += ia[i];
      }
    }
    System.out.println("<배열 ia>");
    System.out.println("홀수의 합 : " + iaOddNum);
    System.out.println("짝수의 합 : " + iaEvenNum);

    for (int i = 0; i < ib.length; i++) {
      if (ib[i] % 2 == 0) {
        ibEvenNum += ib[i];
      } else {
        ibOddNum += ib[i];
      }
    }
    System.out.println("<배열 ib>");
    System.out.println("홀수의 합 : " + ibOddNum);
    System.out.println("짝수의 합 : " + ibEvenNum);



    /*문제 2*/
    int[] arr = new int[5];
    for (int i = 0; i < arr.length; i++) {

      arr[i] = (int) (Math.random() * 99) + 1;

    }

    for (int i = 0; i < arr.length; i++) {

      System.out.print(arr[i] + " ");

    }

  }//main


}
