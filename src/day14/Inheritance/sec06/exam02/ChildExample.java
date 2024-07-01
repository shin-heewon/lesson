package day14.Inheritance.sec06.exam02;

public class ChildExample {

  public static void main(String[] args) {
    //자식 객체 생성
    Child child = new Child();

    //자동 타입 변환
    Parent parent = child;

    //메소드 호출
    parent.method1();
    parent.method2();
    //parent.method3(); -> 자식 객체의 필드인 method3() 접근 불가

    //parent = (Child)parent;//다운캐스팅
    //((Child) parent).method3();

  }
}