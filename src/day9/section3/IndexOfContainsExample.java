package day9.section3;

public class IndexOfContainsExample {

  public static void main(String[] args) {
    String subject = "자바 객체 프로그래밍 과목입니다.";

    //1. 문제에서 "객체 프로그래밍" 문자열을 저장하여 출력하세요
    String str1 = subject.substring(subject.indexOf("객"), subject.indexOf("밍") + 1);
    System.out.println(str1);

    //2. subject문자열에서 "프로그래밍" 문자열의 첫 인덱스를 저장하여 "프로그래밍 과목입니다." 문자열을 추출하여 출력하세요.
    System.out.println("=========================");
    int index1 = subject.indexOf("프");
    String str2 = subject.substring(index1);
    System.out.println(str2);

    int start = subject.indexOf("프로그래밍");
    System.out.println(subject.substring(start));

    //3. subject 문자열에서 "자바" 문자열이 있으면 "자바 관련 과목이군요!" 출력, 없으면 "자바와 관련 없는 과목이군요" 출력
    System.out.println("=========================");
    if (subject.contains("자바")) {
      System.out.println("자바 관련 과목이군요!");
    } else {
      System.out.println("자바와 관련 없는 과목이군요.");
    }

    //4. subject 에서 "자바"문자열이 포함되어 있는지 검사하고, 해당 문자열이 있으면 "자바 관련 과목이군요!" 출력, 없으면 "자바와 관련 없는 과목이군요." 출력
    System.out.println("=========================");
    String[] substr = subject.split(" ");
    for (String str : substr) {
      if (str.equals("자바")) {
        System.out.println("자바 관련 과목이군요!");
      } else {
        System.out.println("자바와 관련 없는 과목이군요.");
      }
    }
  }
}
