package day14.Inheritance.sec06.exam02;

//부모 타입으로 promotion이 된 이후에는 부모 클래스에 선언된 필드와 메소드만 접근이 가능하다!

public class Child extends Parent {

  //메소드 오버라이딩


  @Override
  public void method2() {
    System.out.println("Child의 method2()");
  }

  public void method3() {
    System.out.println("Child의 method3()");
  }


}