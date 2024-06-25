package day10.section3;

public class Calculator {

  //리턴값이 없는 메소드 선언 :
  public void powerOn() {
    System.out.println("전원을 켭니다.");
  }

  public void powerOff() {
    System.out.println("전원을 끕니다.");
  }

  //호출할 때 두 정수를 전달받고 호출한 결과값을 int로 return하는 반환 메소드
  public int plus(int a, int b) {

    return a + b;
  }

  //호출 시 두 실수를 전달받고 두 값을 나누어 결과값을 double로 반환 메소드
  public double divide(double a, double b) {
    if (b == 0) {
      return 0;
    }

    return a / b;
  }

}
