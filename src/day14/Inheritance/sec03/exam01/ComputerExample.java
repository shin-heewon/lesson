package day14.Inheritance.sec03.exam01;

public class ComputerExample {

  public static void main(String[] args) {

    int radius = 10;

    Calculator calculator = new Calculator();
    //System.out.println("원의 면적 : " + calculator.areaCircle(radius));
    System.out.printf("원의 면적 %.2f: \n", calculator.areaCircle(radius));//%.2f는 소수점 세번째 자리에서 반올림

    System.out.println("===========UpCasting============");

    Calculator calculator1 = new Computer();
    double area = calculator1.areaCircle(20);
    System.out.printf("원의 면적 : %.2f", area);
  }
}