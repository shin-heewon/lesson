package day15.interfaceEx.sec06;

public interface Service {
  //클래스는 데이터 변경이 목적
  //인터페이스는 값 전달이 목적?

  //디폴트 메소드
  default void defaultMethod1() {
    System.out.println("나는 default Method11이고 구현부 실행!");
    defaultCommon();
  }

  default void defaultMethod2() {
    System.out.println("나는 default Method22이고 구현부 실행!");
  }

  //private 메소드
  private void defaultCommon() {
    System.out.println("나는 default common이고 중복 코드 A구현부 실행!");
  }


  //정적 메소드
  static void staticMethod1() {
    System.out.println("나는 staticMethod11이야.");
  }

  static void staticMethod2() {
    System.out.println("나는 staticMethod22이야.");
    staticCommon();
  }

  //private 정적 메소드
  private static void staticCommon() {
    System.out.println("나는 static Common이야.");
  }

}