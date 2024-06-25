package day9.section3;

import java.util.StringTokenizer;

public class CharAtExample {

  public static void main(String[] args) {
    String ssn = "010624-1230123";
    String result = "";
    String result2 = "";
    //1. charAt()통해서 "1230123" 만 추출하여 출력하기
    for (int i = 7; i < ssn.length(); i++) {
      char ch = ssn.charAt(i);
      result = result.concat(ssn.valueOf(ch));
      result2 += ssn.charAt(i);
    }
    System.out.println(result2);
    System.out.println(result);

    //2. 남성은 (1,3) 여성은 (2,4) 해당 인덱스를 추출하여 (1,3)은 "남성", (2,4)는 "여성) 출력
    int index = ssn.indexOf("-") + 1;

    System.out.println("------------");
    System.out.println(ssn.valueOf(index));

    if (ssn.charAt(index) == '1' || ssn.charAt(index) == '3') {
      System.out.println("남성");
    } else if (ssn.charAt(index) == '2' || ssn.charAt(index) == '4') {
      System.out.println("여성");
    }


  }
}
