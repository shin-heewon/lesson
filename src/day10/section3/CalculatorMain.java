package day10.section3;

public class CalculatorMain {

  public static void main(String[] args) {

    //1. 계산기 한 개를 생성한다.
    Calculator cal = new Calculator();
    //2. 계산기의 전원을 켠다.
    cal.powerOn();

    //3. 두 개의 정수를 전달하여 결과값을 출력
    System.out.println("결과값 : " + cal.plus(1, 2));

    //4. 두 개의 실수를 전달하여 계산한 결과값을 출력
    System.out.println("결과 : " + cal.divide(50, 2));
    System.out.println("결과 : " + cal.divide(50, 0));

    //5. 전원 끄기
    cal.powerOff();

  }

}
