package day14.Inheritance.sec06.exam03;

public class Child extends Parent {

  //필드 선언
  public String field2;

  //메소드 선언
  public void method2() {
    super.method2();
    System.out.println("Child-method2()");
  }

  public void method3() {
    System.out.println("child-method3()");
  }
}