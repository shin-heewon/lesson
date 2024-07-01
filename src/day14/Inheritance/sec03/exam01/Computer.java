package day14.Inheritance.sec03.exam01;

public class Computer extends Calculator {

  //메소드 오버라이딩(단축키 ctrl + o)


  @Override//어노테이션:빠르게 실행 가능함, 안 붙여도 됨, 사용자 정의 어노테이션도 만들 수 있음
  public double areaCircle(double radius) {
    System.out.println("Computer의 areaCircle() 실행!");//super클래스와 다름 => 메소드 재정의

    double area = super.areaCircle(radius);
    System.out.printf("부모의 areaCircle() 실행 결과 %.2f\n", area);

    return radius * radius * Math.PI;
  }
}