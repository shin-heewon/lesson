package day9.section1;

public class StringSplitTokenizerEx {

  //String 클래스 : 문자열을 추출 split()
  public static void main(String[] args) {

    //public String[] split(String regex, int limit);
    //반환을 String 배열로 받는다.
    //구분 기호를 문자열이 아닌 정규표현식으로 받는다.

    String str1 = "mycaptain0771@gmaili.com";
    String[] splitch = str1.split("@");//@문자를 기준으로 잘라내겠다~
    int index = 1;
    for (String s : splitch) {// enhanced for:객체(배열)을 대상으로 for문 실행
      System.out.println(index + " " + s);
      index++;
    }

    for (int i = 0; i < splitch.length; i++) {
      System.out.println(i + " " + splitch[i]);
      System.out.printf("%d : %s \n", i + 1, splitch[i]);
    }

    String str2 = "mycaptain0771@gamil.com@http://github.com/thatzcool@notion.so/thatzcool";

    String[] splitch1 = str2.split("@", 4);
    index = 0;
    for (String s : splitch1) {// enhanced for:객체(배열)을 대상으로 for문 실행
      System.out.println(index + " " + s);
      index++;
    }

    index = 0;
    String str3 = "ssg-in&c%https://github.com";
    String[] result1 = str3.split("[-&%]");//문자열을 자를 기준 문자를 배열 형태로 지정하여 split할 수도 있음
    for (String i : result1) {
      System.out.println(index + " : " + i);
      index++;
    }

    System.out.println("============================================");
    index = 0;
    String str4 = "ssg in c https://github.com";
    String[] result2 = str4.split(" ");//문자열을 자를 기준 문자를 배열 형태로 지정하여 split할 수도 있음
    for (String s : result2) {
      System.out.println(index + " : " + s);
      index++;
    }

    System.out.println("============================================");
    index = 0;
    String str5 = "ssg|in|c|https://github.com";
    String[] result3 = str5.split("\\|");
    //|가 regular expression이 아니기 때문에(특수기호이기 때문에) 알맞게 나오게 하려면 이스케이프 처리(\\붙이기) 필요
    for (String s : result3) {
      System.out.println(index + " : " + s);
      index++;
    }
    System.out.println("============================================");

    //java.util.StringTokenizer클래스와 String.split() 차이점-> notion(3-1) 참고

  }

}
