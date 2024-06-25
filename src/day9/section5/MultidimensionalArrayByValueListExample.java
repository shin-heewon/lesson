package day9.section5;

public class MultidimensionalArrayByValueListExample {

  public static void main(String[] args) {
    //2차원 배열 생성
    int[][] scores = {
        {80, 90, 96},
        {76, 88}
    };
    int total1 = 0;
    int total2 = 0;
    double avg1 = 0.0;
    double avg2 = 0.0;

    //배열의 길이
    System.out.println("1차원 배열 길이(반의 수) 출력 : " + scores.length);
    System.out.println("2차원 배열 길이(첫번째 반의 학생 수) 출력 : " + scores[0].length);
    System.out.println("2차원 배열 길이(두번째 반의 학생 수) 출력 : " + scores[1].length);
    //첫번째 반의 세번째 학생의 점수 읽기
    System.out.println(scores[0][2]);

    //두번째 반의 두번째 학생의 점수 읽기
    System.out.println(scores[1][1]);

    //첫번째 반의 평균 점수 구하기
    for (int i = 0; i < scores[0].length; i++) {
      total1 += scores[0][i];
    }

    avg1 = (double) total1 / scores[0].length;
    System.out.println(avg1);

    //두번째 반의 평균 점수 구하기
    for (int i = 0; i < scores[1].length; i++) {
      total2 += scores[1][i];
    }

    avg2 = (double) total2 / scores[1].length;

    //전체 학생의 평균 점수 구하기
//    double totalAVg = (double) (total1 + total2) / (scores[0].length + scores[1].length);
//    System.out.println(totalAVg);

    int totalScores = 0;
    double totalAvg = 0.0;
    int stuNum = 0;
    
    for (int i = 0; i < scores.length; i++) {
      stuNum += scores[i].length;
      for (int j = 0; i < scores[i].length; j++) {
        totalScores += scores[i][j];
      }
    }

    totalAvg = (double) totalScores / stuNum;
    System.out.println(totalAvg);


  }//main end
}
