package day18;

import java.util.StringTokenizer;

public class StringTokenixerEx {

  public static void main(String[] args) {
    String data1 = "김창완&정수민&김지훈";
    //1. 토크나이저 하여 학생 이름을 1 김창완 2 정수민 3 김지훈 으로 출력하시오
    StringTokenizer st = new StringTokenizer(data1, "&");
    int i = 1;
    while (st.hasMoreTokens()) {
      System.out.print(i + st.nextToken() + "\t");
      i++;
    }
    System.out.println();
    System.out.println("=====================================");
    //2. 결과는 1과 동일하게 split()메소드를 이용하여 출력하세요.
    String[] list = data1.split("&");
    int num = 1;
    for (String str : list) {
      System.out.print(num + str + "\t");
      num++;
    }
  }

}
