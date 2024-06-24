package day9.section1;

import javax.sound.midi.Soundbank;

public class StringEx1 {

  //charAt메소드를 이용하여 "자바 프로그래밍" 문자열에서 "프로그래밍" 문자열만 추출하여 출력하는 프로그램 작성하세요


  public static void main(String[] args) {

    //1. 문자열 저장
    String a = "자바 프로그래밍";
    String str1 = new String("자바 프로그래밍");
    String result = "";
    //char[] ch = new char[str1.length()];

    //2. for문 필요, 문자의 해당 인덱스를 지정해서 '프''로''그''래''밍'을 추출, 결과 : "프로그래밍"

    for (int i = 3; i < str1.length(); i++) {
      System.out.print(str1.charAt(i));

      char ch = str1.charAt(
          i);//the char value at the specified index of this string. The first char value is at index 0
      result = result.concat(str1.valueOf(ch));

    }

    System.out.println("\nresult = " + result);

    //3. "프"의 인덱스를 조회하여 직접 인덱스를 지정하지 않고 추출하도록 리팩토링
    //4. charAt()문자를 문자열로 변환하여 concat()메소드로 문자열을 생성하여 출력
    int startNum = str1.indexOf("프");
    String result2 = "";

    for (int i = startNum; i < str1.length(); i++) {
      char ch2 = str1.charAt(i);
      result2 = result2.concat(String.valueOf(ch2));
    }//for end

    System.out.println("result2 = " + result2);

    System.out.println(str1.substring(3, str1.length()));

  }//main end

}
